package com.blz.lambdafunction.userregistration;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LastNameValidation
{
	static UserRegistration u;
	@BeforeClass
	public static void lastnameTestOjb()
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
	public void givenLastName_whenMin3Chars_FirstCharCaps_ReturnValid()
	{
		String result = u.validLastName("Sri");
		Assert.assertEquals("VALID", result);
	}
	
	@Test
	public void givenLastName_whenMin3Chars_FirstCharNotCaps_ReturnInvalid()
	{
		String result = u.validLastName("sri");
		Assert.assertEquals("INVALID", result);
	}
	
	@Test
	public void givenLastName_whenMin2Chars_FirstCharCaps_ReturnInvalid()
	{
		String result = u.validLastName("Sr");
		Assert.assertEquals("INVALID", result);
	}

}
