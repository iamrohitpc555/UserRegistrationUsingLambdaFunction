package com.blz.lambdafunction.userregistration;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class EmailValidation
{
static UserRegistration u;
	
	@BeforeClass
	public static void emailTestObj()
	{
		u = new UserRegistration();
		System.out.println("In Before Class");
	}
	
	@AfterClass
	public static void nullObj()
	{
		u = null;
		System.out.println("In After Class");
	}
	@Test
	public void givenEmail_withOnlyMandatoryPart_ReturnValid()
	{
		String result = u.validEmailAddress("abc@bl.co");
		Assert.assertEquals("VALID", result);
	}
	
	@Test
	public void givenEmail_withMandatoryAndOptionalPart_ReturnValid()
	{
		String result = u.validEmailAddress("abc.xyz@bl.co.in");
		Assert.assertEquals("VALID", result);
	}
	
	@Test
	public void givenEmail_withoutMandatoryPart_ReturnInvalid()
	{
		String result = u.validEmailAddress("abc.xyz.in");
		Assert.assertEquals("INVALID", result);
	}
}
