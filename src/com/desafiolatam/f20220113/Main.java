package com.desafiolatam.f20220113;

import com.desafiolatam.f20220113.models.Estudiante;
import com.desafiolatam.f20220113.models.Persona;
import com.desafiolatam.f20220113.models.Profesor;

public class Main {

	public static void main(String[] args) {
		
		Persona persona = new Persona("Isra","1-9",true);
		System.out.println(persona.toString());
		
		persona.pasarLista();
		System.out.println("***");
		/**
		 * POLIMORFISMO
		 */
		//Profesor profesor = new Profesor();
		Persona profesor = new Profesor();
		profesor.setNombre("German");
		profesor.setRut("2-8");
		profesor.setPresente(true);
		//Polimorfismo de Sobrecarga, se ejecuta el metodo en el hijo
		profesor.pasarLista();
		System.out.println("***");
		System.out.println(profesor.toString());
		
		//CASTING -> convertir Persona a Profesor
		Profesor profe2 =  (Profesor) profesor;
		System.out.println(profe2.toString());
		
		//--
		Persona estudiante = new Estudiante(1234);
		//Polimorfismo de Sobrecarga, se ejecuta el metodo en el hijo
		estudiante.pasarLista();
		System.out.println("***");
		
		Estudiante estu = (Estudiante) estudiante;
		System.out.println(estu.getNumeroMatricula());
		
		
		
	}

}
