package com.Parama.Registration.Service;

import org.springframework.stereotype.Service;

import com.Parama.Registration.Dto.StudentDTO;
  
@Service
public interface StudentService {

	String addStudent(StudentDTO studetndto);

}
