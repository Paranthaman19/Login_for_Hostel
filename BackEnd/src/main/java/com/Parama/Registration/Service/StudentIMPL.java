package com.Parama.Registration.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.Parama.Registration.Dto.LoginDTO;
import com.Parama.Registration.Dto.StudentDTO;
import com.Parama.Registration.Entity.Student;
import com.Parama.Registration.Repo.StudentRepo;
import com.Parama.Registration.Response.LoginResponse;

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

	@Override
	public LoginResponse loginStudent(LoginDTO loginDTO) {
		 //String msg = "";
	        Student student1 = studentrepo.findByStdregnum(loginDTO.getStdregnum());
	        if (student1 != null) {
	            String password = loginDTO.getPassword();
	            String encodedPassword = student1.getPassword();
	            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
	            if (isPwdRight) {
	                Optional<Student> student = studentrepo.findOneByStdregnumAndPassword(loginDTO.getStdregnum(), encodedPassword);
	                if (student.isPresent()) {
	                    return new LoginResponse("Login Success", true);
	                } else {
	                    return new LoginResponse("Login Failed", false);
	                }
	            } else {
	                return new LoginResponse("password Not Match", false);
	            }
	        }else {
	            return new LoginResponse("Registernumber not exits", false);
	        }
	    }
	}


