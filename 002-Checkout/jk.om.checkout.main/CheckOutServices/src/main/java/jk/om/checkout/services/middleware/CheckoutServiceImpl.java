package jk.om.checkout.services.middleware;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jk.om.common.constants.ApiConstants;
import jk.om.common.constants.CheckoutEvents;
import jk.om.common.dao.OrderRequestDAO;
import jk.om.common.dao.OrderRequestLineItemDAO;
import jk.om.common.domain.OrderRequest;
import jk.om.common.domain.OrderRequestLineItem;
import jk.om.common.dto.CrudServiceUpdateInfo;
import jk.om.common.dto.OrderRequetInfo;
import jk.om.common.dto.ServiceResponse;
import jk.om.common.pubsub.CrudServiceListenerRegistry;

@Service("CheckoutService")
public class CheckoutServiceImpl implements CheckoutService {

	@SuppressWarnings("rawtypes")
	@Autowired
	private OrderRequestDAO orderRequestDAO;

	@SuppressWarnings("rawtypes")
	@Autowired
	private OrderRequestLineItemDAO orderRequestLineItemDAO;

	@Autowired
	private CrudServiceListenerRegistry serviceListenerRegistry;

	@SuppressWarnings("unchecked")
	@Override
	public void createOrder(OrderRequetInfo orderRequetInfo, ServiceResponse serviceResponse) throws Exception {

		if (orderRequestDAO != null) {

			OrderRequest orderRequestUpdated = (OrderRequest) this.orderRequestDAO
					.persistBaseDomain(orderRequetInfo.getOrderRequest());

			Long orderId = orderRequestUpdated.getId();

			for (OrderRequestLineItem ordReqLineItem : orderRequetInfo.getItems()) {

				ordReqLineItem.setParentId(orderId);
				this.orderRequestLineItemDAO.persistBaseDomain(ordReqLineItem);
			}

			serviceResponse.addResponse(ApiConstants.MODEL_PRIMARY_KEY, orderRequestUpdated.getId());

			this.serviceListenerRegistry.invokeCrudServiceListeners(CheckoutEvents.ORDER_REQUEST_CREATED,
					new CrudServiceUpdateInfo<OrderRequest>(orderRequetInfo.getOrderRequest()));
		}

	}

}
