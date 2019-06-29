package com.ibm.training.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	UserDao dao;

	String getUser(int id){
		return dao.getUser(id);
	}

//	public void addUser(com.ibm.training.users.User user, Integer id) {
//		dao.addUser(user, id);
//		
//	}

	public void updateUser(com.ibm.training.users.User user, Integer id) {
		dao.updateUser(user, id);
	}

	 List<com.ibm.training.users.User> getUsers() {
		
		return dao.getUsers();
	}

	public void deleteUser(Integer id) {
	 dao.deleteUser(id);
		
	}

	

	
}
