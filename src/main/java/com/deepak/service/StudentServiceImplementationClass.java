package com.deepak.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deepak.model.Student;
import com.deepak.repo.StudentRepo;

@Service
public class StudentServiceImplementationClass implements StudentService
{
	@Autowired
	private StudentRepo repo;

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		Double total=student.getHindi()+student.getTelugu()+student.getEnglish()+student.getMaths()+student.getScience()+student.getSocial();
		student.setTotal_marks(total);
		Double avg=total/6;
		student.setAverage(avg);
		if(avg>=70)
		{
			student.setGrade("A grade");	
		}
		else if(avg>=60&& avg<70)
		{
			student.setGrade("B grade");
		}
		else if(avg>=50&& avg<60)
		{
			student.setGrade("C grade");
		}
		else if(avg<50)
		{
			student.setGrade("fail");
		}
		
		Student ss=repo.save(student);
		return ss;
	}

	@Override
	public Student updateStudent(Student student,Integer id) {
		// TODO Auto-generated method stub
		Double total=student.getHindi()+student.getTelugu()+student.getEnglish()+student.getMaths()+student.getScience()+student.getSocial();
		student.setTotal_marks(total);
		Double avg=total/6;
		student.setAverage(avg);
		if(avg>=70)
		{
			student.setGrade("A grade");	
		}
		else if(avg>=60&& avg<70)
		{
			student.setGrade("B grade");
		}
		else if(avg>=50&& avg<60)
		{
			student.setGrade("C grade");
		}
		else if(avg<50)
		{
			student.setGrade("fail");
		}
		
		
		Student std=repo.save(student);
		return std;
		
	}

	@Override
	public void deleteStudent(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public Student getStudent(Integer id) {
		// TODO Auto-generated method stub
		Optional<Student> student=repo.findById(id);
		Student sr=student.get();
		return sr;
		
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		List<Student> studentList=(List<Student>) repo.findAll();
		return studentList;
	}

}
