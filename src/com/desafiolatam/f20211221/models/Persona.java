package com.desafiolatam.f20211221.models;

import java.util.Date;

public class Persona {
	//atributos
	private String nombre;
	private String apellido;
	private Date fechaNacimiento;
	private String rut;
	private boolean asistencia; 
	
	public Persona() {
		super();
	}

	public Persona(String nombre, String apellido, Date fechaNacimiento, String rut, boolean asistencia) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.rut = rut;
		this.asistencia = asistencia;
	}

	public boolean isAsistencia() {
		return asistencia;
	}

	public void setAsistencia(boolean asistencia) {
		this.asistencia = asistencia;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento
				+ ", rut=" + rut + ", asistencia=" + asistencia + "]";
	}
	

	
	
}
