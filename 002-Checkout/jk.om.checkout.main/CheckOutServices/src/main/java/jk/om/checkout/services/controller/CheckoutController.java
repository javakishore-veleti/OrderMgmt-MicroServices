package jk.om.checkout.services.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jk.om.checkout.services.middleware.CheckoutService;
import jk.om.common.constants.ApiConstants;
import jk.om.common.dto.ServiceResponse;
import jk.om.common.dto.OrderRequetInfo;

@RestController("/api/order-mgmt/services/checkout")
@RequestMapping(path = "/api/order-mgmt/services/checkout", consumes = "application/json", produces = "application/json")
public class CheckoutController {

	@Autowired
	private CheckoutService checkoutService;

	@PostMapping(path = "create-order")
	public ResponseEntity<ServiceResponse> createOrder(@RequestBody OrderRequetInfo orderReqInfo) throws Exception {

		ServiceResponse serviceResponse = new ServiceResponse();
		serviceResponse.addResponse(ApiConstants.MODEL_PRIMARY_KEY, 0);

		checkoutService.createOrder(orderReqInfo, serviceResponse);

		return ResponseEntity.ok(serviceResponse);
	}

}
