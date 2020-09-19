package com.gfa.springandsql.exercise.repositories;

import com.gfa.springandsql.exercise.model.Assignee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssigneeRepository extends JpaRepository <Assignee, Long>{
}
