package com.blz.lambdafunction.userregistration;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class UserRegistrationTest
{
	static UserRegistration u;
	@BeforeClass
	public static void firstnameObj()
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
	
	// First Name Validation
		@Test
		public void givenFirstName_whenMin3Chars_FirstCharCaps_ReturnValid() throws Exception
		{
			try {
				Assert.assertTrue(u.validFirstName("Maa"));
			} catch (InvalidFirstNameException e) {
				System.out.println(e.getMessage());
			}
		}
		@Test
		public void givenFirstName_whenMin3Chars_FirstCharNotCaps_ReturnInvalid() throws Exception
		{
			try {
				Assert.assertTrue(u.validFirstName("maa"));
			} catch (InvalidFirstNameException e) {
				System.out.println(e.getMessage());
			}
		}
		@Test
		public void givenFirstName_whenMin2Chars_FirstCharCaps_ReturnInvalid() throws Exception
		{
			try {
				Assert.assertTrue(u.validFirstName("Ma"));
			} catch (InvalidFirstNameException e) {
				System.out.println(e.getMessage());
			}
		}

	// Last Name Validation
		@Test
		public void givenLastName_whenMin3Chars_FirstCharCaps_ReturnValid() throws Exception
		{
			try {
				Assert.assertTrue(u.validLastName("Maa"));
			} catch (InvalidLastNameException e) {
				System.out.println(e.getMessage());
			}
		}
		@Test
		public void givenLastName_whenMin3Chars_FirstCharNotCaps_ReturnInvalid() throws Exception
		{
			try {
				Assert.assertTrue(u.validLastName("maa"));
			} catch (InvalidLastNameException e) {
				System.out.println(e.getMessage());
			}
		}	
		@Test
		public void givenLastName_whenMin2Chars_FirstCharCaps_ReturnInvalid() throws Exception
		{
			try {
				Assert.assertTrue(u.validLastName("Ma"));
			} catch (InvalidLastNameException e) {
				System.out.println(e.getMessage());
			}
		}
		
	// Email Validation
		@Test
		public void givenEmail_withOnlyMandatoryPart_ReturnValid() throws Exception
		{
			try {
				Assert.assertTrue(u.validEmailAddress("abc@bl.co"));
			} catch (InvalidateEmailException e) {
				System.out.println(e.getMessage());
			}
		}
		@Test
		public void givenEmail_withoutMandatoryPart_ReturnInvalid() throws Exception
		{
			try {
				Assert.assertTrue(u.validEmailAddress("abc.xyz.in"));
			} catch (InvalidateEmailException e) {
				System.out.println(e.getMessage());
			}
		}
		
	// Mobile Number Validation
		@Test
		public void givenPhno_startWithCountryCode_FollowedBySpace_AndHas10digits_ReturnValid() throws Exception
		{
			try {
				Assert.assertTrue(u.validMobileNumber("91 7098654321"));
			} catch (InvalidMobileNumberException e) {
				System.out.println(e.getMessage());
			}
		}
		@Test
		public void givenPhno_startWithCountryCode_NoSpace_AndHas10digits_ReturnInvalid() throws Exception
		{
			try {
				Assert.assertTrue(u.validMobileNumber("917098654321"));
			} catch (InvalidMobileNumberException e) {
				System.out.println(e.getMessage());
			}
		}
		
	//Password Validation
		@Test
		public void givenPassword_whenMin8Chars_ReturnValid() throws Exception
		{
			try {
				Assert.assertTrue(u.validPassword("as_Df@gh"));
			} catch (InvalidPasswordException e ) {
				System.out.println(e.getMessage());
			}
		}
		@Test
		public void givenPassword_whenMin8Chars_NoNumeric_AtleastOneUppercase_ReturnInvalid() throws Exception
		{
			try {
				Assert.assertTrue(u.validPassword("asDf@gh#"));
			} catch (InvalidPasswordException e) {
				System.out.println(e.getMessage());
			}
		}
}
