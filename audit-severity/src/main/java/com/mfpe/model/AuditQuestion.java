package com.mfpe.model;

import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuditQuestion{
	
	 @NotEmpty(message = "Question id is required")
	 private int questionId;
	 @NotEmpty(message = "Question is required")
	 private String question;
	 @NotEmpty(message = "AuditType is required")
	 private String auditType;
	 @NotEmpty(message = "Response is required")
	 private String response;
	
}
