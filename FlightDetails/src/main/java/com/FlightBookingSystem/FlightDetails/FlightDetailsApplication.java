package com.FlightBookingSystem.FlightDetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.FlightBookingSystem.FlightDetails.model.FlightDetails;
import com.FlightBookingSystem.FlightDetails.repository.FlightRepo;

@SpringBootApplication
@EnableEurekaClient
public class FlightDetailsApplication implements CommandLineRunner{

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	@Autowired
	public FlightRepo repository;
	
	public static void main(String[] args) {
		SpringApplication.run(FlightDetailsApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		FlightDetails f1 = new FlightDetails(1, "Pune", "Delhi", 30, 4000, "07-July-2021");
		FlightDetails f2 = new FlightDetails(5, "Pune", "Jaipur", 30, 5000, "07-July-2021");

		
		repository.save(f1);
		repository.save(f2);
		
		
		System.out.println("***");
		
		
		List<FlightDetails> flightDetails = repository.findAll();
		for (FlightDetails f : flightDetails) {
			System.out.println(f.toString());
		}


	}


	
}
