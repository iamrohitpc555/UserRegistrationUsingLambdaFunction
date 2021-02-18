package com.blz.lambdafunction.userregistration;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MobileNumberValidation
{
static UserRegistration u;
	
	@BeforeClass
	public static void mobilenoTestObj()
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
	public void givenPhno_startWithCountryCode_FollowedBySpace_AndHas10digits_ReturnValid()
	{
		String result = u.validMobileNumber("91 7098654321");
		Assert.assertEquals("VALID", result);
	}
	
	@Test
	public void givenPhno_startWithCountryCode_NoSpace_AndHas10digits_ReturnInvalid()
	{
		String result = u.validMobileNumber("917098654321");
		Assert.assertEquals("INVALID", result);
	}
	
	@Test
	public void givenPhno_startWithoutCountryCode_NoSpace_AndHas10digits_ReturnInvalid()
	{
		String result = u.validMobileNumber("7098654321");
		Assert.assertEquals("INVALID", result);
	}
	
	@Test
	public void givenPhno_startWithCountryCode_FollowedBySpace_HasLessthan10digits_ReturnInvalid()
	{
		String result = u.validMobileNumber("91 709865432");
		Assert.assertEquals("INVALID", result);
	}
	
	@Test
	public void givenPhno_startWithCountryCode_FollowedBySpace_HasMorethan10digits_ReturnInvalid()
	{
		String result = u.validMobileNumber("91 70986543218");
		Assert.assertEquals("INVALID", result);
	}
	
	@Test
	public void givenPhno_startWithSpecialChar_FollowedBySpace_Has10digits_ReturnInvalid()
	{
		String result = u.validMobileNumber("+91 70986543218");
		Assert.assertEquals("INVALID", result);
	}
	
	@Test
	public void givenPhno_startWithCountryCode_FollowedBySpace_10digitsStartwithLessthan6_ReturnInvalid()
	{
		String result = u.validMobileNumber("91 50986543218");
		Assert.assertEquals("INVALID", result);
	}
}
