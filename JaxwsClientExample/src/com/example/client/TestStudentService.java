package com.example.client;

import com.example.service.Student;
import com.example.service.StudentService;
import com.example.service.StudentServiceImplService;

public class TestStudentService {

	public static void main(String[] args) {
		StudentServiceImplService implService = new StudentServiceImplService();
		StudentService service = implService.getStudentServiceImplPort();
		
		Student s1 = new Student(); 
		s1.setName("David"); 
		s1.setId(1);
		s1.setAge(20);
		
		System.out.println(service.getStudent(1));
	}
}
