package com.desafiolatam.f20211221.models;

import java.util.Date;

public class Estudiante extends Persona {

	public Estudiante() {
		super();
	}

	public Estudiante(String nombre, String apellido, Date fechaNacimiento, String rut, boolean asistencia) {
		super(nombre, apellido, fechaNacimiento, rut, asistencia);
	}

	
}
