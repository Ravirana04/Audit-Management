package com.mfpe.model;


import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuditType {
	
	@NotEmpty(message = "Audit Type is required")
	private String auditType;
}
