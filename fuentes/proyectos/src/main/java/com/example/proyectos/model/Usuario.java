package com.example.proyectos.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("usuarios")
public class Usuario {

	@Id
	private String id;
	private String perfil;
	private Long identificacion;
	private String nombres;
	private String apellidos;
	private Long celular;
	private String email;
	private String username;
	private String password;
	private String status;
	private Date registrado;
	private String rol;
	private Date fecha_ingreso;

	public Usuario() {

	}

	public Usuario(String perfil, Long identificacion, String nombres, String apellidos, Long celular, String email,
			String username, String password) {
		super();
		this.perfil = perfil;
		this.identificacion = identificacion;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.celular = celular;
		this.email = email;
		this.username = username;
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public Long getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(Long identificacion) {
		this.identificacion = identificacion;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Long getCelular() {
		return celular;
	}

	public void setCelular(Long celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getRegistrado() {
		return registrado;
	}

	public void setRegistrado(Date registrado) {
		this.registrado = registrado;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public Date getFecha_ingreso() {
		return fecha_ingreso;
	}

	public void setFecha_ingreso(Date fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", perfil=" + perfil + ", identificación=" + identificacion + ", nombres="
				+ nombres + ", apellidos=" + apellidos + ", celular=" + celular + ", email=" + email + ", username="
				+ username + ", password=" + password + ", status=" + status + ", registrado=" + registrado + "]";
	}

}
