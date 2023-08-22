package com.day1.day1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ColorGame {
        @Value("${col}")
        private String color;
        @GetMapping("nam")
        public String color(){
        	
			return "My favorite color is "+color;
        }
}
