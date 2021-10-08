package com.example.proyectos.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.proyectos.model.Usuario;

@FeignClient(name="servicio-usuarios", url="http://localhost:8080/api/v1/usuarios")
public interface ServiceProxy {

	@GetMapping("/{id}")
	public Usuario darUsuario(@PathVariable String id);
}
