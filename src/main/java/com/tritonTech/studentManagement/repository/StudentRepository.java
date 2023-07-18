package com.tritonTech.studentManagement.repository;

import com.tritonTech.studentManagement.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
}
