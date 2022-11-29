package com.oppowork.oppowork;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.oppowork.oppowork.controller.LoginController;
import com.oppowork.oppowork.model.User;



public class testLogin {

	@Test
	void testLogin() {
		LoginController lc = new LoginController();
		User user = new User("Pepe2","12345");
		assertTrue(lc.login(user));
		
	}
	@Test
	void testLoginEmpty() {
		LoginController lc = new LoginController();
		User user = new User("","");
		assertTrue(lc.login(user));
		
	}
	
	
	
}
