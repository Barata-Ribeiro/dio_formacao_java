package com.barataribeiro.projetofinalpadroes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Spring Boot project generated via Spring Initializr on VSCode.
 * The following modules were selected:
 * - Spring Web
 * - Spring Data JPA
 * - H2 Database
 * - OpenFeign
 * - Lombok
 * 
 * @author Barata-Ribeiro
 */
@EnableFeignClients
@SpringBootApplication
public class ProjetoFinalPadroesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoFinalPadroesApplication.class, args);
	}

}
