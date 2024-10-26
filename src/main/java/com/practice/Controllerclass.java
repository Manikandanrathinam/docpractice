package com.practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/Docpractice")
public class Controllerclass {
	@GetMapping(value = "/get")
	public String getMessage() {
		return "Hi Mani";
	}

}
