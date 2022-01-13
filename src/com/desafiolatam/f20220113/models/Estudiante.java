package com.desafiolatam.f20220113.models;

public class Estudiante  extends Persona{

	private int numeroMatricula;

	public Estudiante() {
		super();
	}

	public Estudiante(int numeroMatricula) {
		super();
		this.numeroMatricula = numeroMatricula;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	
	public void pasarLista() {
		System.out.println("Presente...");
	}
}
