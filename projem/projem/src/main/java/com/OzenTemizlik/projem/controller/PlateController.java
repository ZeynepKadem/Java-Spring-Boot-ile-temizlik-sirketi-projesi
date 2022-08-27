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

import com.OzenTemizlik.projem.model.Plate;

import com.OzenTemizlik.projem.requests.PlateCreateRequest;
import com.OzenTemizlik.projem.requests.PlateUpdateRequest;
import com.OzenTemizlik.projem.service.PlateService;

@RestController
@RequestMapping("/plate")

public class PlateController {

	PlateService plateService;

	public PlateController(PlateService plateService) {
		
		this.plateService = plateService;
	}
	
	@GetMapping
	public List<Plate> getAllPlate(){
		return plateService.getAllPlate();
	}
	
    @GetMapping("/{plate_id}")
	
	public Plate getOnePlate(@PathVariable Long id ) {
		return plateService.getOnePlate(id);
	}
    
    @PostMapping
	public Plate createPlate(@RequestBody PlateCreateRequest newPlateRequest ) {
		return plateService.createEmploye(newPlateRequest);
	}	
    
    @PutMapping("/{plate_id}")
	public Plate updateOneEmploye(@PathVariable Long id, @RequestBody PlateUpdateRequest updatePlate){
			return plateService.updateOnePlateById(id,updatePlate);
	}

	public PlateService getPlateService() {
		return plateService;
	}
	public PlateService setPlateService() {
		return plateService;
	}
	
	@DeleteMapping("/{plate_id}")
	public void deleteOnePlate(@PathVariable Long id) {
		plateService.deleteOnePlateById(id);
		
	}


}
