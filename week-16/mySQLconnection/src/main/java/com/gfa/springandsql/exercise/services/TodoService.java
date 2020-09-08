package com.gfa.springandsql.exercise.services;


import com.gfa.springandsql.exercise.model.Todo;

import java.util.List;

public interface TodoService {
    public List<Todo> getTasks();
    public void addTask(Todo todo);
    public List<Todo> getCompleteTasks();
    public void removeTask(Long id);
}
