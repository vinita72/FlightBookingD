package com.FlightBookingSystem.FlightDetails.controller;

import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

//import com.FlightBookingSystem.FlightDetails.common.Payment;
//import com.FlightBookingSystem.FlightDetails.common.TransactionRequest;
//import com.FlightBookingSystem.FlightDetails.common.TransactionResponse;
import com.FlightBookingSystem.FlightDetails.model.FlightDetails;
import com.FlightBookingSystem.FlightDetails.model.Passenger;
import com.FlightBookingSystem.FlightDetails.model.Payment;
import com.FlightBookingSystem.FlightDetails.service.FlightService;

		
@RestController
@RequestMapping("/flight")
public class FligthController {

	
	@Autowired
	private FlightService service;
	
	
	@Autowired
    private RestTemplate restTemplate;
	
	
		@RequestMapping("{/id}")
	  public List<FlightDetails> getFlight(@PathVariable("id") String id){
	  Passenger passenger =
	  restTemplate.getForObject("http://FlightPassenger/passenger//findAllPassenger" +id,
	  Passenger.class);
	  
	  return passenger.getPassAccount().stream().map(passAcconut->{
		  Payment payment = restTemplate.getForObject("http://FlightPayment/payment/doPayment",
					  Payment.class);
			  			return new FlightDetails(passenger.getEmailId(), passenger.getFirstName(),
						  payment.getPaymentStatus());	  
	 
	  })
			.collect(Collectors.toList());

	  }
	 

}



/*
 * @GetMapping() public String hello() { String url =
 * "http://FlightPassenger/passenger/Pass"; return
 * restTemplate.getForObject(url, String.class);
 * 
 * }
 * 
 * @GetMapping("/hey") public String hey() { String url1 =
 * "http://FlightPayment/payment/doPayment"; return
 * restTemplate.getForObject(url1, String.class); }
 */


/*
 * @PostMapping("/bookFlight") public TransactionResponse
 * bookFlightDetails(@RequestBody TransactionRequest request) {
 * 
 * return service.saveFlightDetails(request); }
 * 
 *  return new FlightDetails(payment.getPaymentStatus(), payment.gettTansactionId, passenger.getFirstName());
	})
			
			.collection(Collectors.toList());
 */

//http://FlightPassenger/payment/doPayment
//   http://PassengerDetails/registerpassenger
