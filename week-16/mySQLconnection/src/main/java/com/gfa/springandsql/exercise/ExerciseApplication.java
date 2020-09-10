package com.gfa.springandsql.exercise;

import com.gfa.springandsql.exercise.model.Todo;
import com.gfa.springandsql.exercise.repositories.TodoRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExerciseApplication {
//    implements CommandLineRunner{
//    private final TodoRepo todoRepo;
//
//    public ExerciseApplication(TodoRepo todoRepo){
//        this.todoRepo = todoRepo;
//    }


    public static void main(String[] args) {
        SpringApplication.run(ExerciseApplication.class, args);
    }

//    @Override
//    public void run(String... args) throws Exception {
//        todoRepo.save(new Todo("Eat", false,false));
//        todoRepo.save(new Todo("Walk the dog", true,false));
//        todoRepo.save(new Todo("sleep", false,true));
//        todoRepo.save(new Todo("Go shopping", false,false));
//        todoRepo.save(new Todo("Make dinner", true,false));
//        todoRepo.save(new Todo("Finish homework", true,true));
//        todoRepo.save(new Todo("Go to class", true,false));
//        todoRepo.save(new Todo("Study", false,true));
//        todoRepo.save(new Todo("Go to work", true,false));
//    }
}
