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

import com.OzenTemizlik.projem.model.ToDoLists;
import com.OzenTemizlik.projem.requests.ListUpdateRequest;
import com.OzenTemizlik.projem.requests.ListsCreateRequest;
import com.OzenTemizlik.projem.service.ToDoListService;

@RestController
@RequestMapping("/lists")
public class ToDoListController {

	ToDoListService toDoListService;

	public ToDoListController(ToDoListService toDoListService) {
		
		this.toDoListService = toDoListService;
	}
	@GetMapping
	public List<ToDoLists> getAllList(@RequestParam Optional <Long> user_id){
		return toDoListService.getAllWithParam(user_id);
	}
	@PostMapping("/{lists}")
	public ToDoLists createList(@RequestBody ListsCreateRequest request) {
		return toDoListService.createList(request);
		
	}
	@PutMapping("/{lists}")
	public ToDoLists updateOneLists(@PathVariable Long list_id, @RequestBody ListUpdateRequest request ) {
		return toDoListService.updateOneListsById(list_id,request);
	}
	
	@DeleteMapping("/{lists}")
	public void deleteOneLists(@PathVariable Long list_id) {
		toDoListService.deleteOneListsById(list_id);
	}
	
	
}
