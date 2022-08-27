package com.OzenTemizlik.projem.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.OzenTemizlik.projem.model.User;
import com.OzenTemizlik.projem.service.UserService;



@RestController
@RequestMapping("/user")
public class UserController {

	UserService userService;

	public UserController(UserService userService) {
		
		this.userService = userService;
	}
	
	@GetMapping
	public List<User> getAllUser(){
		return userService.getAllUser();
	}
	
	

	@GetMapping("/{user_id}")
	
	public User getOneUser(@PathVariable Long user_id ) {
		return userService.getOneUser(user_id);
	}
	
	@PostMapping
	public User createUser(@RequestBody User newUser) {
		return userService.saveOneUser(newUser);
	}
	
	@PutMapping("/{user_id}")
	public User upDateUser(@PathVariable Long user_id , @RequestBody User newUser) {
	
		
		return userService.updateUser(user_id,newUser);
	}
	@DeleteMapping
	public void deleteUser(@PathVariable Long user_id ) {
		userService.deleteById(user_id);
		 
    }
	
}