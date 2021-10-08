package com.example.proyectos.model;

import java.util.Date;

public class Director {

	private Long documento;
	private Date fecha_ingreso;
	private int horas_proyecto;

	public Director(Long documento, int horas_proyecto) {
		super();
		this.documento = documento;
		this.fecha_ingreso = new Date();
		this.horas_proyecto = horas_proyecto;
	}

	public Long getDocumento() {
		return documento;
	}

	public void setDocumento(Long documento) {
		this.documento = documento;
	}

	public Date getFecha_ingreso() {
		return fecha_ingreso;
	}

	public void setFecha_ingreso(Date fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}

	public int getHoras_proyecto() {
		return horas_proyecto;
	}

	public void setHoras_proyecto(int horas_proyecto) {
		this.horas_proyecto = horas_proyecto;
	}

}
