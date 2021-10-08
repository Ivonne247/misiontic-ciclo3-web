package com.example.proyectos.model.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyectos.model.Proyecto;
import com.example.proyectos.model.Usuario;
import com.example.proyectos.proxy.ServiceProxy;

@Service
public class ProyectoService {

	@Autowired
	private ProyectoRepository repo;

	@Autowired
	private ServiceProxy proxy;

	public Proyecto crearProyecto(Proyecto proyecto) {
		repo.save(proyecto);
		return proyecto;
	}

	public Proyecto darProyecto(String id) {
		Optional<Proyecto> proyecto = repo.findById(id);
		if (!proyecto.isPresent()) {
			return null;
		} else {
			return proyecto.get();
		}
	}

	public List<Proyecto> darProyectos() {
		return repo.findAll();
	}

	public Proyecto editarProyecto(String id, Proyecto proyecto) {
		Optional<Proyecto> pro = repo.findById(id);
		if (pro.isPresent()) {
			Proyecto update = pro.get();
			update.setNombre(proyecto.getNombre());
			update.setPeriodo(proyecto.getPeriodo());
			update.setDescripcion(proyecto.getDescripcion());
			update.setTipo(proyecto.getTipo());
			update.setObjetivos(proyecto.getObjetivos());
			update.setPresupuesto(proyecto.getPresupuesto());
			update.setFecha_inicial(proyecto.getFecha_inicial());
			update.setFecha_final(proyecto.getFecha_final());
			update.setDirector(proyecto.getDirector());
			update.setEstado(proyecto.getEstado());
			update.setFase(proyecto.getFase());
			update.setAvances(proyecto.getAvances());
			update.setMiembros(proyecto.getMiembros());
			repo.save(update);
			return update;
		} else {
			return null;
		}
	}

	public void eliminarProyecto(String id) {
		repo.deleteById(id);
	}

	public Proyecto agregarMiembro(String idProyecto, String idUsuario, String rol) {
		Usuario user = proxy.darUsuario(idUsuario);
		Optional<Proyecto> pro = repo.findById(idProyecto);
		if (pro.isPresent()) {
			Proyecto proyecto = pro.get();
			ArrayList<Usuario> users = proyecto.getMiembros();
			user.setRol(rol);
			user.setFecha_ingreso(new Date());
			users.add(user);
			proyecto.setMiembros(users);
			return proyecto;
		} else {
			return null;
		}

	}

	public Proyecto eliminarMiembro(String idProyecto, String idUsuario) {
		Usuario user = proxy.darUsuario(idUsuario);
		Optional<Proyecto> pro = repo.findById(idProyecto);
		if (pro.isPresent()) {
			Proyecto proyecto = pro.get();
			ArrayList<Usuario> users = proyecto.getMiembros();
			users.remove(user);
			proyecto.setMiembros(users);
			return proyecto;
		} else {
			return null;
		}
	}

}
