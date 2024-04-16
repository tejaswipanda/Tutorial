package com.tutorials.Tutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TutorialController {

	@GetMapping("/test")
	public String test ()
	{
		return "hello";
	}
}
