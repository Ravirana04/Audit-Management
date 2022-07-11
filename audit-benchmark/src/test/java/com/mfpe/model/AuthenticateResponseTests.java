package com.mfpe.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AuthenticateResponseTests {

	@Test
	public void testGetterAndSetter()
	{
		AuthenticationResponse obj=new AuthenticationResponse();
		obj.setName("Harsh");;
		obj.setProjectName("audit-benchmark");;
		obj.setValid(true);;
		assertEquals("Harsh",obj.getName());
		assertEquals("audit-benchmark",obj.getProjectName());
		assertEquals(true,obj.isValid());
	}
	
	@Test
	public void testconstructorAndTostring()
	{
		AuthenticationResponse obj=new AuthenticationResponse("Harsh","audit-benchmark",true);
		assertEquals("AuthenticationResponse(name=Harsh, projectName=audit-benchmark, isValid=true)",obj.toString());
		
		
	}
	
}
