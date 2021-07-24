package com.asus.apistudent.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asus.apistudent.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Long>{

}
