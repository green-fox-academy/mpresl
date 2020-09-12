package controller;

import model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import services.StudentServiceImpl;

import java.util.List;

@Controller
public class StudentController {

    private final StudentServiceImpl studentService;

    StudentController(StudentServiceImpl studentService){
        this.studentService = studentService;
    }

    @GetMapping(/students)
    public String getAllStudents(Model model){
        List<Student> studentsList = this.studentService.getAllStudents();
        model.addAttribute("")
    }
}
