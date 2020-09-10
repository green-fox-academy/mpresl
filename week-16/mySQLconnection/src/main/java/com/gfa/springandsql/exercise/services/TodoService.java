package com.gfa.springandsql.exercise.services;


import com.gfa.springandsql.exercise.model.Todo;

import java.util.List;

public interface TodoService {
    public List<Todo> getTasks();
    public void addTask(Todo todo);
    public Todo findTask(long id);
    public List<Todo> getIncompleteTasks();
    public void removeTask(Long id);
    public void update(Todo todo);
}
