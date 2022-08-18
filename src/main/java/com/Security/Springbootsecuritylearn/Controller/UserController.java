package com.Security.Springbootsecuritylearn.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Security.Springbootsecuritylearn.Models.User;
import com.Security.Springbootsecuritylearn.Services.UserServices;


@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserServices userService;
	
	@GetMapping("/")
	public  List<User> getUsers(){
		return this.userService.getUsers();
		
	}
	
	@GetMapping("/{userName}")
	public User getUser(@PathVariable("userName") String userName){
		return this.userService.getUser(userName);
		
	}
	
	@PostMapping("/")
	public User add(@RequestBody User user) {
		
		return this.userService.addUser(user);
	}
	
	

}
