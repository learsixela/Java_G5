package com.desafiolatam.f20211221.models;

import java.util.Date;

public class Nieto extends Profesor {

	public Nieto() {
		super();
	}

	public Nieto(String nombre, String apellido, Date fechaNacimiento, String rut, boolean asistencia) {
		super(nombre, apellido, fechaNacimiento, rut, asistencia);
	}

	@Override
	public String toString() {
		return "Nieto [toString()=" + super.toString() + "]";
	}
	

}
