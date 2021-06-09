package com.FlightBookingSystem.FlightDetails.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.FlightBookingSystem.FlightDetails.model.FlightDetails;

public interface FlightRepo extends MongoRepository<FlightDetails, Integer>  {

}

