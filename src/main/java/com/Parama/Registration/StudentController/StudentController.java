package com.Parama.Registration.StudentController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Parama.Registration.Dto.StudentDTO;
import com.Parama.Registration.Service.StudentService;
@RestController
@CrossOrigin
@RequestMapping(path="/api/v1/student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@PostMapping(path = "/save")
    public ResponseEntity<String> saveStudent(@RequestBody StudentDTO studentDTO)
    {
		System.out.println("Its working");
        studentService.addStudent(studentDTO);
        return ResponseEntity.ok("Data Added Successfully");
    }
	
}