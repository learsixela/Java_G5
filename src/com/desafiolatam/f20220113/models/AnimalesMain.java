package com.desafiolatam.f20220113.models;

import java.util.ArrayList;

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
		tom.haceSonido();
		
		Caballo caballo = new Caballo();
		Conejo conejo = new Conejo();
		
		//listaAnimales
		ArrayList<Animal> listaAnimales = new ArrayList<Animal>();
		listaAnimales.add(caballo);
		listaAnimales.add(conejo);
		listaAnimales.add(tom);
		
		//listaHerbivoros
		ArrayList<Herbivoro> listaHerbivoros = new ArrayList<Herbivoro>();
		listaHerbivoros.add(caballo);
		listaHerbivoros.add(conejo);
		
		//listaHerbivoros.add(tom);//NO SE PUEDE

		Herbivoro herbi = new Herbivoro();
		
		listaAnimales.add(herbi);
		listaHerbivoros.add(herbi);
	}

}
