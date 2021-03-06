package com.capgemini;

import java.util.*;
import org.junit.*;
import org.junit.runner.*;
import org.junit.runners.*;

@RunWith(Parameterized.class)
public class EmailsValidation {
	private String Email;
	private boolean expected;
	private UserRegistration user;

	public EmailsValidation(String Email, boolean expected) {
		super();
		this.Email = Email;
		this.expected = expected;
	}

	@Before
	public void initialize() {
		user = new UserRegistration();
	}

	@SuppressWarnings("rawtypes")
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] { { "abc@yahoo.com", true }, { "abc-100@yahoo.com", true },
				{ "abc.100@yahoo.com", true }, { "abc111@abc.com", true }, { "abc-100@abc.net", true },
				{ "abc.100@abc.com.au", true }, { "abc@1.com", true }, { "abc@gmail.com.com", true },
				{ "abc+100@gmail.com", true }, { "abc", false }, { "abc@.com.my", false }, { "abc123@gmail.a", false },
				{ ".abc@abc.com", false }, { "abc()*@gmail.com", false }, { "abc@%*.com", false },
				{ "abc..2002@gmail.com", false }, { "abc.@gmail.com", false }, { "abc@abc@gmail.com", false },
				{ "abc@gmail.com.1a", false }, { "abc@gmail.com.aa.au", false }, { "abc123@.com", false },
				{ "abc123@.com.com", false } });
	}

	@Test
	public void testEmailsValidation() {
		try {
		Assert.assertEquals(expected, user.email.valid(Email));
	}catch(UserRegistrationException e) {
		Assert.assertEquals("Please enter proper email", e.getMessage());
		}
	}
}