package com.in.myproduct.registrationservice.services;

import org.springframework.http.ResponseEntity;

import com.in.myproduct.registrationservice.models.RegistrationDto;
import com.in.myproduct.registrationservice.models.response.RegistrationResponse;

public interface RegistrationService {

	ResponseEntity<RegistrationResponse> registerUser(RegistrationDto registrationDto);
}
