package com.blz.lambdafunction.userregistration;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class PasswordRule3Validation
{
	static UserRegistration u;
	@BeforeClass
	public static void pswdrule3TestOjb()
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
	public void givenPassword_whenMin8Chars_AtleastOneNumeric_AtleastOneUppercase_ReturnValid()
	{
		String result = u.validPasswordRule3("as4@dFg!");
		Assert.assertEquals("VALID", result);
	}
	
	@Test
	public void givenPassword_whenMin8Chars_NoNumeric_AtleastOneUppercase_ReturnInvalid()
	{
		String result = u.validPasswordRule3("asDf@gh#");
		Assert.assertEquals("INVALID", result);
	}
	
	@Test
	public void givenPassword_whenMin8Chars_AtleastOneNumeric_NoUppercase_ReturnInvalid()
	{
		String result = u.validPasswordRule3("as3dfg@hj");
		Assert.assertEquals("INVALID", result);
	}
	
	@Test
	public void givenPassword_whenLessThan8Chars_AtleastOneNumeric_AtleastOneUppercase_ReturnInvalid()
	{
		String result = u.validPasswordRule3("a3s@Df");
		Assert.assertEquals("INVALID", result);
	}
}
