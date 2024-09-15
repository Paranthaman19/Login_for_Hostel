package com.Parama.Registration.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="students")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	@Column(name="RegisterNumber",length=45)	
    private int stdregnum;
	@Column(name="Name",length=255)
    private String name;
	@Column(name="EmailId",length=255)
    private String email;
	@Column(name="Password",length=255)
    private String password;
	public Student() {
		super();
	}
	public Student(int stdregnum, String name, String email, String password) {
		super();
		this.stdregnum = stdregnum;
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	public int getStdregnum() {
		return stdregnum;
	}
	public void setStdregnum(int stdregnum) {
		this.stdregnum = stdregnum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Student [stdregnum=" + stdregnum + ", name=" + name + ", email=" + email + ", password=" + password
				+ "]";
	}
	
	
	
	
	
	
	
}
