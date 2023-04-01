package com.ahmedhajiyev.security.webApi.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ahmedhajiyev.security.business.auth.AuthenticationRequest;
import com.ahmedhajiyev.security.business.auth.AuthenticationResponse;
import com.ahmedhajiyev.security.business.auth.AuthenticationService;
import com.ahmedhajiyev.security.business.auth.RegisterRequest;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

	private final AuthenticationService service;

	@PostMapping("/register")
	@ResponseStatus(code = HttpStatus.OK)
	public AuthenticationResponse register(@RequestBody RegisterRequest request) {
		return service.register(request);
	}

	@PostMapping("/authenticate")
	@ResponseStatus(code = HttpStatus.OK)
	public AuthenticationResponse authenticate(@RequestBody AuthenticationRequest request) {
		return service.authenticate(request);
	}

}
