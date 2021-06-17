package com.FlightBookingSystem.SecurePassenger.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import com.FlightBookingSystem.SecurePassenger.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.FlightBookingSystem.SecurePassenger.model.UserPrincipal;
import com.FlightBookingSystem.SecurePassenger.repository.UserRepo;

@Service
public class PassengerService implements UserDetailsService{
	
	@Autowired
	 private UserRepo repository;
	
		/*
		 * @GetMapping("/findAllPassenger") public List<Passenger> getPassenger(){
		 * return repository.findAll(); }
		 * 
		 * @GetMapping("/findAllPassenger/{id}") public Optional<Passenger>
		 * getPassenger(@PathVariable int id){ return repository.findById(id); }
		 * 
		 * @DeleteMapping("/delete/{id}") public String deletePassenger(@PathVariable
		 * int id) { repository.deleteById(id); return "passenger deleted with id: "
		 * +id; }
		 */
  
		/*
		 * public List<User> getUser(){ return repository.findAll(); }
		 * 
		 * public Optional<User> getUserById(@PathVariable int id){ return
		 * repository.findById(id); }
		 * 
		 * 
		 public User saveUser(User user) { return repository.save(user); }
		 * 
		 * public User fetchUserByEmailId(String emailId) { return
		 * repository.findByEmailId(emailId); }
		 * 
		 * public User fetchUserByEmailIdAndPassword(String emailId, String password) {
		 * return repository.findByEmailIdAndPassword(emailId, password); }
		 */
	
	
		@Override
		public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
			
		User user = (User) repository.findByusername(username);
			if(user==null)
				throw new UsernameNotFoundException("User 404");
			
			return new UserPrincipal(user);
		}

		
		 public User saveUser(User user) {
			 return repository.save(user); 
			 }

		 public Optional<User> getUserByUsername(@PathVariable String password){
			 return  repository.findByPassword(password); }
				  
		
		}
		
	

//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		// TODO Auto-generated method stub
//		Optional<Passenger> passenger = PassengerRepo.findByirstName(username);
//
//		passenger.orElseThrow(() -> new UsernameNotFoundException("Not found: " + username));
//
//        return passenger.map(Passenger::new).get();	}
//}
