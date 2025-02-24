package com.SpringDataJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringDataJPA.entitiy.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
