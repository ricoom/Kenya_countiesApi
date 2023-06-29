package com.ricoom.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PagesController {

	@GetMapping("/")
	public String home() {
		return "index";
	}
}