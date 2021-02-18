package com.blz.lambdafunction.userregistration;

@FunctionalInterface
public interface UserRegistrationInterface
{
	public boolean validate(String regexPattern, String userDetails);
}
