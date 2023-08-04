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
	
	@JsonProperty("mobile_number")
	@Pattern(regexp = "^\\d{10}$")
	@NotBlank
	private String mobileNumber;
	
	@JsonProperty("password")
	@NotBlank
	private String password;
	
	@JsonProperty("confirm_password")
	@NotBlank
	private String confirmPassowrd;
	
	@JsonProperty("dob")
	@NotBlank
	private String dob;
	
	
	@JsonProperty("profile_pic")
	@NotBlank
	private String profilePic;
	
	@JsonProperty("aadhaar")
	@Pattern(regexp = "^\\d{12}$")
	@NotBlank
	private String aadhaar;
}
