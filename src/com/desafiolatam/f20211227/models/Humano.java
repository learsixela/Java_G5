package com.desafiolatam.f20211227.models;

public class Humano extends Omnivoro{

	private boolean razonamiento;

	public boolean isRazonamiento() {
		return razonamiento;
	}

	public void setRazonamiento(boolean razonamiento) {
		this.razonamiento = razonamiento;
	}

	public Humano() {
		super();
	}

	public Humano(boolean razonamiento) {
		super();
		this.razonamiento = razonamiento;
	}

	@Override
	public void metodoAnimal() {		
	}
	
	
}
