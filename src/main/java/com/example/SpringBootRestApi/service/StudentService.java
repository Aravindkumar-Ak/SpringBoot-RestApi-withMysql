package com.example.SpringBootRestApi.service;

import com.example.SpringBootRestApi.Exception.StudentNotFoundException;
import com.example.SpringBootRestApi.entity.Student;

import java.util.List;

public interface StudentService {
    public Student save(Student student) ;

   public List<Student> getAllStudents();

  public  Student getStudentById(Long id) throws StudentNotFoundException;

   public void deleteById(Long id);

   public  Student updateById(Long id,Student student);
}
