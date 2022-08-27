package com.OzenTemizlik.projem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.OzenTemizlik.projem.model.ToDoLists;

@Repository
public interface ToDoListsRepos extends JpaRepository <ToDoLists, Long> {

	List<ToDoLists> findByUserId(Long userId);

}
