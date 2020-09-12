package com.gfa.todos.todosexercise.repositories;

import com.gfa.todos.todosexercise.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepo extends JpaRepository<Todo, Long> {

}
