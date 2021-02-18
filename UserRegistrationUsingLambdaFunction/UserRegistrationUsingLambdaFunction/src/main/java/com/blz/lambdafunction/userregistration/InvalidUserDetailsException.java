package com.blz.lambdafunction.userregistration;

@SuppressWarnings("serial")
public class InvalidUserDetailsException extends Exception
{
	public InvalidUserDetailsException(String message)
	{
		super(message);
	}
}
