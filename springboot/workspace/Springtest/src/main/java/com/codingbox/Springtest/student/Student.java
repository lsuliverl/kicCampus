package com.codingbox.Springtest.student;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Student {
	private Long id;
	private String studentName;
	private Integer age;		
	private Integer subject;	
	private Integer num;	
	private String address;
	
	public Student() {}

	public Student(String studentName, Integer age, Integer subject, Integer num, String address) {
		super();
		this.studentName = studentName;
		this.age = age;
		this.subject = subject;
		this.num = num;
		this.address = address;
	}


	
}

















