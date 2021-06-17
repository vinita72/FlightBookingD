package com.FlightBookingSystem.SecurePassenger.controller;

import java.util.List;
import java.util.Optional;
import com.FlightBookingSystem.SecurePassenger.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FlightBookingSystem.SecurePassenger.repository.UserRepo;
import com.FlightBookingSystem.SecurePassenger.service.PassengerService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PassengerController {

	// @RequestMapping("/Pass")

	@Autowired
	private UserRepo repository;

	@Autowired
	private PassengerService service;

	@GetMapping("/")
	public String Hello() {
		return "Hello There";
	}
	
		@PostMapping("/registerpassenger") 
		String RegisterPassenger(@RequestBody User user) throws Exception { 
			String tempUserName = user.getUsername();
			
			
			if(tempUserName != null &&  !"".equals(tempUserName)) 
			{
				Optional<User> userObj =  service.getUserByUsername(tempUserName); 
			if(userObj != null) { throw new
		  Exception("Passenger with "+tempUserName+" is already exist"); 
			} 
			} 
			User userObj = null; userObj = service.saveUser(user); 
			
			return "Hi " + user.getUsername()+" your Registration process successfully completed";
		 }
		
		
	}

	/*
	 * @GetMapping("/AllPassengers") public List<User> findAllPassenger(){ return
	 * service.getUser(); }
	 * 
	 * @DeleteMapping("/deleteBy/{id}") public String deletePassenger(@PathVariable
	 * int id) { repository.deleteById(id); return "passenger deleted with id: "
	 * +id; }
	 * 
	 * @GetMapping("/AllPassenger/{id}") public Optional<User>
	 * getPassenger(@PathVariable int id){ return service.getUserById(id); }
	 * 
	 * 
	 * 
	 * @PutMapping("/updatepassenger/{id}") public ResponseEntity<?>
	 * saveResource(@RequestBody User user,
	 * 
	 * @PathVariable("id") String id) { service.saveUser(user); return
	 * ResponseEntity.ok("resource saved"); }
	 * 
	 * 
	 * 
	 * // fallback method
	 * 
	 * 
	 * @RequestMapping("/PassengerFall") public String readingList(){ return
	 * "Please wait"; }
	 * 
	 * 
	 * 
	 * 
	 * @PostMapping("/registerpassenger") public String
	 * RegisterPassenger(@RequestBody User passenger) throws Exception { String
	 * tempEmail = passenger.getEmailId(); if(tempEmail != null &&
	 * !"".equals(tempEmail)) { User passengerObj =
	 * service.fetchUserByEmailId(tempEmail); if(passengerObj != null) { throw new
	 * Exception("Passenger with "+tempEmail+" is already exist"); } } User
	 * passengerObj = null; passengerObj = service.saveUser(passenger); return "Hi "
	 * +
	 * passenger.getFirstName()+" your Registration process successfully completed";
	 * }
	 * 
	 * 
	 * 
	 * 
	 * @PostMapping("/loginhere") public String loginPassenger(@RequestBody User
	 * passenger) throws Exception{ String tempEmail = passenger.getEmailId();
	 * String tempPass = passenger.getPassword(); User passengerObj = null;
	 * if(tempEmail != null && tempPass!= null) { passengerObj =
	 * service.fetchUserByEmailIdAndPassword(tempEmail, tempPass); } if(passengerObj
	 * == null) { throw new Exception("Bad Credential"); } return "Welcome"; }
	 */


//		 @GetMapping("/user")
//		    public String user() {
//		        return ("<h1>Welcome User</h1>");
//		    }
//	
//		 @GetMapping("/")
//		    public String home() {
//		        return ("<h1>Welcome</h1>");
//		    }
//		@GetMapping("/findAllPassenger")
//		public List<Passenger> getPassenger(){
//			return repository.findAll();
//		}
//		
//		@GetMapping("/findAllPassenger/{id}")
//		public Optional<Passenger> getPassenger(@PathVariable int id){
//			return repository.findById(id);
//		}
//		
//		@DeleteMapping("/delete/{id}")
//		public String deletePassenger(@PathVariable int id) {
//			repository.deleteById(id);
//			return "passenger deleted with id: " +id;
//		}

/*
 * public String Pass() { return "Hello Pass"; }
 * 
 */
