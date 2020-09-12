package com.gfa.todos.todosexercise.services;

import com.gfa.todos.todosexercise.model.Todo;

import java.util.List;

public interface TodoService {
    public List<Todo> getTasks();
    public void addTask(Todo todo);
    public List<Todo> getCompleteTasks();
    public void removeTask(Long id);
}
