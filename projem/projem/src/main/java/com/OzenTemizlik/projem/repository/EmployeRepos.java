package com.OzenTemizlik.projem.repository;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.OzenTemizlik.projem.model.Employe;

@Repository
public interface EmployeRepos extends JpaRepository<Employe, Long> {

	List<Employe> findByUserId(Long user_id);
}
