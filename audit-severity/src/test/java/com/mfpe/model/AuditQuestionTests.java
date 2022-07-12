package com.mfpe.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.mfpe.model.AuditQuestion;

@SpringBootTest
public class AuditQuestionTests {
	
	@Test
	public void testGetterAndSetter() {
		AuditQuestion auditQuestion = new AuditQuestion();
		auditQuestion.setQuestionId(1);
		auditQuestion.setQuestion("new Question");
		auditQuestion.setAuditType("new auditType");
		auditQuestion.setResponse("yes");
		assertEquals(1,auditQuestion.getQuestionId());
		assertEquals("new auditType",auditQuestion.getAuditType());
		assertEquals("new Question",auditQuestion.getQuestion());
		assertEquals("yes",auditQuestion.getResponse());
	}
	

}
