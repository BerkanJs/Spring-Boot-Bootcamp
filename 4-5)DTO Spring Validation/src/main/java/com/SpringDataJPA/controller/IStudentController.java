package com.SpringDataJPA.controller;

import java.util.List;

import com.SpringDataJPA.dto.DtoStudent;
import com.SpringDataJPA.dto.DtoStudentIU;
import com.SpringDataJPA.entitiy.Student;

public interface IStudentController {
	
	public DtoStudent saveStudent(DtoStudentIU dtostudentIU);
	
	public List<DtoStudent> getAllStudents();
	
	public DtoStudent getStudentById(Integer id);
	
	public void deleteStudent(Integer id);
	
	public DtoStudent updateStudent(Integer id ,DtoStudentIU dtoStudentIU);

}
