package com.blz.lambdafunction.userregistration;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class PasswordRule1Validation 
{
	static UserRegistration u;
	@BeforeClass
	public static void pswdrule1TestOjb()
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
	public void givenPassword_whenMin8Chars_ReturnValid()
	{
		String result = u.validPasswordRule1("as_Df@gh");
		Assert.assertEquals("VALID", result);
	}
	
	@Test
	public void givenPassword_whenLessThan8Chars_ReturnInvalid()
	{
		String result = u.validPasswordRule1("as_Df@g");
		Assert.assertEquals("INVALID", result);
	}
}
