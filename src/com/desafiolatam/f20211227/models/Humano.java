package com.desafiolatam.f20211227.models;

import com.desafiolatam.f20211227.interfaces.Genericos;

public class Humano extends Omnivoro implements Genericos{

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

	@Override
	public void respirar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int caminar() {
		System.out.println("camina en 2 extremidades");
		return 2;
	}

	@Override
	public int correr() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
