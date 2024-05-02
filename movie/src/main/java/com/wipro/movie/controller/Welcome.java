package com.wipro.movie.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
@GetMapping("/hello")
	public String welcome()
	{
		return "Welcome to learn something new";
	}
}
