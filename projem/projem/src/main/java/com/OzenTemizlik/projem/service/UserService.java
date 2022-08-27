package com.OzenTemizlik.projem.service;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.OzenTemizlik.projem.model.User;
import com.OzenTemizlik.projem.repository.UserRepos;

@Service
public class UserService {

	UserRepos userRepos;

	


	public UserService(UserRepos userRepos) {
		
		this.userRepos = userRepos;
	}


	public List<User> getAllUser() {
		
		return userRepos.findAll();
	}

	
	public void deleteById(Long user_id) {
		userRepos.deleteById(user_id);
		
		
	}
	

	public User updateUser(@PathVariable Long user_id, @RequestBody User newUser) {
	
		Optional <User> user = userRepos.findById(user_id);
		if(user.isPresent()) {
			User foundUser = user.get();
			foundUser.setUserName(newUser.getUserName());
			foundUser.setPassword(newUser.getPassword());
			
			userRepos.save(foundUser);
			return foundUser;
			
			
		
		} else {
				 return null;
			 }
	}

	public User saveOneUser(User newUser) {
		
		return userRepos.save(newUser);
	}
	
	
	
	public User getOneUser(Long user_id) {
		return userRepos.findById(user_id).orElse(null);
	}

	public UserRepos getUserRepos() {
		return userRepos;
	}

	public void setUserRepos(UserRepos userRepos) {
		this.userRepos = userRepos;
	}

}




	


