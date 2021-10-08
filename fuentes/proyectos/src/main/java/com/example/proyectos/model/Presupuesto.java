package com.example.proyectos.model;

public class Presupuesto {

	private Long asignado;
	private Long ejecutado;

	public Presupuesto(Long asignado, Long ejecutado) {
		super();
		this.asignado = asignado;
		this.ejecutado = ejecutado;
	}

	public Long getAsignado() {
		return asignado;
	}

	public void setAsignado(Long asignado) {
		this.asignado = asignado;
	}

	public Long getEjecutado() {
		return ejecutado;
	}

	public void setEjecutado(Long ejecutado) {
		this.ejecutado = ejecutado;
	}

}
