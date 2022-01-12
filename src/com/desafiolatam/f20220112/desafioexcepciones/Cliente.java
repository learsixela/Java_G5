package com.desafiolatam.f20220112.desafioexcepciones;

import com.desafiolatam.f20220110.models.Persona;

public class Cliente extends Persona{

	private int edad;

	public Cliente() {
		super();
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Cliente [edad=" + edad + "]";
	}

	
}
