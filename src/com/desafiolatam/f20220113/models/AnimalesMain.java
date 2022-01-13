package com.desafiolatam.f20220113.models;

public class AnimalesMain {

	public static void main(String[] args) {
		Animal gato = new Gato(); 
		Animal perro = new Perro();
		
		gato.haceSonido();
		gato.dormir();
		
		perro.haceSonido();
		perro.dormir();
		
		//no se puede crear una instancia de una clase abstracta
		//Animal animal = new Animal();
		
		Gato tom = new Gato();

	}

}
