package com.example.proyectos.model;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("proyectos")
public class Proyecto {

	@Id
	private String id;
	private String nombre;
	private String periodo;
	private String descripcion;
	private String tipo;
	private Objetivo objetivos;
	private Presupuesto presupuesto;
	private Date fecha_inicial;
	private Date fecha_final;
	private ArrayList<Director> director;
	private String estado;
	private String fase;
	private ArrayList<Avance> avances;
	private ArrayList<Usuario> miembros;

	public Proyecto() {
		super();
	}

	public Proyecto(String nombre, String periodo, String descripcion, String tipo, Objetivo objetivos,
			Presupuesto presupuesto, Date fecha_inicial, Date fecha_final, ArrayList<Director> director, String estado,
			String fase, ArrayList<Avance> avances, ArrayList<Usuario> miembros) {
		super();
		this.nombre = nombre;
		this.periodo = periodo;
		this.descripcion = descripcion;
		this.tipo = tipo;
		this.objetivos = objetivos;
		this.presupuesto = presupuesto;
		this.fecha_inicial = fecha_inicial;
		this.fecha_final = fecha_final;
		this.director = director;
		this.estado = estado;
		this.fase = fase;
		this.avances = avances;
		this.miembros = miembros;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Objetivo getObjetivos() {
		return objetivos;
	}

	public void setObjetivos(Objetivo objetivos) {
		this.objetivos = objetivos;
	}

	public Presupuesto getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(Presupuesto presupuesto) {
		this.presupuesto = presupuesto;
	}

	public Date getFecha_inicial() {
		return fecha_inicial;
	}

	public void setFecha_inicial(Date fecha_inicial) {
		this.fecha_inicial = fecha_inicial;
	}

	public Date getFecha_final() {
		return fecha_final;
	}

	public void setFecha_final(Date fecha_final) {
		this.fecha_final = fecha_final;
	}

	public ArrayList<Director> getDirector() {
		return director;
	}

	public void setDirector(ArrayList<Director> director) {
		this.director = director;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getFase() {
		return fase;
	}

	public void setFase(String fase) {
		this.fase = fase;
	}

	public ArrayList<Avance> getAvances() {
		return avances;
	}

	public void setAvances(ArrayList<Avance> avances) {
		this.avances = avances;
	}

	public ArrayList<Usuario> getMiembros() {
		return miembros;
	}

	public void setMiembros(ArrayList<Usuario> miembros) {
		this.miembros = miembros;
	}

}
