package com.gfa.springandsql.exercise.repositories;

import com.gfa.springandsql.exercise.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepo extends JpaRepository<Todo, Long> {

}
