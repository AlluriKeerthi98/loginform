package com.cg.discover.beans;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class User {
	
	 	@NotBlank(message = "* Please enter a valid e-mail address")
	    private String email;
	     
	    @NotBlank
	    @Size(min = 8, max = 12)
	    private String password;
	    
	    public User() {
	    	System.out.println("user controller called...");
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
			return "User [email=" + email + ", password=" + password + "]";
		}

}
