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
		auto.aumentarVelocidad(-14);
		System.out.println(auto.toString());
		//frenamos
		auto.aumentarVelocidad(false, true);
		System.out.println(auto.toString());
		
	}

}