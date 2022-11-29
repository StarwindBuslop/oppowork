package com.oppowork.oppowork.controller;





import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oppowork.oppowork.model.User;

@RestController

public class LoginController {
	
	@GetMapping("/login")
	public boolean login(User s) {
		String user = "Pepe2";
		String password ="12345";
		if(s.getUsername().equals(user)&&s.getPassword().equals(password)) {
			return true;
		}else {
			return false;
		}
	}
}
