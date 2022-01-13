package com.desafiolatam.f20220113.models;

public class Profesor extends Persona{

	private String cursoJefe;

	public Profesor() {
		super();
	}

	public Profesor(String cursoJefe) {
		super();
		this.cursoJefe = cursoJefe;
	}

	public Profesor(String nombre, String rut, boolean presente,String cursoJefe) {
		super(nombre, rut, presente);
		this.cursoJefe = cursoJefe;
	}

	public String getCursoJefe() {
		return cursoJefe;
	}

	public void setCursoJefe(String cursoJefe) {
		this.cursoJefe = cursoJefe;
	}

	@Override
	public String toString() {
		return "Profesor [cursoJefe=" + cursoJefe + ", toString()=" + super.toString() + "]";
	}

	public void pasarLista() {
		System.out.println("Registrar lista");
	}
	
	
}
