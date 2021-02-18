package com.blz.lambdafunction.userregistration;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class PasswordRule4Validation
{
	static UserRegistration u;
	@BeforeClass
	public static void pswdrule4TestOjb()
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
	public void givenPassword_whenMin8Chars_AtleastOneNumeric_AtleastOneUppercase_ExactlyOneSpecialChar_ReturnValid()
	{
		String result = u.validPasswordRule4("as4@dFgh");
		Assert.assertEquals("VALID", result);
	}
	
	@Test
	public void givenPassword_whenMin8Chars_AtleastOneNumeric_AtleastOneUppercase_NoSpecialChar_ReturnInvalid()
	{
		String result = u.validPasswordRule4("as4DdFghj");
		Assert.assertEquals("INVALID", result);
	}
	
	@Test
	public void givenPassword_whenMin8Chars_AtleastOneNumeric_AtleastOneUppercase_MoreThanOneSpecialChar_ReturnInvalid()
	{
		String result = u.validPasswordRule4("as4@dFg#j");
		Assert.assertEquals("INVALID", result);
	}
}
