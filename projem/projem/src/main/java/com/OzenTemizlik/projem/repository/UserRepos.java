package com.OzenTemizlik.projem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.OzenTemizlik.projem.model.User;

@Repository
public interface UserRepos extends JpaRepository<User, Long> {

	
}
