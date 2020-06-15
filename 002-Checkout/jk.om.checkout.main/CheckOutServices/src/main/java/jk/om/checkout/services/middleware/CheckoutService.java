package jk.om.checkout.services.middleware;

import jk.om.common.dto.OrderRequetInfo;

public interface CheckoutService {

	public void createOrder(OrderRequetInfo orderRequetInfo) throws Exception;

}
