package com.example.testingweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("/")
	public @ResponseBody String greeting() {
		//1-División entre cero, lo cual provoca una excepción ArithmeticException
		int dividendo = 10;
		int divisor = 0;
		int resultado = dividendo / divisor;

//2-Intento de acceder a un índice que está fuera del rango del arreglo, lo cual provoca una excepción ArrayIndexOutOfBoundsException
		int[] numeros = {1, 2, 3};
		int indiceInvalido = 5;
		int numeroInvalido = numeros[indiceInvalido];

//3-Intento de convertir una cadena que no representa un número válido a un tipo entero, lo cual provoca una excepción NumberFormatException
		String texto = "ABC";
		int numero = Integer.parseInt(texto);
		return "Hello, World";
	}

}
