package com.asus.apistudent.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.asus.apistudent.dto.StudentDto;
import com.asus.apistudent.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {
	
	public StudentService studentService;

	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<StudentDto> findAll() {
		return studentService.findAll();
	}
	
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public StudentDto findById(@PathVariable("id") Long id) {
		return studentService.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public StudentDto save(@Valid @RequestBody StudentDto dto) {
		return studentService.save(dto);
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public StudentDto update(@PathVariable("id") Long id, @RequestBody StudentDto dto) {
		return studentService.update(id, dto);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public StudentDto delete(@PathVariable("id") Long id) {
		return studentService.delete(id);
	}
	
}
