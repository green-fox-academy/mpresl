package com.greenfoxdemo.exercises.GreenFox.controllers;


import com.greenfoxdemo.exercises.GreenFox.Services.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class greenfoxappController {
    private final StudentService studentService;

    public greenfoxappController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping("/gfa")
    public String gfa(Model model){
        model.addAttribute("count", studentService.count());
        return "gfa/greenfox";
    }

    @GetMapping("/gfa/list")
    public String gfaList(Model model){
        model.addAttribute("students", studentService.findAll());
        return "gfa/list";
    }

    @GetMapping("/gfa/addNew")
    public String addNew(Model model){
        return "gfa/addNew";
    }

    @PostMapping("/gfa/save")
    public String add(@RequestParam String name){
        studentService.save(name);

        return "redirect:/gfa/";
    }

    @GetMapping("/gfa/check")
    public String checkFor(Model model){
        model.addAttribute("checked", false);

        return "gfa/check";
    }

    @PostMapping("gfa/checkStudent")
    public String check(@RequestParam String name, Model model){
        model.addAttribute("nameCheck", studentService.findAll().contains(name));
        model.addAttribute("checked", true);
        return "gfa/check";
    }
}
