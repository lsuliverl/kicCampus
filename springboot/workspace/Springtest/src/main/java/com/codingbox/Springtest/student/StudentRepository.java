package com.codingbox.Springtest.student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
	private static final Map<Long, Student> store = new HashMap<>();
	private static long sequence = 0;
	
	public Student save(Student student) {
		student.setId(++sequence);
		store.put(student.getId(), student);
		return student;
	}
	
	public Student findById(Long id) {
		return store.get(id);
	}
	
	public List<Student> findAll(){
		return new ArrayList<Student>(store.values());
	}
	
	public void update(Long studentId, Student updateParam) {
		// item을 먼저 찾는다
		Student findStudent = findById(studentId);
		findStudent.setStudentName(updateParam.getStudentName());
		findStudent.setAge(updateParam.getAge());
		findStudent.setSubject(updateParam.getSubject());
		findStudent.setNum(updateParam.getNum());
		findStudent.setAddress(updateParam.getAddress());
	}
	
}













