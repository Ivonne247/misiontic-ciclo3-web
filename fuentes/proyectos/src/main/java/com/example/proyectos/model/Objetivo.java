package com.example.proyectos.model;

import java.util.ArrayList;

public class Objetivo {

	private String general;
	private ArrayList<String> especificos;

	public Objetivo(String general, ArrayList<String> especificos) {
		super();
		this.general = general;
		this.especificos = especificos;
	}

	public String getGeneral() {
		return general;
	}

	public void setGeneral(String general) {
		this.general = general;
	}

	public ArrayList<String> getEspecificos() {
		return especificos;
	}

	public void setEspecificos(ArrayList<String> especificos) {
		this.especificos = especificos;
	}

}
