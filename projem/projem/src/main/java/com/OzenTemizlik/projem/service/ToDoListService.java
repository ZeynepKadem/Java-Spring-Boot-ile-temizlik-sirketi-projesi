package com.OzenTemizlik.projem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.OzenTemizlik.projem.model.Employe;
import com.OzenTemizlik.projem.model.ToDoLists;
import com.OzenTemizlik.projem.model.User;
import com.OzenTemizlik.projem.repository.ToDoListsRepos;
import com.OzenTemizlik.projem.requests.ListUpdateRequest;
import com.OzenTemizlik.projem.requests.ListsCreateRequest;

@Service
public class ToDoListService {

	ToDoListsRepos toDoListsRepos;
	UserService userService;
	EmployeService employeService;
	
	
	public ToDoListService(ToDoListsRepos toDoListsRepos, UserService userService, EmployeService employeService) {
		
		this.toDoListsRepos = toDoListsRepos;
		this.userService = userService;
		this.employeService = employeService;
	}


	public List<ToDoLists> getAllWithParam(Optional<Long> user_id) {
		if(user_id.isPresent()) {
			return toDoListsRepos.findByUserId(user_id.get());
			
		}else 
			return toDoListsRepos.findAll();
			
			
		}
		public ToDoLists createList(ListsCreateRequest request) {
		User user = userService.getOneUser(request.getUser_id());
		Employe employe =employeService.getOneEmployeById(request.getEmploye_id());
		
		if(user!=null && employe!=null) {
			ToDoLists listToSave = new ToDoLists();
			/*listToSave.setList_id(request.getList_id());
			listToSave.setDescription(request.getDescription());
			listToSave.setTitle(request.getTitle());
			
			listToSave.setEmploye(employe);
			listToSave.setUser(user);
			*/
			return toDoListsRepos.save(listToSave);
			
		}else
			return null;
		}


		public ToDoLists updateOneListsById(Long list_id , ListUpdateRequest request) {
			
			Optional <ToDoLists> toDoLists = toDoListsRepos.findById(list_id);
			if(toDoLists.isPresent()) {
				ToDoLists listToUpdate = toDoLists.get();	
				//listToUpdate.setDescription(request.getDescription());
				//listToUpdate.setTitle(request.getTitle());
				return toDoListsRepos.save(listToUpdate);
				
				
			}else
				return null;
		}


		public void deleteOneListsById(Long list_id) {
			toDoListsRepos.deleteById(list_id);
			
		}

	
}

	
