package com.sopromadze.blogapi.payload;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class SignUpRequest {
	@NotBlank
	@Size(min = 4, max = 40)
	private String firstName;

	@NotBlank
	@Size(min = 4, max = 40)
	private String lastName;

	@NotBlank
	@Size(min = 3, max = 15)
	private String username;

	@NotBlank
	@Size(max = 40)
	@Email
	private String email;

	@NotBlank
	@Size(min = 6, max = 20)
	private String password;

	public @NotBlank String getUsername() {
		// TODO Auto-generated method stub
		return this.username;
	}

	public @NotBlank String getEmail() {
		// TODO Auto-generated method stub
		return this.email;
	}

	public String getFirstName() {
		// TODO Auto-generated method stub
		return this.firstName;
	}

	public String getLastName() {
		// TODO Auto-generated method stub
		return this.lastName;
	}

	public String getPassword() {
		// TODO Auto-generated method stub
		return this.password;
	}
}
