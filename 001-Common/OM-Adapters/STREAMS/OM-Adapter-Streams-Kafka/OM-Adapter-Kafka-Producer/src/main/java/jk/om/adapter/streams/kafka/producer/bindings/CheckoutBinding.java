package jk.om.adapter.streams.kafka.producer.bindings;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface CheckoutBinding {

	String CHECKOUT_IN = "checkout_order_requests_in";

	String CHECKOUT_OUT = "checkout_order_requests_out";

	@Output(CHECKOUT_OUT)
	MessageChannel checkOutOUT();

}
