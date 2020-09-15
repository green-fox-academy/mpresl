package com.gfa.springandsql.exercise.services;

import com.gfa.springandsql.exercise.model.Assignee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AssigneeService {
    Assignee findById(Long id);

    List<Assignee> findAll();
    public void update(Assignee assignee);
    public void save(Assignee assignee);
    public void remove(Long id);
}
