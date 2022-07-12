package com.mfpe.model;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotEmpty;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuditDetail {
	
	 @NotEmpty(message = "AuditType is required")
	 private String auditType;
	 @NotEmpty(message = "Date is required")
	 private Date auditDate;
	 @NotEmpty(message = "List Of questions is required")
	 private List<AuditQuestion> auditQuestions;
}
