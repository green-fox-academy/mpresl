package com.gfa.todos.todosexercise.services;

import com.gfa.todos.todosexercise.model.Todo;
import com.gfa.todos.todosexercise.repositories.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoServiceImpl implements TodoService {
    public final TodoRepo todoRepo;


    @Autowired
    public TodoServiceImpl(TodoRepo todoRepo){
        this.todoRepo = todoRepo;

        todoRepo.save(new Todo("Do laundry"));

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
    public List<Todo> getCompleteTasks() {
        return todoRepo.findAll().stream()
                .filter(todo -> todo.isDone())
                .collect(Collectors.toList());
    }

    @Override
    public void removeTask(Long id) {
        todoRepo.delete(todoRepo.findById(id).get());
    }
}
