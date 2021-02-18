package com.blz.lambdafunction.userregistration;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class FirstNameValidation
{
	static UserRegistration u;
	@BeforeClass
	public static void firstnameTestOjb()
	{
		u = new UserRegistration();
		System.out.println("In Before Class");
	}
	
	@AfterClass
	public static void nullOjb()
	{
		u = null;
		System.out.println("In After Class");
	}
	
	@Test
	public void givenFirstName_whenMin3Chars_FirstCharCaps_ReturnValid()
	{
		String result = u.validFirstName("Maa");
		Assert.assertEquals("VALID", result);
	}
	
	@Test
	public void givenFirstName_whenMin3Chars_FirstCharNotCaps_ReturnInvalid()
	{
		String result = u.validFirstName("maa");
		Assert.assertEquals("INVALID", result);
	}
	
	@Test
	public void givenFirstName_whenMin2Chars_FirstCharCaps_ReturnInvalid()
	{
		String result = u.validFirstName("Ma");
		Assert.assertEquals("INVALID", result);
	}
}
