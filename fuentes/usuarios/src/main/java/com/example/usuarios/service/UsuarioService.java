package com.example.usuarios.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.usuarios.model.Usuario;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repo;
	
	public Usuario crearUsuario(Usuario usuario) {
		usuario.setStatus("activo");
		usuario.setRegistrado(new Date());
		repo.save(usuario);
		return usuario;
	}
	
	public Usuario darUsuario(String id) {
		Optional<Usuario> user = repo.findById(id);
		if(!user.isPresent()) {
			return null;
		}else {
			return user.get();
		}
	}
	
	public List<Usuario> darUsuarios() {
		return repo.findAll();
	}
	
	public Usuario editarUsuario(String id, Usuario usuario) {
		Optional<Usuario> user = repo.findById(id);
		if(user.isPresent()) {
			Usuario update = user.get();
			update.setPerfil(usuario.getPerfil());
			update.setIdentificacion(usuario.getIdentificacion());
			update.setNombres(usuario.getNombres());
			update.setApellidos(usuario.getApellidos());
			update.setCelular(usuario.getCelular());
			update.setEmail(usuario.getEmail());
			update.setUsername(usuario.getUsername());
			update.setPassword(usuario.getPassword());
			update.setStatus(usuario.getStatus());
			repo.save(update);
			return update;
		}else {
			return null;
		}
	}
	
	public void eliminarUsuario(String id) {
		repo.deleteById(id);
	}
}
