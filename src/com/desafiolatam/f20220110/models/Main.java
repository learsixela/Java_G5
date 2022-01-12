package com.desafiolatam.f20220110.models;

import java.util.Scanner;

import com.desafiolatam.f20220110.models.Automovil;
import com.desafiolatam.f20220110.models.Persona;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//instancia de una clase
		//String palabra = new String("esto es ...");//"esto es una palabra";
		Automovil automovil = new Automovil();
		System.out.println( automovil.toString() );
		
		//asignando valores a los atributos
		automovil.setColor("Rojo");
		automovil.setMotor("1234qwr");
		automovil.setRuedas(4);
		automovil.setVelocidad(350.5f);
		
		Automovil auto = new Automovil();
		auto.setColor("Blanco");
		auto.setMotor("qrwet555");
		auto.setRuedas(5);
		auto.setVelocidad(240.0f);
		System.out.println( auto.toString() );
		
		System.out.println( automovil.toString() );
		automovil.arranca();
		System.out.println(automovil.getColor());
		System.out.println(auto.getColor());
		
		System.out.println("****");
		//instancia de la clase persona
		Persona isra = new Persona();
		//agregando informacion a los atributos
		isra.setNombre("Israel");
		isra.setAltura(1.73f);
		isra.setRut("13.123.123-4");
		//llamando al metodo toString de persona
		System.out.println(isra.toString());
		
		Persona donato = new Persona();
		donato.setNombre("Donato Mijail");
		System.out.println(donato.getNombre());
		
		//instancia con constructor con parametros 
		Persona pame = new Persona("Pamela","1-9",1.68f);
		
		System.out.println(pame.toString());
		Automovil autito = new Automovil("verder",120.5f,4,"qwregg554");
		System.out.println(autito.getMotor());
		System.out.println(autito.getColor());
		autito.setColor("kjwefhglajfglasdkghj");
		System.out.println(autito.getColor());
		

	}

}
