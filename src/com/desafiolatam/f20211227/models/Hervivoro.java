package com.desafiolatam.f20211227.models;

import java.util.List;

public abstract class Hervivoro extends Animal{
	private List<String> vegetalesFavoritos;

	public List<String> getVegetalesFavoritos() {
		return vegetalesFavoritos;
	}

	public void setVegetalesFavoritos(List<String> vegetalesFavoritos) {
		this.vegetalesFavoritos = vegetalesFavoritos;
	}
	
	public abstract void metodoHervivoro();

	@Override
	public void metodoAnimal() {
		// TODO Auto-generated method stub
		
	}
}
