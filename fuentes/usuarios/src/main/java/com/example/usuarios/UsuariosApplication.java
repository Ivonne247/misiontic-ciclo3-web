package com.example.usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.usuarios.service.UsuarioRepository;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = UsuarioRepository.class)
public class UsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsuariosApplication.class, args);
	}

}
