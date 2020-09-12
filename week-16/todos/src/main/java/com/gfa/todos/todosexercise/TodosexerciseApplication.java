package com.gfa.todos.todosexercise;

import com.gfa.todos.todosexercise.model.Todo;
import com.gfa.todos.todosexercise.repositories.TodoRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodosexerciseApplication implements CommandLineRunner {

    private final TodoRepo todoRepo;

    public TodosexerciseApplication(TodoRepo todoRepo){
        this.todoRepo = todoRepo;
    }

    public static void main(String[] args) {
        SpringApplication.run(TodosexerciseApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepo.save(new Todo("Eat"));
        todoRepo.save(new Todo("Sleep"));
        todoRepo.save(new Todo("Watch TV"));
        todoRepo.save(new Todo("Run"));
    }
}
