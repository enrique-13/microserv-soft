package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Bean
	public Map<String, String> getUsuarios() {
		Map<String, String> usuarios = new HashMap<>();
		usuarios.put("ALFA", "Enrique Encarnacion");
		usuarios.put("BETA", "Italo lozano");
		usuarios.put("GAMA", "Connie Cuenca");
		usuarios.put("DELTA", "Juan Carlos");
		return usuarios;
	}

}
