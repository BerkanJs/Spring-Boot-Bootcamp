package com.SpringDataJPA.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.SpringDataJPA.entitiy.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	// Buralara kendi özel metotlarımızı yazacağız
	
	// HQL : sınıfın ismi ve değişken isimleri kullanılarak sorgular yazılır
	// SQL : tablo ismi ve tablo içerisindeki kolon isimleri ile sorgular yazılır
	
	@Query (value = "select * from student.student",nativeQuery = true)
	List<Student> findAllStudents();
	
	@Query (value = "from Student s WHERE s.id=:studentId",nativeQuery = false)
	Optional<Student> findStudentById(Integer studentId);

}
