package com.desafiolatam.f20220113.juego;

import com.desafiolatam.f20220113.juego.models.Protagonista;

public class JuegoMain {

	public static void main(String[] args) {
		Protagonista prota = new Protagonista();
		prota.ejecutarAccion("avanzar");
		prota.ejecutarAccion("avanzar");
		prota.ejecutarAccion("avanzar");
		prota.ejecutarAccion("avanzar");
		prota.ejecutarAccion("saltar");
	}

}
