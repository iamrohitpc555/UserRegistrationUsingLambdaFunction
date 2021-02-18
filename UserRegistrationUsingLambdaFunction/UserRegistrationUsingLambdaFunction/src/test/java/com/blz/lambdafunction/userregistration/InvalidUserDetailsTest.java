package com.blz.lambdafunction.userregistration;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class InvalidUserDetailsTest
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
	
	// First Name Validation
	@Test
	public void givenFirstName_whenMin3Chars_FirstCharCaps_ReturnValid() throws Exception
	{
		try {
			String result = u.validFirstName("Maa");
		} catch (Exception e) {
			Assert.assertEquals("Invalid First Name, try again", e.getMessage());
		}
	}
	@Test
	public void givenFirstName_whenMin3Chars_FirstCharNotCaps_ReturnInvalid() throws Exception
	{
		try {
			String result = u.validFirstName("maa");
		} catch (Exception e) {
			Assert.assertEquals("Invalid First Name, try again", e.getMessage());
		}
	}
	@Test
	public void givenFirstName_whenMin2Chars_FirstCharCaps_ReturnInvalid() throws Exception
	{
		try {
			String result = u.validFirstName("Ma");
		} catch (Exception e) {
			Assert.assertEquals("Invalid First Name, try again", e.getMessage());
		}
	}

	// Last Name Validation
	@Test
	public void givenLastName_whenMin3Chars_FirstCharCaps_ReturnValid() throws Exception
	{
		try {
			String result = u.validLastName("Maa");
		} catch (Exception e) {
			Assert.assertEquals("Invalid Last Name, try again", e.getMessage());
		}
	}
	@Test
	public void givenLastName_whenMin3Chars_FirstCharNotCaps_ReturnInvalid() throws Exception
	{
		try {
			String result = u.validLastName("maa");
		} catch (Exception e) {
			Assert.assertEquals("Invalid Last Name, try again", e.getMessage());
		}
	}	
	@Test
	public void givenLastName_whenMin2Chars_FirstCharCaps_ReturnInvalid() throws Exception
	{
		try {
			String result = u.validLastName("Ma");
		} catch (Exception e) {
			Assert.assertEquals("Invalid Last Name, try again", e.getMessage());
		}
	}
	
	// Email Validation
	@Test
	public void givenEmail_withOnlyMandatoryPart_ReturnValid() throws Exception
	{
		try {
			String result = u.validEmailAddress("abc@bl.co");
		} catch (Exception e) {
			Assert.assertEquals("Invalid Email Address, try again", e.getMessage());
		}
	}
	@Test
	public void givenEmail_withoutMandatoryPart_ReturnInvalid() throws Exception
	{
		try {
			String result = u.validEmailAddress("abc.xyz.in");
		} catch (Exception e) {
			Assert.assertEquals("Invalid Email Address, try again", e.getMessage());
		}
	}
	
	// Mobile Number Validation
	@Test
	public void givenPhno_startWithCountryCode_FollowedBySpace_AndHas10digits_ReturnValid() throws Exception
	{
		try {
			String result = u.validMobileNumber("91 7098654321");
		} catch (Exception e) {
			Assert.assertEquals("Invalid Mobile Number, try again", e.getMessage());
		}
	}
	@Test
	public void givenPhno_startWithCountryCode_NoSpace_AndHas10digits_ReturnInvalid() throws Exception
	{
		try {
			String result = u.validMobileNumber("917098654321");
		} catch (Exception e) {
			Assert.assertEquals("Invalid Mobile Number, try again", e.getMessage());
		}
	}

	// Password Rule 1 validation
	@Test
	public void givenPassword_whenMin8Chars_ReturnValid() throws Exception
	{
		try {
			String result = u.validPasswordRule1("as_Df@gh");
		} catch (Exception e ) {
			Assert.assertEquals("Invalid Password, try again", e.getMessage());
		}
	}
	@Test
	public void givenPassword_whenLessThan8Chars_ReturnInvalid() throws Exception
	{
		try {
			String result = u.validPasswordRule1("as_Df@g");
		} catch (Exception e) {
			Assert.assertEquals("Invalid Password, try again", e.getMessage());
		}
	}
	
	//Password Rule 2 validation
	@Test
	public void givenPassword_whenMin8Chars_AtleastOneUppercase_ReturnValid() throws Exception
	{
		try {
			String result = u.validPasswordRule2("as5Df@gh");
		} catch (Exception e) {
			Assert.assertEquals("Invalid Password, try again", e.getMessage());
		}
	}
	@Test
	public void givenPassword_whenMin8Chars_NoUppercase_ReturnInvalid() throws Exception
	{
		try {
			String result = u.validPasswordRule2("as_df@gh");
		} catch (Exception e) {
			Assert.assertEquals("Invalid Password, try again", e.getMessage());
		}
	}
	
	//Passwoed Rule 3 validation
	@Test
	public void givenPassword_whenMin8Chars_AtleastOneNumeric_AtleastOneUppercase_ReturnValid() throws Exception
	{
		try {
			String result = u.validPasswordRule3("as4@dFg!");
		} catch (Exception e) {
			Assert.assertEquals("Invalid Password, try again", e.getMessage());
		}
	}
	@Test
	public void givenPassword_whenMin8Chars_NoNumeric_AtleastOneUppercase_ReturnInvalid() throws Exception
	{
		try {
			String result = u.validPasswordRule3("asDf@gh#");
		} catch (Exception e) {
			Assert.assertEquals("Invalid Password, try again", e.getMessage());
		}
	}
	
	//Password Rule 4 validation
	@Test
	public void givenPassword_whenMin8Chars_AtleastOneNumeric_AtleastOneUppercase_ExactlyOneSpecialChar_ReturnValid() throws Exception
	{
		try {
			String result = u.validPasswordRule4("as4@dFgh");
		} catch (Exception e) {
			Assert.assertEquals("Invalid Password, try again", e.getMessage());
		}
	}
	@Test
	public void givenPassword_whenMin8Chars_AtleastOneNumeric_AtleastOneUppercase_NoSpecialChar_ReturnInvalid() throws Exception
	{
		try {
			String result = u.validPasswordRule4("as4DdFghj");
		} catch (Exception e) {
			Assert.assertEquals("Invalid Password, try again", e.getMessage());
		}
	}
}
