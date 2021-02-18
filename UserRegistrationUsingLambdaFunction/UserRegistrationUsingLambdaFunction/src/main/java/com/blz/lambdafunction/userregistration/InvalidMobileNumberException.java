package com.blz.lambdafunction.userregistration;

@SuppressWarnings("serial")
public class InvalidMobileNumberException extends Exception
{
	public InvalidMobileNumberException(String message) {
		super(message);
	}
}
