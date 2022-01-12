package com.desafiolatam.f20220110.models;

import com.desafiolatam.f20220110.models.Direccion;
import com.desafiolatam.f20220110.models.Estudiante;
import com.desafiolatam.f20220110.models.Persona;
import com.desafiolatam.f20220110.models.Relator;

public class ColaboracionMain {

	public static void main(String[] args) {
		
		//instancia persona
		Persona persona = new Persona();
		//agregando informacion
		persona.setNombre("Cristian");
		persona.setRut("14.532.353-k");
		persona.setAltura(1.8f);
		
		//atributo de colaboracion
		Direccion direccion = new Direccion();
		direccion.setNombre("Manuel Bulnes");
		direccion.setNumero(123);
		direccion.setCiudad("Concepcion");
		
		//asignacion de atributo de tipo objeto
		persona.setDireccion(direccion);
		
		System.out.println(persona.toString());
		
		System.out.println("**************");
		Estudiante estudiante = new Estudiante();
		estudiante.setNombre("Hugo");
		estudiante.setPuntaje(70f);
		estudiante.setDireccion(direccion);
		System.out.println(estudiante.toString());
		estudiante.metodoInicial();
		System.out.println(estudiante.sumaPadre());
		
		
		System.out.println("***************");
		Relator relator = new Relator();
		relator.setNombre("German");
		System.out.println(relator.toString());
		relator.metodoInicial();
		System.out.println(relator.sumaPadre());
	}

}
