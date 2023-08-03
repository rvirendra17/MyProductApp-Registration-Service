package com.in.myproduct.registrationservice.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class RegistrationDto {


	@JsonProperty("full_name")
	@NotBlank
	private String fullName;
	
	@JsonProperty("email")
	@Email
	@NotNull
	private String email;
	
	@JsonProperty("email")
	@Pattern(regexp = "^\\d{10}$")
	@NotBlank
	private String mobileNumber;
	
	@NotBlank
	private String password;
	
	@NotBlank
	private String confirmPassowrd;
	
	@NotBlank
	private String dob;
	
	@NotBlank
	private String profilePic;
	
	@Pattern(regexp = "^\\d{12}$")
	@NotBlank
	private String aadhaar;
}
