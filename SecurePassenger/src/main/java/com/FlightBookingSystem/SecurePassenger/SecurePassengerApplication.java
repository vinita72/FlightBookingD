package com.FlightBookingSystem.SecurePassenger;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;



@SpringBootApplication(exclude = {
		DataSourceAutoConfiguration.class, 
		DataSourceTransactionManagerAutoConfiguration.class,
		HibernateJpaAutoConfiguration.class
})
@CrossOrigin(origins ="*")
public class SecurePassengerApplication{
	
	private static final Logger Log =LoggerFactory.getLogger(SecurePassengerApplication.class);
	
	
	public static void main(String[] args) {
		
		Log.info("Application Started");
		SpringApplication.run(SecurePassengerApplication.class, args);
		
	}
	
	
	
	
	
}
	
	/*
	 * public void run(String... args) throws Exception { // TODO Auto-generated
	 * method stub
	 * 
	 * 
	 * User s1 = new User("7",
	 * "ravi","$2a$04$qfQfLnh79PUog6nwmO7noOY1azw4tPYGKvKCR8NXYyHvJD2fKhPt6",
	 * "ravi@gmail.com"); User s2 = new User("9", "Vachi",
	 * "$2a$04$3jankoGXp6uTBk5ZGrHOYO6AGo.WX31.s6kXeUWmPwN7vqB7AlpLy",
	 * "vachi@gmail.com");
	 * 
	 * 
	 * repository.save(s1); repository.save(s2);
	 * 
	 * 
	 * System.out.println("***");
	 * 
	 * 
	 * List<User> users = repository.findAll(); for (User s : users) {
	 * System.out.println(s.toString()); }
	 * 
	 * }
	 */

	
	




	
	