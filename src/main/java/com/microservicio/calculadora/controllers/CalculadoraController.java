package com.microservicio.calculadora.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CalculadoraController {
	
	@GetMapping("/suma/{numero1}/{numero2}")
	public Integer suma(@PathVariable Integer numero1,@PathVariable Integer numero2) {
		return numero1+numero2;
	}
	
	@GetMapping("/resta/{numero1}/{numero2}")
	public Long resta(@PathVariable Long numero1,@PathVariable  Long numero2) {
		return numero1-numero2;
	}
	
	@GetMapping("/multi/{numero1}/{numero2}")
	public Long multi(@PathVariable Long numero1,@PathVariable  Long numero2) {
		return numero1*numero2;
	}
	
	@GetMapping("/div/{numero1}/{numero2}")
	public Long div(@PathVariable Long numero1,@PathVariable  Long numero2) {
		return numero1/numero2;
	}
}
