package com.mfpe.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AuditBenchmarkTests {

	@Test
	public void testGetterAndSetter()
	{
		AuditBenchmark obj=new AuditBenchmark();
		obj.setBenchmarkId(1);
		obj.setAuditType("Internal");
		obj.setBenchmarkNoAnswers(3);
		assertEquals(1,obj.getBenchmarkId());
		assertEquals("Internal",obj.getAuditType());
		assertEquals(3,obj.getBenchmarkNoAnswers());
	}
	

	@Test
	public void testconstructorAndTostring()
	{
		AuditBenchmark obj=new AuditBenchmark(3,"new type",4);
		assertEquals("AuditBenchmark(benchmarkId=3, auditType=new type, benchmarkNoAnswers=4)",obj.toString());
		
	}
	
}
