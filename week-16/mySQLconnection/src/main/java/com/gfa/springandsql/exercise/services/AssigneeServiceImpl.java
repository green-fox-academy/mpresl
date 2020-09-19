package com.gfa.springandsql.exercise.services;

import com.gfa.springandsql.exercise.model.Assignee;
import com.gfa.springandsql.exercise.repositories.AssigneeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssigneeServiceImpl implements AssigneeService {
    private final AssigneeRepository assigneeRepository;

    public AssigneeServiceImpl(AssigneeRepository assigneeRepository){
        this.assigneeRepository = assigneeRepository;
    }

    @Override
    public Assignee findById(Long id) {
        return assigneeRepository.findById(id).get();
    }

    @Override
    public List<Assignee> findAll() {
        return assigneeRepository.findAll();
    }

    @Override
    public void update(Assignee assignee) {
        assigneeRepository.save(assignee);
    }

    @Override
    public void save(Assignee assignee) {
        assigneeRepository.save(assignee);
    }

    @Override
    public void remove(Long id) {
    assigneeRepository.delete(assigneeRepository.findById(id).get());
    }
}
