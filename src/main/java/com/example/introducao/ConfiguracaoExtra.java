package com.example.introducao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfiguracaoExtra {
	
	@Bean(name ="nameApplication")
	public String nomeDaAplicacao() {
		return "Gerenciamento de Estoques - Bean";
	}
}
