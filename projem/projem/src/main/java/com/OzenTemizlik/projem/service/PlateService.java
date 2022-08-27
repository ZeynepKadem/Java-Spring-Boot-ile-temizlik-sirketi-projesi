package com.OzenTemizlik.projem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.OzenTemizlik.projem.model.Plate;
import com.OzenTemizlik.projem.model.User;
import com.OzenTemizlik.projem.repository.PlateRepos;

import com.OzenTemizlik.projem.requests.PlateCreateRequest;
import com.OzenTemizlik.projem.requests.PlateUpdateRequest;

@Service
public class PlateService {
	
	PlateRepos plateRepos;
	UserService userService;

	public PlateService(PlateRepos plateRepos, UserService userService) {
		
		this.plateRepos = plateRepos;
		this.userService = userService;
	}

	public List<Plate> getAllPlate() {
		return plateRepos.findAll();
	}

	public Plate getOnePlate(Long id) {
		return plateRepos.findById(id).orElseThrow(() -> new RuntimeException(String.format("%f id'li plaka bulunamadı!", id)));
		 
	}

	public Plate createEmploye(@RequestBody PlateCreateRequest newPlateRequest) {
		
		User user = userService.getOneUser(newPlateRequest.getUser_id());
		if (user==null)
			return null;
		Plate toSave= new Plate(null, null, null, null);
		toSave.setEmploye_id(newPlateRequest.getEmploye_id());
		toSave.setUser_id(newPlateRequest.getUser_id());
		toSave.setDate(newPlateRequest.getDate());
		toSave.setId(user.getId());
		return plateRepos.save(toSave);
	}

	public Plate updateOnePlateById(Long id, PlateUpdateRequest updatePlate) {
		Optional <Plate> plate = plateRepos.findById(id);
		if(plate.isPresent()) {
			Plate toUpdate =plate.get();
			toUpdate.setEmploye_id(updatePlate.getEmploye_id());

			toUpdate.setDate(updatePlate.getDate());
			
			plateRepos.save(toUpdate);
			return toUpdate;
		}
		return null;
	}

	public void deleteOnePlateById(Long id) {
		plateRepos.deleteById(id);
		
	}


}
