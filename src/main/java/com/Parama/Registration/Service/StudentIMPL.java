package com.Parama.Registration.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.Parama.Registration.Dto.StudentDTO;
import com.Parama.Registration.Entity.Student;
import com.Parama.Registration.Repo.StudentRepo;
@Service
public class StudentIMPL implements StudentService{
    @Autowired
    private StudentRepo studentrepo;
    
    @Autowired
    private PasswordEncoder passwordEncoder; 
    
	@Override
	public String addStudent(StudentDTO studentdto) {
		
	      Student student=new Student(
	    		  studentdto.getStdregnum(),
	    		  studentdto.getName(),
	    		  studentdto.getEmail(),	    		  
	    		  this.passwordEncoder.encode(studentdto.getPassword())
	    		  
	    		 );
		studentrepo.save(student);
		
		
		return student.getName();
	}

}
