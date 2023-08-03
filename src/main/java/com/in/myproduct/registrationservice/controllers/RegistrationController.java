package com.in.myproduct.registrationservice.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in.myproduct.registrationservice.models.RegistrationDto;
import com.in.myproduct.registrationservice.models.response.RegistrationResponse;
import com.in.myproduct.registrationservice.services.RegistrationService;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/registration/v1")
@Slf4j
public class RegistrationController {
	
	private final RegistrationService registrationService;
	

	public RegistrationController(RegistrationService registrationService) {
		this.registrationService=registrationService;
	}
	
	@PostMapping(path = "/user")
	public ResponseEntity<RegistrationResponse> registerUser(@RequestHeader(name = "transactionId", required = true) String transactionId,
															 @RequestBody @Valid RegistrationDto registrationDto) {
		log.info("TransactionId: {} :: In RegistrationController:registerUser() :: Registering User", transactionId);
		return null;
	}
	
}
