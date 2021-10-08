package com.example.proyectos.model;

import java.util.Date;

public class Avance {

	private Long documento;
	private String fase;
	private String reporte;
	private Date fecha_reporte;
	private String observacion;

	public Avance(Long documento, String fase, String reporte, String observacion) {
		super();
		this.documento = documento;
		this.fase = fase;
		this.reporte = reporte;
		this.fecha_reporte = new Date();
		this.observacion = observacion;
	}

	public Long getDocumento() {
		return documento;
	}

	public void setDocumento(Long documento) {
		this.documento = documento;
	}

	public String getFase() {
		return fase;
	}

	public void setFase(String fase) {
		this.fase = fase;
	}

	public String getReporte() {
		return reporte;
	}

	public void setReporte(String reporte) {
		this.reporte = reporte;
	}

	public Date getFecha_reporte() {
		return fecha_reporte;
	}

	public void setFecha_reporte(Date fecha_reporte) {
		this.fecha_reporte = fecha_reporte;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

}
