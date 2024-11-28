package com.codingbox.Springtest.student;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {

	private final StudentRepository studentRepository;

	
	@GetMapping
	public String students(Model model) {
		List<Student> students = studentRepository.findAll();
		model.addAttribute("students", students);
		return "students/students";
	}
	
	@GetMapping("/{studentId}")
	public String item(@PathVariable long studentId, Model model) {
		Student student = studentRepository.findById(studentId);
		model.addAttribute("student", student);
		return "students/student";
	}
	
	@GetMapping("/add")
	public String studentAddForm() {
		return "students/studentAddForm";
	}
	
	@PostMapping("/add")
	public String save6(Student student, 
			RedirectAttributes redirectAttributes) {
		Student savedStudent = studentRepository.save(student);
		redirectAttributes.addAttribute("studentId", savedStudent.getId());
		redirectAttributes.addAttribute("status", true);
		return "redirect:/students/{studentId}";
	}
	
	@GetMapping("/{studentId}/edit")
	public String studentEditForm(@PathVariable Long studentId, 
			Model model) {

		Student student = studentRepository.findById(studentId);
		model.addAttribute("student", student);
		return "students/studentEditForm";
	}
	
	@PostMapping("/{studentId}/edit")
	public String edit(@PathVariable Long studentId, 
				@ModelAttribute Student student) {
		studentRepository.update(studentId, student);
		return "redirect:/items/{itemId}";
	}
	
	
	@PreDestroy
	public void destory() {
		System.out.println("종료 메서드 호출");
	}
	
}












