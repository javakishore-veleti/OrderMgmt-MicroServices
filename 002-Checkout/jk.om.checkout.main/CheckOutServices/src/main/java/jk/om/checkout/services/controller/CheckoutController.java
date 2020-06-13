package jk.om.checkout.services.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jk.om.common.constants.ApiConstants;
import jk.om.common.dto.ApiResponse;
import jk.om.common.dto.OrderRequetInfo;

@RestController("/api/order-mgmt/services/checkout")
@RequestMapping(path = "/api/order-mgmt/services/checkout", consumes = "application/json", produces = "application/json")
public class CheckoutController {

	@PostMapping(path = "create-order")
	public ResponseEntity<ApiResponse> createOrder(@RequestBody OrderRequetInfo orderReqInfo) {

		return ResponseEntity.ok(new ApiResponse().addResponse(ApiConstants.MODEL_PRIMARY_KEY, 0));
	}

}
