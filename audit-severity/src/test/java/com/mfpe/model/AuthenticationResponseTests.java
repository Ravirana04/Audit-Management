package com.mfpe.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.mfpe.model.AuthenticationResponse;

@SpringBootTest
public class AuthenticationResponseTests {
	
	@Test
	public void testGetterAndSetter() {
		AuthenticationResponse authResponse = new AuthenticationResponse();
		authResponse.setName("Shubham G");
		authResponse.setProjectName("Project-1");
		authResponse.setValid(false);
		assertEquals("Shubham G",authResponse.getName());
		assertEquals("Project-1",authResponse.getProjectName());
		assertEquals(false,authResponse.isValid());
	}
	
	@Test
	public void testConstructorAndToString() {
		AuthenticationResponse authResponse = new AuthenticationResponse("Shubham G","Project-1",false);
		assertEquals("AuthenticationResponse(name=Shubham G, projectName=Project-1, isValid=false)",authResponse.toString());
	}

}
