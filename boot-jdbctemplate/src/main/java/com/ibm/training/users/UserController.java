package com.ibm.training.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	UserService service;

	@RequestMapping("/users/{id}")
	String getUser(@PathVariable int id) {
		return service.getUser(id);
	}
//	@RequestMapping(method = RequestMethod.POST , value="/users{id}")
//	void addUser(@RequestBody com.ibm.training.users.User user, @PathVariable Integer id) {
//		 service.addUser(user, id);
//		
//	}
	@RequestMapping(method = RequestMethod.PUT, value="/users/{id}")
	void updateUser(@RequestBody com.ibm.training.users.User user ,@PathVariable Integer id) {
		service.updateUser(user, id);
		
	}
	@RequestMapping("/all")
	List<com.ibm.training.users.User> getUsers(){
		return service.getUsers();
		
	}
	@RequestMapping(method = RequestMethod.DELETE, value="/users/{id}")
	void deleteUser(@RequestBody @PathVariable Integer id) {
		service.deleteUser( id);
		
	}
	
	
	
}
