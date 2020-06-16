package jk.om.checkout.services.middleware;

import jk.om.common.dto.OrderRequetInfo;
import jk.om.common.dto.ServiceResponse;

public interface CheckoutService {

	public void createOrder(OrderRequetInfo orderRequetInfo, ServiceResponse serviceResponse) throws Exception;

}
