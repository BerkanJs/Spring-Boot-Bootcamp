package com.SpringDataJPA.services;

import java.util.List;

import com.SpringDataJPA.entitiy.Student;

public interface IStudentService {
	
	public Student saveStudent(Student student);
	public List<Student> getAllStudents();
	public Student getStudentById(Integer id);
	public void deleteStudent(Integer id);
	public Student updateStudent(Integer idInteger , Student updateStudent);

}
