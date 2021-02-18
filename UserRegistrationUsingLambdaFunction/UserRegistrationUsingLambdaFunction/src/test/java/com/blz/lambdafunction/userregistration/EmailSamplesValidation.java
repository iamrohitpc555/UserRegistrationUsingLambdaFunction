package com.blz.lambdafunction.userregistration;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class EmailSamplesValidation
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
	public void givenEmail1_withOnlyMandatoryPart_ReturnValid()
	{
		String result = u.validateEmailSamples("abc@yahoo.com");
		Assert.assertEquals("VALID", result);
	}
	@Test
	public void givenEmail2_withOnlyMandatoryPart_ReturnValid()
	{
		String result = u.validateEmailSamples("abc111@abc.com");
		Assert.assertEquals("VALID", result);
	}
	@Test
	public void givenEmail3_withOnlyMandatoryPart_ReturnValid()
	{
		String result = u.validateEmailSamples("abc@1.com");
		Assert.assertEquals("VALID", result);
	}
	@Test
	public void givenEmail4_withMandatoryPart_OneorTwoOptionalParts_ReturnValid()
	{
		String result = u.validateEmailSamples("abc-100@yahoo.com");
		Assert.assertEquals("VALID", result);
	}
	@Test
	public void givenEmail5_withOnlyMandatoryPart_ReturnValid()
	{
		String result = u.validateEmailSamples("abc.100@yahoo.com");
		Assert.assertEquals("VALID", result);
	}
	@Test
	public void givenEmail6_withOnlyMandatoryPart_ReturnValid()
	{
		String result = u.validateEmailSamples("abc-100@abc.net");
		Assert.assertEquals("VALID", result);
	}
	@Test
	public void givenEmail7_withOnlyMandatoryPart_ReturnValid()
	{
		String result = u.validateEmailSamples("abc.100@abc.com.au");
		Assert.assertEquals("VALID", result);
	}
	@Test
	public void givenEmail8_withOnlyMandatoryPart_ReturnValid()
	{
		String result = u.validateEmailSamples("abc@gmail.com.com");
		Assert.assertEquals("VALID", result);
	}
	@Test
	public void givenEmail9_withOnlyMandatoryPart_ReturnValid()
	{
		String result = u.validateEmailSamples("abc+100@gmail.com");
		Assert.assertEquals("VALID", result);
	}
	@Test
	public void givenEmail10_withoutATsymbol_ReturnInvalid()
	{
		String result = u.validateEmailSamples("abc");
		Assert.assertEquals("INVALID", result);
	}
	@Test
	public void givenEmail11_withTopLevelDomains_StartwithDot_ReturnInvalid()
	{
		String result = u.validateEmailSamples("abc@.com.my");
		Assert.assertEquals("INVALID", result);
	}
	@Test
	public void givenEmail12_withTopLevelDomains_LessthanTwoChars_ReturnInvalid()
	{
		String result = u.validateEmailSamples("abc123@gmail.a");
		Assert.assertEquals("INVALID", result);
	}
	@Test
	public void givenEmail13_withTopLevelDomains_StartwithDot_ReturnInvalid()
	{
		String result = u.validateEmailSamples("abc123@.com");
		Assert.assertEquals("INVALID", result);
	}
	@Test
	public void givenEmail14_withTopLevelDomains_StartwithDot_ReturnInvalid()
	{
		String result = u.validateEmailSamples("abc123@.com.com");
		Assert.assertEquals("INVALID", result);
	}
	@Test
	public void givenEmail15_withFirstChar_StartwithDot_ReturnInvalid()
	{
		String result = u.validateEmailSamples(".abc@abc.com");
		Assert.assertEquals("INVALID", result);
	}
	@Test
	public void givenEmail16_withOtherSpecialChar_ReturnInvalid()
	{
		String result = u.validateEmailSamples("abc()*@gmail.com");
		Assert.assertEquals("INVALID", result);
	}
	@Test
	public void givenEmail17_withOtherSpecialChar_ReturnInvalid()
	{
		String result = u.validateEmailSamples("abc@%*.com");
		Assert.assertEquals("INVALID", result);
	}
	@Test
	public void givenEmail18_withDoubleDots_ReturnInvalid()
	{
		String result = u.validateEmailSamples("abc..2020@gmail.com");
		Assert.assertEquals("INVALID", result);
	}
	@Test
	public void givenEmail19_FirstMandatoryPart_EndwithDot_ReturnInvalid()
	{
		String result = u.validateEmailSamples("abc.@gmail.com");
		Assert.assertEquals("INVALID", result);
	}
	@Test
	public void givenEmail20_withDoubleAT_ReturnInvalid()
	{
		String result = u.validateEmailSamples("abc@abc@gmail.com");
		Assert.assertEquals("INVALID", result);
	}
	@Test
	public void givenEmail21_whenContainsOneDigit_InTopLevelDomainwithTwoChars_ReturnInvalid()
	{
		String result = u.validateEmailSamples("abc@gmail.com.1a");
		Assert.assertEquals("INVALID", result);
	}
	@Test
	public void givenEmail22_withMultipleTopLevelDomains_ReturnInvalid()
	{
		String result = u.validateEmailSamples("abc@gmail.com.aa.au");
		Assert.assertEquals("INVALID", result);
	}
}
