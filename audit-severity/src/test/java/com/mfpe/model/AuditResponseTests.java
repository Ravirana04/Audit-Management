package com.mfpe.model;

//import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
//import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
/**
* 
* Test class to test AuditResponse
*
*/
@SpringBootTest
public class AuditResponseTests {
	
	@Test
	public void testGetterAndSetter() {
		AuditResponse auditResponse = new AuditResponse();
		auditResponse.setAuditId(101);
		auditResponse.setManagerName("Satyan");
		auditResponse.setProjectName("Project-6");
		auditResponse.setProjectExecutionStatus("RED");
		auditResponse.setRemedialActionDuration("none");
		assertEquals(101, auditResponse.getAuditId());
		assertEquals("Satyan",auditResponse.getManagerName());
		assertEquals("Project-6",auditResponse.getProjectName());
		assertEquals("RED", auditResponse.getProjectExecutionStatus());
		assertEquals("none", auditResponse.getRemedialActionDuration());
	}
}

