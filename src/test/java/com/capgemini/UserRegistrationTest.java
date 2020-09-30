/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.capgemini;

import com.capgemini.UserRegistration;

import org.junit.*;

public class UserRegistrationTest {
	
	@Test
    public void givenFirstName_WhenValid_ReturnTrue() {
        UserRegistration user = new UserRegistration();
        try {
        Assert.assertTrue(user.fname("Kashif"));
        }catch(UserRegistrationException e) {
        	Assert.assertEquals("Please enter proper firstname", e.getMessage());
        }
    }
 @Test
    public void givenFirstName_WhenInvalid_ReturnFalse() {
        UserRegistration user = new UserRegistration();
        try {
        Assert.assertFalse(user.fname("kashif"));
        }catch(UserRegistrationException e) {
        	Assert.assertEquals("Please enter proper firstname", e.getMessage());
        }
    }
 @Test
    public void givenLastName_WhenValid_ReturnTrue() {
        UserRegistration user = new UserRegistration();
        try {
        Assert.assertTrue(user.lname("Ansari"));
        }catch(UserRegistrationException e) {
        	Assert.assertEquals("Please enter proper lastname", e.getMessage());
        }
    }
 @Test
    public void givenLastName_WhenInvalid_ReturnFalse() {
        UserRegistration user = new UserRegistration();
        try {
        Assert.assertFalse(user.lname("ansari"));
        }catch(UserRegistrationException e) {
        	Assert.assertEquals("Please enter proper lastname", e.getMessage());
        }
    }
 @Test
    public void givenEmail_WhenValid_ReturnTruee() {
        UserRegistration user = new UserRegistration();
        try {
        Assert.assertTrue(user.email("abc@gmail.com"));
        }catch(UserRegistrationException e) {
        	Assert.assertEquals("Please enter proper email", e.getMessage());
        }
    }
 @Test
    public void givenEmail_WhenInvalid_ReturnFalse() {
        UserRegistration user = new UserRegistration();
        try {
        Assert.assertFalse(user.email("kashif"));
        }catch(UserRegistrationException e) {
        	Assert.assertEquals("Please enter proper email", e.getMessage());
        }
    } 
 @Test
    public void givenMobileNo_WhenValid_ReturnTrue() {
        UserRegistration user = new UserRegistration();
        try {
        Assert.assertTrue(user.mobile("91 8737933455"));
        }catch(UserRegistrationException e) {
        	Assert.assertEquals("Please enter proper mobile no.", e.getMessage());
        }
    }
 @Test
    public void givenMobileNo_WhenInvalid_ReturnFalse() {
        UserRegistration user = new UserRegistration();
        try {
        Assert.assertFalse(user.mobile("12345"));
        }catch(UserRegistrationException e) {
        	Assert.assertEquals("Please enter proper mobile no.", e.getMessage());
        }
    }
 @Test
    public void givenPassword_WhenValid_ReturnTrue() {
        UserRegistration user = new UserRegistration();
        try {
        Assert.assertTrue(user.pwd("Kashif1@"));
        }catch(UserRegistrationException e) {
        	Assert.assertEquals("Please enter proper password", e.getMessage());
        }
    }
 @Test
    public void givenPassword_WhenInvalid_ReturnFalse() {
        UserRegistration user = new UserRegistration();
        try {
        Assert.assertFalse(user.pwd("kas"));
        }catch(UserRegistrationException e) {
        	Assert.assertEquals("Please enter proper password", e.getMessage());
        }
    }/*
 @Test
    public void givenFirstName_WhenValid_ReturnTrue() {
        UserRegistration user = new UserRegistration();
        Assert.assertTrue(user.fname("Kashif"));
    }
 @Test
    public void givenFirstName_WhenInvalid_ReturnFalse() {
        UserRegistration user = new UserRegistration();
        Assert.assertFalse(user.fname("kashif"));
    }
 @Test
    public void givenLastName_WhenValid_ReturnTrue() {
        UserRegistration user = new UserRegistration();
        Assert.assertTrue(user.lname("Ansari"));
    }
 @Test
    public void givenLastName_WhenInvalid_ReturnFalse() {
        UserRegistration user = new UserRegistration();
        Assert.assertFalse(user.lname("ansari"));
    }
 @Test
    public void givenEmail_WhenValid_ReturnTruee() {
        UserRegistration user = new UserRegistration();
        Assert.assertTrue(user.email("abc@gmail.com"));
    }
 @Test
    public void givenEmail_WhenInvalid_ReturnFalse() {
        UserRegistration user = new UserRegistration();
        Assert.assertFalse(user.email("kashif"));
    } 
 @Test
    public void givenMobileNo_WhenValid_ReturnTrue() {
        UserRegistration user = new UserRegistration();
        Assert.assertTrue(user.mobile("91 8737933455"));
    }
 @Test
    public void givenMobileNo_WhenInvalid_ReturnFalse() {
        UserRegistration user = new UserRegistration();
        Assert.assertFalse(user.mobile("12345"));
    }
 @Test
    public void givenPassword_WhenValid_ReturnTrue() {
        UserRegistration user = new UserRegistration();
        Assert.assertTrue(user.pwd("Kashif1@"));
    }
 @Test
    public void givenPassword_WhenInvalid_ReturnFalse() {
        UserRegistration user = new UserRegistration();
        Assert.assertFalse(user.pwd("kas"));
    }
 @Test
	public void givenMessage_whenSad_ShouldReturnSad() {
	 	UserRegistration user = new UserRegistration();
		String mood = user.analyseMood("This is a Sad Message");
		Assert.assertEquals("SAD", mood);
	}

 @Test
	public void givenMessage_whenNotSad_ShouldReturnHappy() {
		UserRegistration user = new UserRegistration();
		String mood = user.analyseMood("This is a Happy Message");
		Assert.assertEquals("Happy", mood);
	}*/
}
