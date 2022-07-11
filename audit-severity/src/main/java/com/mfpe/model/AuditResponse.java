package com.mfpe.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="audit_response")
@AllArgsConstructor
@NoArgsConstructor
public class AuditResponse {
	
	@Id
	@GeneratedValue
	private int auditId;
	@NotEmpty(message = "Manager Name is required")
	private String managerName;
	@NotEmpty(message = "Project Name is required")
	private String projectName;
	
	@Temporal(TemporalType.TIMESTAMP)
    private Date creationDateTime;
	@NotEmpty(message = "ProjectExecutionStatus is required")
	private String projectExecutionStatus;
	@NotEmpty(message = "RemedialAction is required")
	private String remedialActionDuration;
	
	public void setCreationDateTime(Date creationDateTime2) {
		this.creationDateTime = creationDateTime2;
	}
	
}
