package com.FlightBookingSystem.FlightPayment.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.FlightBookingSystem.FlightPayment.model.Payment;


public interface PaymentRepo extends MongoRepository<Payment, Integer> {

}
