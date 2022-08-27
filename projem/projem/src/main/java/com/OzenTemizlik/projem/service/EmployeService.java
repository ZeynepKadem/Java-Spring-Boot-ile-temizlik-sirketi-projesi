package com.OzenTemizlik.projem.service;

import java.util.List;


import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.OzenTemizlik.projem.model.Employe;
import com.OzenTemizlik.projem.model.User;
import com.OzenTemizlik.projem.repository.EmployeRepos;
import com.OzenTemizlik.projem.requests.EmployeCreateRequest;
import com.OzenTemizlik.projem.requests.EmployeUpdateRequest;

@Service
public class EmployeService {

	EmployeRepos employeRepos;
	UserService userService;

	public EmployeRepos getEmployeRepos() {
		return employeRepos;
	}

	public void setEmployeRepos(EmployeRepos employeRepos,UserService userService) {
		this.employeRepos = employeRepos;
		this.userService=userService;
	}


	public List<Employe> getAllEmploye(Optional<Long> user_id) {
		if(user_id.isPresent()) {
			return employeRepos.findByUserId(user_id.get());
		}else {
			return employeRepos.findAll();
		}
	}

	public Employe getOneEmployeById(Long employe_id) {
		
		return employeRepos.findById(employe_id).orElse(null);
		
		
	}

	public Employe createEmploye (@RequestBody EmployeCreateRequest newEmployeRequest ) {
		
		User user = userService.getOneUser(newEmployeRequest.getUser_id());
		if (user==null)
			return null;
		Employe toSave= new Employe();
		toSave.setEmploye_id(newEmployeRequest.getEmploye_id());
		toSave.setFirstName(newEmployeRequest.getFirstName());
		toSave.setLastName(newEmployeRequest.getLastName());
		toSave.setPhoneNumber(newEmployeRequest.getPhoneNumber());
		toSave.setUserId(user.getId());
		return employeRepos.save(toSave);
		
	}


	public void deleteOneEmployeById(Long employe_id) {
		employeRepos.deleteById(employe_id);
		
	}

	public Employe updateOneEmployeById(Long employe_id, EmployeUpdateRequest updateEmploye) {
		Optional <Employe> employe = employeRepos.findById(employe_id);
		if(employe.isPresent()) {
			Employe toUpdate =employe.get();
			toUpdate.setFirstName(updateEmploye.getFirstName());
			toUpdate.setLastName(updateEmploye.getLastName());
			toUpdate.setPhoneNumber(updateEmploye.getPhoneNumber());
			
			employeRepos.save(toUpdate);
			return toUpdate;
		}
		return null;
		
	}
	
	
	
	
	
	
}
