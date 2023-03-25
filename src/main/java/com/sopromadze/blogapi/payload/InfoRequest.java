package com.sopromadze.blogapi.payload;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class InfoRequest {

	@NotBlank
	private String street;

	@NotBlank
	private String suite;

	@NotBlank
	private String city;

	@NotBlank
	private String zipcode;

	private String companyName;

	private String catchPhrase;

	private String bs;

	private String website;

	private String phone;

	private String lat;

	private String lng;

	public String getLat() {
		// TODO Auto-generated method stub
		return this.lat;
	}

	public String getLng() {
		// TODO Auto-generated method stub
		return this.lng;
	}

	public String getStreet() {
		// TODO Auto-generated method stub
		return this.street;
	}

	public String getSuite() {
		// TODO Auto-generated method stub
		return this.suite;
	}

	public String getCity() {
		// TODO Auto-generated method stub
		return this.city;
	}

	public String getZipcode() {
		// TODO Auto-generated method stub
		return this.zipcode;
	}

	public String getCompanyName() {
		// TODO Auto-generated method stub
		return this.companyName;
	}

	public String getCatchPhrase() {
		// TODO Auto-generated method stub
		return this.catchPhrase;
	}

	public String getWebsite() {
		// TODO Auto-generated method stub
		return this.website;
	}

	public String getPhone() {
		// TODO Auto-generated method stub
		return this.phone;
	}

	public String getBs() {
		// TODO Auto-generated method stub
		return this.bs;
	}
}
