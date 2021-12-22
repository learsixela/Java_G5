package com.desafiolatam.f20211222.models;

public class Cardiologo extends Medico{
	private String especialidad;

	public Cardiologo() {
		super();
	}

	public Cardiologo(String nombre, String rut, int edad, String especialidad) {
		super(nombre, rut, edad);
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	@Override
	public void consulta() {
		System.out.println("Cardiologia: Diagnostica y trata las enfermedades del corazón y del sistema circulatorio");
	}




	
	

}
