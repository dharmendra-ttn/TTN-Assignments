package com.assignment18.springboot.repository;

import com.assignment18.springboot.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
