package com.barataribeiro.primeirospassos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimeirosPassosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeirosPassosApplication.class, args);

		// Não estão disponíveis para o Spring...
		// Calculadora calculadora = new Calculadora(); // Jamais utilizar essa maneira dentro do Spring
		// System.out.println("O resultado da soma é: " + calculadora.somar(5, 2));
	}

}
