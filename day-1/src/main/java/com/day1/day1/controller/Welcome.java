package com.day1.day1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
@GetMapping("color")
   public String welcome() {
	return "Welcome";
}
}