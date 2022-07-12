package com.mfpe.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//import org.junit.jupiter.api.BeforeEach;
//import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.mfpe.model.AuditQuestion;

/**
 * 
 * 	Test case to test AuditDetail Class
 *
 */
@SpringBootTest
public class AuditDetailTests {

	@Test
	public void testGetterAndSetter() {
		List<AuditQuestion> auditQuestion = new ArrayList<>();
		AuditDetail auditDetail = new AuditDetail();
		Date date = new Date();
		auditDetail.setAuditDate(date);
		auditDetail.setAuditType("Internal");
		auditDetail.setAuditQuestions(auditQuestion);
		assertEquals(date, auditDetail.getAuditDate());
		assertEquals("Internal", auditDetail.getAuditType());
		assertEquals(auditQuestion, auditDetail.getAuditQuestions());
	}
}