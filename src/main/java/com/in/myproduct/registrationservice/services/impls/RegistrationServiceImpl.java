package com.in.myproduct.registrationservice.services.impls;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.in.myproduct.registrationservice.entities.RegistrationEntity;
import com.in.myproduct.registrationservice.mappers.RegistrationMapper;
import com.in.myproduct.registrationservice.models.RegistrationDto;
import com.in.myproduct.registrationservice.models.response.RegistrationResponse;
import com.in.myproduct.registrationservice.repositories.RegistrationRepository;
import com.in.myproduct.registrationservice.services.RegistrationService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class RegistrationServiceImpl implements RegistrationService {

	private final RegistrationRepository registrationRepository;

	public RegistrationMapper registrationMapper;

	// Constructor based DI
	public RegistrationServiceImpl(RegistrationRepository registrationRepository,
			RegistrationMapper registrationMapper) {
		this.registrationRepository = registrationRepository;
		this.registrationMapper = registrationMapper;

	}

	@Override
	public ResponseEntity<RegistrationResponse> registerUser(RegistrationDto registrationDto) {
		log.info("In RegistrationServiceImpl:registerUser() :: Registering a user");

		RegistrationEntity entity = registrationMapper.toRegistrationEntity(registrationDto);
		log.info("User rgistered: {}", entity);

		registrationRepository.save(entity);

		return new ResponseEntity<RegistrationResponse>(prepareRegistrationResponse(), HttpStatus.CREATED);
	}

	private RegistrationResponse prepareRegistrationResponse() {

		log.info("Preparing RegistrationResponse");
		return RegistrationResponse.builder().type("https://www.rfc-editor.org/rfc/rfc9110.html#name-status-codes")
				.code(201).status("Success")
				.message(
						"User registered successfully. We have sent you an account activation link on your registered email. Kindly follow the instructions in the email to activate your account.")
				.build();
	}

}
