package com.desafiolatam.f20220110.models;

public class Relator extends Persona {

	@Override
	public String toString() {
		return "Relator [toString()=" + super.toString() + "]";
	}

	@Override
	public void metodoInicial() {
		System.out.println("estoy modificando el metodo del objeto padre");
	}
	
}
