package com.OzenTemizlik.projem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.OzenTemizlik.projem.model.Login;

@Repository

public interface LoginRepos extends JpaRepository<Login, Long> {
	Login findByUserNameAndPassword(String userName, String password);
	
	

}
