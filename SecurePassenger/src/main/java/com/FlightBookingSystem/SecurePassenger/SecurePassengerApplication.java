package com.FlightBookingSystem.SecurePassenger;

import java.util.List;
import com.FlightBookingSystem.SecurePassenger.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.FlightBookingSystem.SecurePassenger.repository.UserRepo;


@SpringBootApplication
public class SecurePassengerApplication implements CommandLineRunner{
	@Autowired
	private UserRepo repository;
	
	public static void main(String[] args) {
		SpringApplication.run(SecurePassengerApplication.class, args);
		
	}
		public void run(String... args) throws Exception {
			// TODO Auto-generated method stub
			
			
			User s1 = new User(6, "ramra","$2a$04$DVZXitHA2Q4ehyUO2SKqGOIxSNeP/GxVFWtEuRktxLw32cKnWMnoK");
			User s2 = new User(5,"asklily", "$2a$04$prhYvk2noo5tkPcrUn9XqO4mheUkBSVq0RgR/ZdeN/VuyRPmlf4xK");

			
			repository.save(s1);
			repository.save(s2);
			
			
			System.out.println("***");
			
			
			List<User> users = repository.findAll();
			for (User s : users) {
				System.out.println(s.toString());
			}
		
	}

	
	
}



	
	