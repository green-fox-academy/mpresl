package com.gfa.springandsql.exercise.controllers;

import com.gfa.springandsql.exercise.model.Todo;
import com.gfa.springandsql.exercise.services.TodoServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class TodoController {

    private final TodoServiceImpl todoService;

    public TodoController(TodoServiceImpl todoService){
        this.todoService = todoService;
    }


    @GetMapping({"/","/list"})
    public String list(Model model, @RequestParam(required = false) Boolean notDone){
        if (notDone != null){
            model.addAttribute("todos", todoService.getIncompleteTasks());
        }else {
            model.addAttribute("todos", todoService.getTasks());
        }
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

    @GetMapping("/{id}/delete")
    public String deleteTask(@PathVariable long id){
        todoService.removeTask(id);
        return "redirect:/list";
    }

    @GetMapping("/{id}/edit")
    public String editTask(@PathVariable long id, Model model){
        model.addAttribute("task", todoService.findTask(id));
        return "editTask";
    }

    @PostMapping("/edit")
    public String updateTask(@ModelAttribute Todo todo){
        todoService.update(todo);
        return "redirect:/list";
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String searching(@RequestParam(value = "terms", required = false) String terms, Model model) {
        model.addAttribute("todos", todoService.searchTasks(terms));
        return "todolist";
    }
}
