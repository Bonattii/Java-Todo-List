package com.todolistfinalproject.todolistfinalproject.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todolistfinalproject.todolistfinalproject.entities.TodoList;

public interface iTodoListRepository extends JpaRepository<TodoList, Integer> {
  @Override
  public List<TodoList> findAll();
}
