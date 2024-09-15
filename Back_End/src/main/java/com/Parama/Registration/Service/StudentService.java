package com.Parama.Registration.Service;

import org.springframework.stereotype.Service;

import com.Parama.Registration.Dto.LoginDTO;
import com.Parama.Registration.Dto.StudentDTO;
import com.Parama.Registration.Response.LoginResponse;

  
@Service
public interface StudentService {

	String addStudent(StudentDTO studetndto);
	
	

	LoginResponse loginStudent(LoginDTO loginDTO);

}
