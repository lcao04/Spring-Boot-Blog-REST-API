package com.sopromadze.blogapi.payload;

import com.sopromadze.blogapi.model.user.Address;
import com.sopromadze.blogapi.model.user.Company;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserProfile {
	public UserProfile(Long id2, String username2, String firstName2, String lastName2, Instant createdAt,
			String email2, Address address2, String phone2, String website2, Company company2, Long postCount2) {
		// TODO Auto-generated constructor stub
		this.id = id2;
		this.username = username2;
		this.firstName = firstName2;
		this.lastName = lastName2;
		this.joinedAt = createdAt;
		this.email = email2;
		this.address = address2;
		this.phone = phone2;
		this.website = website2;
		this.company = company2;
		this.postCount = postCount2;
	}
	private Long id;
	private String username;
	private String firstName;
	private String lastName;
	private Instant joinedAt;
	private String email;
	private Address address;
	private String phone;
	private String website;
	private Company company;
	private Long postCount;
}
