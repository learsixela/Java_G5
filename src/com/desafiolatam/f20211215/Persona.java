package com.desafiolatam.f20211215;

import java.util.Date;

public class Persona {
	//atributos
	private String nombre;
	private int edad;
	private Date fechaNacimiento;
	private Integer rut;//1-9
	private String dv;//k
	
	public Persona() {
		super();
	}

	public Persona(String nombre, Integer rut, String dv) {
		super();
		this.nombre = nombre;
		this.rut = rut;
		this.dv = dv;
	}
	
	public Persona(String nombre, int edad, Date fechaNacimiento, Integer rut, String dv) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.fechaNacimiento = fechaNacimiento;
		this.rut = rut;
		this.dv = dv;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Integer getRut() {
		return rut;
	}

	public void setRut(Integer rut) {
		this.rut = rut;
	}

	public String getDv() {
		return dv;
	}

	public void setDv(String dv) {
		this.dv = dv;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", fechaNacimiento=" + fechaNacimiento + ", rut=" + rut
				+ ", dv=" + dv + "]";
	}
	
	public static void caminar() {
		
	}
	public static void comer() {
		
	}
	public static void dormir() {
		
	}
	


}
