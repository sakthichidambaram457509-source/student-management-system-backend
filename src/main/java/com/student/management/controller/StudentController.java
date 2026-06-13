package com.student.management.controller;

import com.student.management.model.Student;

import com.student.management.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@CrossOrigin("*")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }
    
    @GetMapping("/test")
    public String test() {
        Student student = new Student();
        student.setName("Sakthi");
        student.setDepartment("CSE");
        student.setEmail("sakthi@gmail.com");
        student.setPhone("9876543210");

        studentService.addStudent(student);

        return "Student Added";
    }
}