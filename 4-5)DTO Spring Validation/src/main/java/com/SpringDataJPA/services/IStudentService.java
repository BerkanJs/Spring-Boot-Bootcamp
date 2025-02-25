package com.SpringDataJPA.services;

import java.util.List;

import com.SpringDataJPA.dto.DtoStudent;
import com.SpringDataJPA.dto.DtoStudentIU;
import com.SpringDataJPA.entitiy.Student;

public interface IStudentService {
	
	public DtoStudent saveStudent(DtoStudentIU student);
	public List<DtoStudent> getAllStudents();
	public DtoStudent getStudentById(Integer id);
	public void deleteStudent(Integer id);
	public DtoStudent updateStudent(Integer idInteger , DtoStudentIU dtoStudentIU);

}
