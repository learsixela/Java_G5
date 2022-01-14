package com.desafiolatam.f20220113.models;

import java.util.List;

public class Herbivoro extends Animal {
	
	private List<String> vegetalesFavoritos;

	public List<String> getVegetalesFavoritos() {
		return vegetalesFavoritos;
	}

	public void setVegetalesFavoritos(List<String> vegetalesFavoritos) {
		this.vegetalesFavoritos = vegetalesFavoritos;
	}

	@Override
	public void caminar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		
	}

}
