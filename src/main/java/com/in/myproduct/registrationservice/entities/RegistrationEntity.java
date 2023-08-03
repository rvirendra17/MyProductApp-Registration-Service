package com.in.myproduct.registrationservice.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class RegistrationEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long registrationId;
	
	@Column(name = "full_name")
	private String fullName;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "mobile_number")
	private String mobileNumber;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "dob")
	private String dob;
	
	@Column(name = "profile_pic")
	private String profilePic;
	
	@Column(name = "aadhaar")
	private String aadhaar;
	
}
