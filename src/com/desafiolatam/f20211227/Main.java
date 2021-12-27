package com.desafiolatam.f20211227;

import com.desafiolatam.f20211227.models.Animal;
import com.desafiolatam.f20211227.models.Bebe;
import com.desafiolatam.f20211227.models.Humano;
import com.desafiolatam.f20211227.models.Tigre;

public class Main {

	public static void main(String[] args) {
		//clases abstractas, no se puede implementar
		//Animal animal = new Animal();
		//Omnivoro onmi = new Omnivoro();
		Humano humano = new Humano();
		humano.metodoOmnivoro();
		
		Tigre tiger = new Tigre();
		tiger.setPeso(0);
		
		/**
		 * CLASES ABSTRACTAS
		 * no se puede implementar
		 * Solo clases abstractas implementan metodos abstractos
		 * Metodos abstractos solo se definen, no llevan {}
		 * Las clases abstractas que heredan de otra clase abstract no implementan sus metodos
		 * Las clases concretas deben sobre escribir los metodos
		 * */
		/*¿Cuando utilizar clases abstractas?*/		
		//Bebe bb = new Bebe();
		
		Animal animalBB = new Humano();
		
		
		
	}

}