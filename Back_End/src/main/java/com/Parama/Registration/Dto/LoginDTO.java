package com.Parama.Registration.Dto;

public class LoginDTO {
	private Integer stdregnum;
	private String password;
	public LoginDTO(Integer stdregnum, String password) {
		super();
		this.stdregnum = stdregnum;
		this.password = password;
	}
	public LoginDTO() {
		super();
	}
	public Integer getStdregnum() {
		return stdregnum;
	}
	public void setStdregnum(Integer stdregnum) {
		this.stdregnum = stdregnum;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginDTO [stdregnum=" + stdregnum + ", password=" + password + "]";
	}
	
	
	
	
	
}
