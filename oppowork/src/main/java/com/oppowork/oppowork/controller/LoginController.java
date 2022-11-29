package com.oppowork.oppowork.controller;

import com.oppowork.oppowork.model.User;

public class LoginController {

	public boolean loginEmpty(User s) {
		if(s.getUsername().equals("")||s.getPassword().equals("")) {
			return true;
		}else {
			return false;
		}
	}
}
