package com.gfa.springandsql.exercise.services;

import com.gfa.springandsql.exercise.model.Todo;
import com.gfa.springandsql.exercise.repositories.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoServiceImpl implements TodoService {
    public final TodoRepo todoRepo;


    @Autowired
    public TodoServiceImpl(TodoRepo todoRepo){
        this.todoRepo = todoRepo;
    }

    @Override
    public List<Todo> getTasks() {
        return todoRepo.findAll();
    }

    @Override
    public void addTask(Todo todo) {
        todoRepo.save(todo);
    }

    @Override
    public Todo findTask(long id) {
        return todoRepo.findById(id).get();
    }

    @Override
    public List<Todo> getIncompleteTasks() {
        return todoRepo.findAll().stream()
                .filter(todo -> !todo.isDone())
                .collect(Collectors.toList());
    }

    @Override
    public void removeTask(Long id) {
        todoRepo.delete(todoRepo.findById(id).get());
    }

    @Override
    public void update(Todo todo) {
        todoRepo.save(todo);
    }

    @Override
    public List<Todo> searchTasks(String terms) {
        return todoRepo.findAll().stream()
                .filter(task -> task.getTitle().toLowerCase().contains(terms.toLowerCase()))
                .collect(Collectors.toList());
    }
}
