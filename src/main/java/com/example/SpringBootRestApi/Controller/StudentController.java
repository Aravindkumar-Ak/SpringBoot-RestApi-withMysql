package com.example.SpringBootRestApi.Controller;


import com.example.SpringBootRestApi.Exception.StudentNotFoundException;
import com.example.SpringBootRestApi.Repository.StudentRepository;
import com.example.SpringBootRestApi.entity.Student;
import com.example.SpringBootRestApi.service.StudentService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;
    private Logger logger= LoggerFactory.getLogger(StudentController.class);

    @PostMapping("/students")
    public Student create(@Valid @RequestBody Student student){
        logger.info("inside postmapping");
        return studentService.save(student);
    }

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        logger.info("inside getmapping");
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable("id") Long id) throws StudentNotFoundException {

        return studentService.getStudentById(id);
    }

    @DeleteMapping("/students/{id}")
    public String deleteById(@PathVariable("id") Long id){
        studentService.deleteById(id);
        return "Student deleted successfully";
    }
    @PutMapping("/students/{id}")
    public Student updateById(@PathVariable("id") Long id,@RequestBody Student student){
        return  studentService.updateById(id,student);
    }
}
