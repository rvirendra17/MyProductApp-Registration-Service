package com.in.myproduct.registrationservice.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
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
