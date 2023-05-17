package com.example.testingweb;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
	public String greet() {
		return "Finaliza el curso DevOps Foundation v4 - Eduardo Avello";
	}

	public boolean validarNumero(int numero) {
		// Incidencia de bloqueador: No se está realizando la validación del número
		if (true) {
			// Código que no realiza la validación correctamente
		}
		return true;
	}
}
