package com.desafiolatam.f20220107.models;

import java.lang.reflect.Constructor;

public class Guitarra {
	private String tipoMastil;
	private String marca;
	public Guitarra() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Guitarra(String tipoMastil, String marca) {
	super();
	this.tipoMastil = tipoMastil;
	this.marca = marca;
}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
}
