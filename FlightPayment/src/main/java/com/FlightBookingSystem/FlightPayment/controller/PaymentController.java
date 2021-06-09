package com.FlightBookingSystem.FlightPayment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FlightBookingSystem.FlightPayment.model.Payment;
import com.FlightBookingSystem.FlightPayment.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	
	@GetMapping("/doPayment")
	public String Hello() {
		return "Hello Payment";
	}

	/*
	 * @Autowired private PaymentService service;
	 * 
	 * @PostMapping("/doPayment") public Payment doPayment(@RequestBody Payment
	 * payment) { return service.doPayment(payment); }
	 */
	
}
