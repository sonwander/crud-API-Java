package com.objetivar.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.objetivar.crud.model") // Substitua pelo pacote das suas entidades
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
		
		System.out.println("Run in Browser http://localhost:8081/swagger-ui/index.html");
	}

}
