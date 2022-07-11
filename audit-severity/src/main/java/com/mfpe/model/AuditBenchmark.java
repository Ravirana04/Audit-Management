package com.mfpe.model;





import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuditBenchmark {
	
	private int benchmarkId;
    @NotEmpty(message = "AuditType is required")
	private String auditType;
    @NotEmpty(message = "Between 1 and 3")
	private int benchmarkNoAnswers;
	
}
