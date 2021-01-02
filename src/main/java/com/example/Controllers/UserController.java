package com.example.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Services.UserService;
import com.example.Wrapper.Emails;

@RequestMapping("/user")
@RestController
public class UserController {
	
	@Autowired
	UserService service;
	
	@PostMapping("/add")
	public String addData(@RequestBody List<Emails> emails) {
		service.add(emails);
		return "Success";
	}
}
