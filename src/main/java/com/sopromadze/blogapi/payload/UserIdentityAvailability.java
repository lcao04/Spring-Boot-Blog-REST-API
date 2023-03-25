package com.sopromadze.blogapi.payload;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserIdentityAvailability {
	public UserIdentityAvailability(Boolean isAvailable) {
		// TODO Auto-generated constructor stub
		this.available = isAvailable;
	}

	private Boolean available;

}
