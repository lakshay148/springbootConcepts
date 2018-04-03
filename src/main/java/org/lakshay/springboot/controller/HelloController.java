package org.lakshay.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hey")
	public String greeting() {
		return "Hello all!!";
	}
}
