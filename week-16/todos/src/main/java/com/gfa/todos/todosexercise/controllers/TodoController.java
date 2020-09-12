package com.gfa.todos.todosexercise.controllers;

import com.gfa.todos.todosexercise.repositories.TodoRepo;
import com.gfa.todos.todosexercise.services.TodoService;
import com.gfa.todos.todosexercise.services.TodoServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


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
}
