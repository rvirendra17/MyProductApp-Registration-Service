package com.in.myproduct.registrationservice.services;

import org.springframework.http.ResponseEntity;

import com.in.myproduct.registrationservice.entities.RegistrationEntity;
import com.in.myproduct.registrationservice.models.response.RegistrationResponse;

public interface RegistrationService {

	ResponseEntity<RegistrationResponse> registerUser(RegistrationEntity registrationEntity);
}
