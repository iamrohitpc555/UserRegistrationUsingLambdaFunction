package com.blz.lambdafunction.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration
{
	public static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
	public static final String EMAIL_ADDRESS_PATTERN = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
	public static final String MOBILE_NUMBER_PATTERN = "^(91){1}[ ][6-9]{1}[0-9]{9,9}$";
	public static final String PASSWORD_PATTERN = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20}$";
	
	//Using Lambda Function
	UserRegistrationInterface obj = (patternDetails, value) -> {
		Pattern p = Pattern.compile(patternDetails);
		Matcher m = p.matcher(value);
		return m.matches();
	};
	
	//First Name Exception
	public boolean validFirstName(String fName) throws InvalidFirstNameException
	{
		try
		{
			if(obj.validate(NAME_PATTERN, fName)) {
				return true;
			}
			else {
				throw new InvalidFirstNameException("Invalid first name..!Try again");
			}
		} catch (Exception e) {
			throw new InvalidFirstNameException("Invalid first name..!Try again");
		}
	}
	
	//Last Name Exception
	public boolean validLastName(String LName) throws InvalidLastNameException
	{
		try
		{
			if(obj.validate(NAME_PATTERN, LName)) {
				return true;
			}
			else {
				throw new InvalidLastNameException("Invalid last name..!Try again");
			}
		} catch (Exception e) {
			throw new InvalidLastNameException("Invalid last name..!Try again");
		}
	}
	
	//Email Exception
	public boolean validEmailAddress(String email) throws InvalidateEmailException
	{
		try {
			if(obj.validate(EMAIL_ADDRESS_PATTERN,email)) {
				return true;
			}
			else {
				throw new InvalidateEmailException("Enter a valid email Id");
			}
		}
		catch(Exception e) {
			throw new InvalidateEmailException("Enter a valid email Id");	
		}	
	}
	
	//Mobile Number Exception
	public boolean validMobileNumber(String phno) throws InvalidMobileNumberException
	{
		try
		{
			if(obj.validate(MOBILE_NUMBER_PATTERN, phno)) {
				return true;
			}
			else {
				throw new InvalidMobileNumberException("Invalid mobile number..!Try again");
			}
		} catch (Exception e) {
			throw new InvalidMobileNumberException("Invalid mobile number..!Try again");
		}
	}
	
	//Password Exception
	public boolean validPassword(String pswd) throws InvalidPasswordException
	{
		try
		{
			if(obj.validate(PASSWORD_PATTERN, pswd)) {
				return true;
			}
			else {
				throw new InvalidPasswordException("Invalid password..!Try again");
			}
		} catch (Exception e) {
			throw new InvalidPasswordException("Invalid password..!Try again");
		}
	}
}
