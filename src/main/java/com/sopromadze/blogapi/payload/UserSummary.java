package com.sopromadze.blogapi.payload;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserSummary {
	public UserSummary(Long id2, String username2, String firstName2, String lastName2) {
		// TODO Auto-generated constructor stub
		this.id = id2;
		this.username = username2;
		this.firstName = firstName2;
		this.lastName = lastName2;
	}
	private Long id;
	private String username;
	private String firstName;
	private String lastName;
}
