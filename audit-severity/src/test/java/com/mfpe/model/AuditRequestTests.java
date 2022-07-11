package com.mfpe.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
/**
* 
* 	Test class to test AuditRequest
*
*/
@SpringBootTest
public class AuditRequestTests {

	@Test
	public void testGetterAndSetter() {
		AuditRequest auditRequest = new AuditRequest();
		AuditDetail details = new AuditDetail();
		auditRequest.setAuditDetail(details);
		auditRequest.setManagerName("Satyan");
		auditRequest.setProjectName("Project-6");
		assertEquals(details, auditRequest.getAuditDetail());
		assertEquals("Satyan", auditRequest.getManagerName());
		assertEquals("Project-6", auditRequest.getProjectName());
	}

}