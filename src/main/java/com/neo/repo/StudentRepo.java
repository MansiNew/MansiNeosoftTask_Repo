package com.neo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.neo.model.Student;

@Repository
public interface StudentRepo extends MongoRepository<Student, Long> {

}
