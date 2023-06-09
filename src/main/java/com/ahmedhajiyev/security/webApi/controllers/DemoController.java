package com.ahmedhajiyev.security.webApi.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo-controller")
public class DemoController {

	@GetMapping()
	@ResponseStatus(code = HttpStatus.OK)
	public String sayHello() {
		return "Hello from secured endpoint";
	}
}
