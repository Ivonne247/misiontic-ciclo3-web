package com.example.proyectos.model.service;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.proyectos.model.Proyecto;

@Repository
public interface ProyectoRepository extends MongoRepository<Proyecto, String> {

}
