package com.FlightBookingSystem.SecurePassenger.repository;
import com.FlightBookingSystem.SecurePassenger.model.User;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepo extends MongoRepository<User, Integer>{

	public User findByusername (String username);

	


	public Optional<User> findByPassword(String password);

	/*
	 * public User findByEmailId(String emailId); //Optional<Passenger>
	 * findByirstName(String firstName);
	 * 
	 * public User findByEmailIdAndPassword(String emailId, String password);
	 */



}
