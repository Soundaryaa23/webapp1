package com.webapp1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Webapp1Controller {
	@GetMapping("/get")
	public String get() {
		return "Success";
	}
}
