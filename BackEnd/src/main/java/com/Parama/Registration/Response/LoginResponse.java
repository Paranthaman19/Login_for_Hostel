package com.Parama.Registration.Response;

public class LoginResponse {

	private Integer stdregnum;
	private String password;
	public LoginResponse(Integer stdregnum, String password) {
		super();
		this.stdregnum = stdregnum;
		this.password = password;
	}
	public LoginResponse() {
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
		return "LoginResponse [stdregnum=" + stdregnum + ", password=" + password + "]";
	}
	
	
	    private String message;
	    private boolean status;

	    // Constructor with parameters
	    public LoginResponse(String message, boolean status) {
	        this.message = message;
	        this.status = status;
	    }

	    // Getters and Setters (if needed)
	    public String getMessage() {
	        return message;
	    }

	    public void setMessage(String message) {
	        this.message = message;
	    }

	    public boolean isStatus() {
	        return status;
	    }

	    public void setStatus(boolean status) {
	        this.status = status;
	    }
	

	
}
