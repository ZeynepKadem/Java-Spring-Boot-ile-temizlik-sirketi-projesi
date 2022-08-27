package com.OzenTemizlik.projem.service;

import org.springframework.stereotype.Service;

import com.OzenTemizlik.projem.model.Login;
import com.OzenTemizlik.projem.repository.LoginRepos;

@Service
public class LoginService {
	LoginRepos loginRepos;
	 public Login login(String userName, String password) {
		 Login user =loginRepos.findByUserNameAndPassword(userName, password);
		 return user;
	 }

}
