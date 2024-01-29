package com.example.SpringBootRestApi.service;

import com.example.SpringBootRestApi.Exception.StudentNotFoundException;
import com.example.SpringBootRestApi.Repository.StudentRepository;
import com.example.SpringBootRestApi.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceimpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Long id) throws StudentNotFoundException {
       Optional<Student> student= studentRepository.findById(id);
       if(!student.isPresent())
          throw new StudentNotFoundException("Student Not Found");
       return student.get();
    }

    @Override
    public void deleteById(Long id) {
         studentRepository.deleteById(id);
    }

    @Override
    public Student updateById(Long id,Student student) {
        Student studentdb=studentRepository.findById(id).get();
        if(studentdb !=null){
studentdb.setName(student.getName());
studentdb.setEmail(student.getEmail());
studentdb.setMobileno(student.getMobileno());
        }
        return studentRepository.save(studentdb);
    }


}
