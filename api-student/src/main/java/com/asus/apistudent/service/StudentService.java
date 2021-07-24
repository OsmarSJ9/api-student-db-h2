package com.asus.apistudent.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.asus.apistudent.dto.StudentDto;
import com.asus.apistudent.entity.StudentEntity;
import com.asus.apistudent.exception.NotFoundExceptionGeneric;
import com.asus.apistudent.repository.StudentRepository;

@Service
public class StudentService extends MapperService implements BaseService<StudentDto>{
	
	public StudentRepository studentRepository;
	
	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	
	@Override
	public List<StudentDto> findAll() {
		
		List<StudentEntity> studentsEntity = studentRepository.findAll();
		List<StudentDto> studentsDto = new ArrayList<StudentDto>();
		for (StudentEntity studentEntity : studentsEntity) {
			studentsDto.add(entityToDto(studentEntity));
		}
		return studentsDto;
	}

	@Override
	public StudentDto findById(Long id) throws NotFoundExceptionGeneric {

		Optional<StudentEntity> studentEntity = studentRepository.findById(id);
		if(!studentEntity.isEmpty()) {
			StudentDto studentDto = entityToDto(studentEntity.get());
			return studentDto;
		}else {
			throw new NotFoundExceptionGeneric("Not found id: "+id);
		}
	}

	@Override
	public StudentDto save(StudentDto dto) {
		
		StudentEntity studentEntity = dtoToEntity(dto);
		studentRepository.save(studentEntity);
		return dto;
	}

	@Override
	public StudentDto update(Long id, StudentDto dto) throws NotFoundExceptionGeneric {
		
		Optional<StudentEntity> studentEntity = studentRepository.findById(id);
		if(!studentEntity.isEmpty()) {
			StudentEntity newStudentEntity = studentEntity.get();
			StudentEntity entity = dtoToEntity(dto);
			newStudentEntity = studentRepository.save(entity);
			return dto;
		}else {
			throw new NotFoundExceptionGeneric("Not found id: "+id);
		}

	}

	@Override
	public StudentDto delete(Long id) throws NotFoundExceptionGeneric {
		
		Optional<StudentEntity> studentEntity = studentRepository.findById(id);
		if(!studentEntity.isEmpty()) {
			StudentDto studentDto = entityToDto(studentEntity.get());
			studentRepository.delete(studentEntity.get());
			return studentDto;
		}else {
			throw new NotFoundExceptionGeneric("Not found id: "+id);
		}
		
	}

}
