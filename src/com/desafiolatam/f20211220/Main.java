package com.desafiolatam.f20211220;

import com.desafiolatam.f20211220.models.Auto;

public class Main {

	public static void main(String[] args) {
		//instancia de Auto
		Auto auto = new Auto();
		auto.aumentarVelocidad();
		auto.aumentarVelocidad(0);
		auto.aumentarVelocidad(false, false);
		
		
	}

}