package com.example.usuarios.service;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.usuarios.model.Usuario;

@Repository
public interface UsuarioRepository extends MongoRepository<Usuario, String> {

}
