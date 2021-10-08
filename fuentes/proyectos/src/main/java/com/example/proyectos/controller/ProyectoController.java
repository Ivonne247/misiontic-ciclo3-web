package com.example.proyectos.controller;

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

import com.example.proyectos.model.Proyecto;
import com.example.proyectos.model.service.ProyectoService;

@RestController
@RequestMapping("/api/v1/proyectos")
public class ProyectoController {

	@Autowired
	private ProyectoService service;


	@GetMapping()
	public ResponseEntity<?> darProyectos() {
		return ResponseEntity.status(HttpStatus.OK).body(service.darProyectos());
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> darProyecto(@PathVariable String id) {
		return ResponseEntity.status(HttpStatus.OK).body(service.darProyecto(id));
	}

	@PostMapping
	public ResponseEntity<?> crearProyecto(@RequestBody Proyecto proyecto) {
		return ResponseEntity.status(HttpStatus.CREATED).body(service.crearProyecto(proyecto));
	}

	@PutMapping("/{id}")
	public ResponseEntity<?> editarProyecto(@PathVariable String id, @RequestBody Proyecto proyecto) {
		return ResponseEntity.status(HttpStatus.OK).body(service.editarProyecto(id, proyecto));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> eliminarProyecto(@PathVariable String id) {
		service.eliminarProyecto(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping("/{idProyecto}/miembros/{idMiembro}")
	public ResponseEntity<?> agregarMiembro(@PathVariable String idProyecto, @PathVariable String idMiembro, @RequestBody String rol) {
		return ResponseEntity.status(HttpStatus.OK).body(service.agregarMiembro(idProyecto, idMiembro, rol));
	}
	
	@DeleteMapping("/{idProyecto}/miembros/{idMiembro}")
	public ResponseEntity<?> eliminarMiembro(@PathVariable String idProyecto, @PathVariable String idMiembro) {
		return ResponseEntity.status(HttpStatus.OK).body(service.eliminarMiembro(idProyecto, idMiembro));
	}


}
