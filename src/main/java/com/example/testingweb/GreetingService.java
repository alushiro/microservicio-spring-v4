package com.example.testingweb;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

	private String password="1234";
	public String greet() {
		return "Finaliza el curso DevOps Foundation v4 - Eduardo Avello";
	}

	public void broke(){
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
	}
}
