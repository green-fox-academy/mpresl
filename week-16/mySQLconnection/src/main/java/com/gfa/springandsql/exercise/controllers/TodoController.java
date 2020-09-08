package com.gfa.springandsql.exercise.controllers;

import com.gfa.springandsql.exercise.model.Todo;
import com.gfa.springandsql.exercise.services.TodoServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class TodoController {

    private final TodoServiceImpl todoService;

    public TodoController(TodoServiceImpl todoService){
        this.todoService = todoService;
    }


    @GetMapping({"/","/list"})
    public String list(Model model){
        model.addAttribute("todos", todoService.getTasks());
        return "todolist";
    }

    @GetMapping("/add")
    public String addTask(Model model){
        model.addAttribute("todo", new Todo());
        return "addTodo";
    }

    @PostMapping("/add")
    public String addNewTask(Model model, @RequestParam(value = "title") String title){
        todoService.addTask(new Todo(title));
        return "redirect:/list";
    }
}
