package com.OzenTemizlik.projem.controller;

import java.util.List;


import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.OzenTemizlik.projem.model.Employe;
import com.OzenTemizlik.projem.requests.EmployeCreateRequest;
import com.OzenTemizlik.projem.requests.EmployeUpdateRequest;
import com.OzenTemizlik.projem.service.EmployeService;


@RestController
@RequestMapping("/employes")
public class EmployesController {

	EmployeService employeService;

	public EmployeService getEmployeService() {
		return employeService;
	}

	public void setEmployeService(EmployeService employeService) {
		this.employeService = employeService;
	}
	
	
	@GetMapping
	public List <Employe> getAllEmployes(@RequestParam Optional <Long> user_id){
		return employeService.getAllEmploye(user_id);
		
	}
	@GetMapping ("/{employe_id}")
	public Employe getOneEmploye(@PathVariable Long employe_id) {
		return employeService.getOneEmployeById(employe_id);
	}
	

	@PostMapping
	public Employe createEmploye(@RequestBody EmployeCreateRequest newEmployeRequest ) {
		return employeService.createEmploye(newEmployeRequest);
	}	
		
	
	@PutMapping("/{employe_id}")
	public Employe updateOneEmploye(@PathVariable Long employe_id, @RequestBody EmployeUpdateRequest updateEmploye){
			return employeService.updateOneEmployeById(employe_id,updateEmploye);
	}
	@DeleteMapping("/{employe_id}")
	public void deleteOneEmploye(@PathVariable Long employe_id) {
		employeService.deleteOneEmployeById(employe_id);
		
	}
}
