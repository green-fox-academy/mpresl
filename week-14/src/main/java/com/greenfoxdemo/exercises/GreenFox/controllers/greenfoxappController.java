package com.greenfoxdemo.exercises.GreenFox.controllers;


import com.greenfoxdemo.exercises.GreenFox.Services.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class greenfoxappController {
    private final StudentService studentService;

    public greenfoxappController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping("/gfa")
    public String gfa(){
        return "gfa/greenfox";
    }

    @GetMapping("/gfa/list")
    public String gfaList(Model model){
        model.addAttribute("students", studentService.findAll());
        return "gfa/list";
    }
}
