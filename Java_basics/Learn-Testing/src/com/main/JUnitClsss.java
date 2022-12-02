package com.main;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class JUnitClsss {

	String userName = "Nishant1234";
	
	@Test
	public void testUserName() {
	System.out.println("Testing if userName matches");
	assertEquals("Nishant1234", userName);
    }
	
	@Test
	public void JUnitTest() {
	System.out.println("We are start leraning JUnite Tesing");
	}
	
	
	public static void main(String[] args) {
		JUnitClsss result = new JUnitClsss();
		result.testUserName();
	}

}
