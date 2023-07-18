package com.tritonTech.studentManagement.service;

import com.tritonTech.studentManagement.model.Student;
import com.tritonTech.studentManagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public List<Student> getAll(){
        return (List<Student>) studentRepository.findAll();
    }
    public Optional<Student> getOne(Integer Id){
        return studentRepository.findById(Id);
    }
    public void addNew(Student student){
        studentRepository.save(student);
    }

}
