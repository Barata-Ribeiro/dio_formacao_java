package com.barataribeiro.springpadroesprojeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via Spring Initializr
 * dentro do VSCode.
 * 
 * Os seguintes módulos foram selecionados:
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database
 * - OpenFeign
 * 
 * @author Barata-Ribeiro
 */
@EnableFeignClients
@SpringBootApplication
public class SpringPadroesProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPadroesProjetoApplication.class, args);
	}

}
