package com.asus.apistudent.service;

import org.modelmapper.ModelMapper;

import com.asus.apistudent.dto.StudentDto;
import com.asus.apistudent.entity.StudentEntity;

public class MapperService {
	
	private ModelMapper modelMapper;

	public MapperService() {
		modelMapper = new ModelMapper();
	}
	
	public StudentDto entityToDto(StudentEntity studentEntity) {
		StudentDto studentDto = modelMapper.map(studentEntity, StudentDto.class);
		return studentDto;
	}
	
	public StudentEntity dtoToEntity(StudentDto studentDto) {
		StudentEntity studentEntity = modelMapper.map(studentDto, StudentEntity.class);
		return studentEntity;
	}
	
	
	
	
}
