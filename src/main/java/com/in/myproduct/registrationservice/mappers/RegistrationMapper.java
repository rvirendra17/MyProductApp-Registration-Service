package com.in.myproduct.registrationservice.mappers;

import org.mapstruct.Mapper;

import com.in.myproduct.registrationservice.entities.RegistrationEntity;
import com.in.myproduct.registrationservice.models.RegistrationDto;

@Mapper(componentModel = "spring")
public interface RegistrationMapper {
	
	RegistrationEntity toRegistrationEntity(RegistrationDto registrationDto);
	
}
