package com.desafiolatam.f20220113.models;

//solo una clase abstracta define metodos abstractos
public abstract class Animal {
	
	
	public void haceSonido() {
		System.out.println("cuac cuac");
	}
	//metodo abstracto, definicion del metodo
	public abstract void caminar();
	public abstract void dormir();
	
}
