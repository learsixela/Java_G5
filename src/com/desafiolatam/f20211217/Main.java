package com.desafiolatam.f20211217;

import com.desafiolatam.f20211217.models.Alimento;
import com.desafiolatam.f20211217.models.Animal;
import com.desafiolatam.f20211217.models.Auto;

public class Main {

	public static void main(String[] args) {
		//instancia -> invocar, llamar, declarar
		Auto auto = new Auto();//constructor vacio
		//llamado al metodo
		auto.miMetodo();
		System.out.println(auto.toString());
		//asignar un valor al atributo de la variable auto
		auto.setRuedas(4);
		auto.setColor("Verde");
		System.out.println(auto.toString());
		//obtener el valor de un atributo para la variable auto
		System.out.println(auto.getRuedas());
		System.out.println(auto.getColor());
		System.out.println(auto.getMotor());
		System.out.println(auto.getVelocidad());
		
		/**NUEVA VARIABLE*/
		//nueva instancia, usuamos el constructor con parametros
		Auto papu = new Auto("Negro",0.0f,5, 1.6f);
		papu.setVelocidad(320.0f);
		System.out.println(papu.toString());
		
		Auto autito = new Auto("Blanco", 3);
		System.out.println(autito.toString());
		//como asigno valores a los otros atributos?
		// no solo asigna, tambien sobre escribe
		autito.setMotor(2.0f);
		autito.setVelocidad(240.0f);
		autito.setColor("Cafe");
		System.out.println(autito.toString());
		
		System.out.println();
		
		Alimento alimento = new Alimento("Wiskat","Comida para el gatito");
		Alimento qwerty = new Alimento();
		
		Animal gato = new Animal("micho","Angora","Tricolor",qwerty);
		//System.out.println(gato.toString());
		System.out.println("El color es: "+ gato.getColor());
		System.out.println("El nombre es: "+gato.getNombre());
		System.out.println("Su raza es: "+gato.getRaza());
		
		gato.getAlimento().setComida("Catshow");
		System.out.println("Su alimento: "+gato.getAlimento().getComida()+" " +gato.getAlimento().getDescripcion());
		//System.out.println("descripcion comida: "+);
		
		System.out.println();
		auto.imprimirAlimento(alimento);
		
	}

}