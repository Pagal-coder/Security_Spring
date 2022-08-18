package com.Security.Springbootsecuritylearn.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Security.Springbootsecuritylearn.Models.User;

@Service
public class UserServices {
	
	List<User> list=new ArrayList<>();
	
	public UserServices() {
	
		list.add(new User( "pankaj", "123", "p@gmail.com"));
		list.add(new User("pankaj Rawat","12345","p@gmail.com"));

		
	}
	
	public List<User> getUsers(){
		return this.list;
	}
	
	public User getUser(String userName) {
		return this.list.stream().filter((user)-> user.getUserName().equals(userName)).findAny().orElse(null);
	}
	
	public User addUser(User user) {
		
		this.list.add(user);
		return user;
	}

}
