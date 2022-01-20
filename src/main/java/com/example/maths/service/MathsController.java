package com.example.maths.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathsController {

	@GetMapping("/add/{n1}/{n2}")
	public Response add(@PathVariable int n1, @PathVariable int n2) {
		return new Response(n1, n2, n1+n2);
	}
	@GetMapping("/multiply/{n1}/{n2}")
	public Response multiply(@PathVariable int n1, @PathVariable int n2) {
		return new Response(n1, n2, n1*n2);
	}
	
}
