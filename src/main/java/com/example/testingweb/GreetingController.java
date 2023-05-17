package com.example.testingweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class GreetingController {

	private final GreetingService service;

	public GreetingController(GreetingService service) {
		this.service = service;
	}

	@RequestMapping("/greeting")
	public @ResponseBody String greeting() {
		return service.greet();
	}
	public void processCriticalData(String data) {
		if (data == null) {
			throw new IllegalArgumentException("Los datos críticos no pueden ser nulos");
		}

		// Resto de la lógica para procesar los datos críticos
	}
}
