package com.mfpe.model;

import javax.validation.constraints.NotEmpty;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class AuthenticationResponse {
	@NotEmpty(message = "Manager Name is required")
	private String name;
	@NotEmpty(message = "Project Name is required")
	private String projectName;
	@NotEmpty(message = "It is required")
	private boolean isValid;
}
