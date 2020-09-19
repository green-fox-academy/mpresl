package com.gfa.springandsql.exercise.controllers;

import com.gfa.springandsql.exercise.model.Assignee;
import com.gfa.springandsql.exercise.services.AssigneeService;
import com.gfa.springandsql.exercise.services.AssigneeServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/assignee")
public class AssigneeController {

    private final AssigneeService assigneeService;

    public AssigneeController(AssigneeService assigneeService){
        this.assigneeService = assigneeService;
    }

    @GetMapping({"/","/list"})
    public String home(Model model){
        model.addAttribute("users", assigneeService.findAll());
        return "userList";
    }

    @GetMapping("/add")
    public String addAssignee(Model model){
        model.addAttribute("user", new Assignee());
        return "newAssignee";
    }
}
