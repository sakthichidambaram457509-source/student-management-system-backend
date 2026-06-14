package com.student.management.controller;

import com.student.management.model.Student;

import com.student.management.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@CrossOrigin("https://studentms1.vercel.app")
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

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student studentDetails) {
        return studentService.updateStudent(id, studentDetails);
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