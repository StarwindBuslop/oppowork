package com.oppowork.oppowork.controller;

import org.springframework.stereotype.Controller;

import com.oppowork.oppowork.model.User;

@Controller
public class LoginController {

	public boolean loginEmpty(User s) {
		String user = "Pepe2";
		String password ="12345";
		if(s.getUsername().equals("")||s.getPassword().equals("")) {
			return true;
		}else {
			return false;
		}
	}
}
