package com.desafiolatam.f20211221.models;

import java.util.Date;

public class Profesor extends Persona{

	public Profesor() {
		super();
	}

	public Profesor(String nombre, String apellido, Date fechaNacimiento, String rut, boolean asistencia) {
		super(nombre, apellido, fechaNacimiento, rut, asistencia);
	}

	@Override
	public String toString() {
		return "Profesor [toString()=" + super.toString() + "]";
	}

}
