package jk.om.adapter.streams.kafka.producer;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import jk.om.adapter.streams.kafka.producer.bindings.CheckoutBinding;
import jk.om.common.constants.CheckoutEvents;
import jk.om.common.domain.OrderRequest;
import jk.om.common.dto.CrudServiceUpdateInfo;
import jk.om.common.pubsub.CrudServiceListenerRegistry;
import jk.om.common.pubsub.services.CrudServiceListener;

@ConditionalOnProperty(name = "om.streams.kafka.enabled", havingValue = "true")
@Component("Kafka_CheckoutServiceProducer")
@EnableBinding(CheckoutBinding.class)
public class CheckoutServiceProducer implements CrudServiceListener<OrderRequest> {

	private static final Logger LOGGER = LoggerFactory.getLogger(CheckoutServiceProducer.class);

	@Autowired
	private CrudServiceListenerRegistry serviceListenerRegistry;

	@Autowired
	CheckoutBinding checkoutBinding;

	@Autowired
	private ObjectMapper objectMapper;

	@PostConstruct
	public void registerThisListener() throws Exception {
		LOGGER.info("Enter");

		this.serviceListenerRegistry.addCrudServiceListener(CheckoutEvents.ORDER_REQUEST_CREATED, this);
		this.serviceListenerRegistry.addCrudServiceListener(CheckoutEvents.ORDER_REQUEST_APPROVED, this);
		this.serviceListenerRegistry.addCrudServiceListener(CheckoutEvents.ORDER_REQUEST_UPDATED, this);
		this.serviceListenerRegistry.addCrudServiceListener(CheckoutEvents.ORDER_REQUEST_DELETED, this);

		LOGGER.info("Exit");
	}

	@Override
	public void handleEvent(String crudType, CrudServiceUpdateInfo<OrderRequest> serviceUpdateInfo) throws Exception {
		LOGGER.info("Enter crudType " + crudType);

		// avoid too much magic and transform ourselves
		String jsonMessage = objectMapper.writeValueAsString(serviceUpdateInfo);

		// wrap into a proper message for the transport (Kafka/Rabbit) and send it
		checkoutBinding.checkOutOUT().send(MessageBuilder.withPayload(jsonMessage).setHeader("type", crudType).build());

		LOGGER.info("Exit crudType " + crudType);
	}

}
