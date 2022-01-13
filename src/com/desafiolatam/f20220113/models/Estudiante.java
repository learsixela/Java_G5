package com.desafiolatam.f20220113.models;

import com.desafiolatam.f20220113.interfaces.MetodosInterface;

public class Estudiante extends Persona implements MetodosInterface{

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

	@Override
	public void respirar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		
	}
}
