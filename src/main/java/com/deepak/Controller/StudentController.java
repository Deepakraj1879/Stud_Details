
package com.deepak.Controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.deepak.model.Student;
import com.deepak.service.StudentService;

@RestController
public class StudentController 
{
	@Autowired
	private StudentService stdservice;
	
	@PostMapping("/req1")
	public Student save(@RequestBody Student studentModel,Model m)
	{
		Student s1=stdservice.saveStudent(studentModel);
		return s1;
		
		
	}
	
	@PutMapping("/update/{id}")
	public Student updateStudent(@RequestBody Student studentModel,@PathVariable Integer id)
	{
	   return stdservice.updateStudent(studentModel, id);
	}
	
	@GetMapping("/get/{id}")
	public Student findById(@PathVariable Integer id)
	{
		Student s4=stdservice.getStudent(id);
		return s4;
		
	}
	@GetMapping("/getAll")
	public List<Student> findAll()
	{
		List<Student> s6=stdservice.getAllStudent();
		return s6;
	}
	 @DeleteMapping("/delete/{id}")
		public void deleteStudent(@PathVariable Integer id)
		{
			stdservice.deleteStudent(id);
		}
	
	

}
