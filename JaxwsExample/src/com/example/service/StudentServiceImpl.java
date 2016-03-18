package com.example.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.jws.WebService;

import com.example.model.Student;

@WebService(endpointInterface = "com.example.service.StudentService")
public class StudentServiceImpl implements StudentService{
	private static Map<Integer, Student> Students = new HashMap<Integer, Student>();

	@Override
	public boolean addStudent(Student p) {
		if(Students.get(p.getId()) != null) return false;
		Students.put(p.getId(), p);
		return true;
	}
	
	@Override
    public boolean deleteStudent(int id) {
        if(Students.get(id) == null) return false;
        Students.remove(id);
        return true;
    }
 
    @Override
    public Student getStudent(int id) {
        return Students.get(id);
    }
 
    @Override
    public Student[] getAllStudents() {
        Set<Integer> ids = Students.keySet();
        Student[] p = new Student[ids.size()];
        int i=0;
        for(Integer id : ids){
            p[i] = Students.get(id);
            i++;
        }
        return p;
    }
}
