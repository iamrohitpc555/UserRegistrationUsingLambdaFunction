package com.blz.lambdafunction.userregistration;

@SuppressWarnings("serial")
public class InvalidLastNameException extends Exception
{
	public InvalidLastNameException(String message)
	{
		super(message);
	}
}
