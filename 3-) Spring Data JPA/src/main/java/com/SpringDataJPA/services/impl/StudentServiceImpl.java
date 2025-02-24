package com.SpringDataJPA.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringDataJPA.entitiy.Student;
import com.SpringDataJPA.repository.StudentRepository;
import com.SpringDataJPA.services.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	
		
	}

	@Override
	public List<Student> getAllStudents() {
	List<Student> studentList=	studentRepository.findAll();
	
		return studentList;
	}

	@Override
	public Student getStudentById(Integer id) {
		Optional <Student> optional =studentRepository.findById(id);
		if(optional.isPresent()) {
			return optional.get();
			
		}
		
						
		return null;
	}

	@Override
	public void deleteStudent(Integer id) {
	Student dbStudent=getStudentById(id);
	if(dbStudent!=null) {
		studentRepository.delete(dbStudent);
		
		
	}
		
		
	}

	@Override
	public Student updateStudent(Integer id, Student updateStudent) {
		Student dbStudent=getStudentById(id);
		if(dbStudent!=null) {
			dbStudent.setFirstName(updateStudent.getFirstName());
			dbStudent.setLastName(updateStudent.getLastName());
			dbStudent.setBirthOfDate(updateStudent.getBirthOfDate());
			return studentRepository.save(dbStudent);
			
			
		}
		
		
		
		return null;
	}

}
