package com.mfpe.model;

import javax.validation.constraints.NotEmpty;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuditRequest {
	 @NotEmpty(message = "Project Name is required")
	 private String projectName;
	 @NotEmpty(message = "Manager Name is required")
	 private String managerName;
	 @NotEmpty(message = "Audit Details is required")
	 private AuditDetail auditDetail;
	
}
