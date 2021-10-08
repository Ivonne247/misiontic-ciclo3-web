package com.example.usuarios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.usuarios.model.Usuario;
import com.example.usuarios.service.UsuarioService;

@RestController
@RequestMapping("/api/v1/usuarios")
public class UsuarioController {
	
	@Autowired
	UsuarioService service;

	@GetMapping()
	public ResponseEntity<?> darUsuarios() {
	   return ResponseEntity.status(HttpStatus.OK).body(service.darUsuarios());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> darUsuario(@PathVariable String id) {
	   return ResponseEntity.status(HttpStatus.OK).body(service.darUsuario(id));
	}
	
	@PostMapping
	public ResponseEntity<?> crearUsuario(@RequestBody Usuario usuario) {
		   return ResponseEntity.status(HttpStatus.CREATED).body(service.crearUsuario(usuario));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> editarUsuario(@PathVariable String id, @RequestBody Usuario usuario) {
		   return ResponseEntity.status(HttpStatus.OK).body(service.editarUsuario(id, usuario));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> eliminarUsuario(@PathVariable String id) {
		service.eliminarUsuario(id);
		return ResponseEntity.noContent().build();
	}
}
