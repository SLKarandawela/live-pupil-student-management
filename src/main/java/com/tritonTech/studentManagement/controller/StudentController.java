package com.tritonTech.studentManagement.controller;

import com.tritonTech.studentManagement.model.Student;
import com.tritonTech.studentManagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("/getAll")
    public String getAll(Model model){
        List<Student> students = studentService.getAll();
        model.addAttribute("students",students);
        return "students";
    }

    @RequestMapping("/getOne")
    @ResponseBody
    public Optional<Student> getOne(Integer Id){
        return studentService.getOne(Id);
    }

    @PostMapping("/addNew")
    public String addNew(Student student){
        System.out.println("View rendered");
        System.out.println(student); // Print student object
        studentService.addNew(student);
        return "redirect:/students/getAll";
    }
}
