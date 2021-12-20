package com.desafiolatam.f20211220;

import com.desafiolatam.f20211220.models.Auto;

public class Main {

	public static void main(String[] args) {
		//instancia de Auto
		Auto auto = new Auto();
		System.out.println(auto.toString());
		//aumenta automaticamente en 10
		auto.aumentarVelocidad();
		System.out.println(auto.toString());
		//aceleramos con un valor especifico
		auto.aumentarVelocidad(15);
		System.out.println(auto.toString());
		//frenamos
		auto.aumentarVelocidad(true, true);
		System.out.println(auto.toString());
		auto.pruebaEstatica = "test de atributo publico";
		System.out.println(auto.pruebaEstatica);
		
		
		System.out.println("*********");
		Auto autito = new Auto();
		System.out.println(autito.toString());
		
	}

}