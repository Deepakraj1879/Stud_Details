package com.deepak.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.deepak.model.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student, Integer> {

}
