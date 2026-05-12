package com.ibm.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.entity.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
