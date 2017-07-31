package com.stallats.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Students {
	
	@Value("${name}")
	String name;
	
	@Value("${meta.service.uri}")
	String url;
	
	@RequestMapping("/")
	String home() {
		return name + " - " + url;
	}
	
}
