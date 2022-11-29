package com.oppowork.oppowork;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.oppowork.oppowork.controller.LoginController;
import com.oppowork.oppowork.model.User;



public class testLogin {

	@Test
	void testEmpty() {
		LoginController lc = new LoginController();
		User user = new User("","12345");
		assertTrue(lc.loginEmpty(user));
		
	}
	@Test
	void testEmptyPassword() {
		User user = new User("Pepe2","12345");
		assertEquals("",user.getUsername());
		
	}
	
}
