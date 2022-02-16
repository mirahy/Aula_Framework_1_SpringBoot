package com.example.introducao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class IntroducaoSpringApplication {
	
	@Autowired
	@Qualifier("nameApplication")
	private String nomeDaAplicacao;
	
	@GetMapping("/nome")
	public String hello() {
		return nomeDaAplicacao;
	}

	public static void main(String[] args) {
		SpringApplication.run(IntroducaoSpringApplication.class, args);
	}

}
