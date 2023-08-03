package com.in.myproduct.registrationservice.services.impls;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.in.myproduct.registrationservice.entities.RegistrationEntity;
import com.in.myproduct.registrationservice.models.response.RegistrationResponse;
import com.in.myproduct.registrationservice.repositories.RegistrationRepository;
import com.in.myproduct.registrationservice.services.RegistrationService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class RegistrationServiceImpl implements RegistrationService {

	private final RegistrationRepository registrationRepository;
	
	//Constructor based DI
	public RegistrationServiceImpl(RegistrationRepository registrationRepository) {
			this.registrationRepository=registrationRepository;
	}
	
	@Override
	public ResponseEntity<RegistrationResponse> registerUser(RegistrationEntity registrationEntity) {
		// TODO Auto-generated method stub
		return null;
	}

}
