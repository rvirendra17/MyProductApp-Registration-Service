package com.in.myproduct.registrationservice.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class RegistrationResponse {

	@JsonProperty("type")
	private String type;

	@JsonProperty("status")
	private String status;
	
	@JsonProperty("code")
	private Integer code;
	
	@JsonProperty("message")
	private String message;
	
}
