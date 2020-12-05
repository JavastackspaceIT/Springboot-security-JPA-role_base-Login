package com.javastackspaceit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResourceController {

	@RequestMapping(value = "/")
	@GetMapping
	public String home() {

		return "home resource";
	}

	@RequestMapping(value = "/user")
	@GetMapping
	public String user() {
		return "user api";
	}

	@RequestMapping(value = "/admin")
	@GetMapping
	public String admin() {
		return "admin api";
	}
}
