package com.Parama.Registration.Dto;



public class StudentDTO {
	
	
		
	    private int stdregnum;
		
	    private String name;
		
	    private String email;
	
	    private String password;

		public StudentDTO(int stdregnum, String name, String email, String password) {
			super();
			this.stdregnum = stdregnum;
			this.name = name;
			this.email = email;
			this.password = password;
		}

		public StudentDTO() {
			super();
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
			return "StudentDTO [stdregnum=" + stdregnum + ", name=" + name + ", email=" + email + ", password="
					+ password + "]";
		}
	    
	    
	    
	    
	    
	    
	    
}
