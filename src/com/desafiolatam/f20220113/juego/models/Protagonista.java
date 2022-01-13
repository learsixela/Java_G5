package com.desafiolatam.f20220113.juego.models;

import com.desafiolatam.f20220113.juego.interfaces.Jugador;
import com.desafiolatam.f20220113.juego.interfaces.Personaje;

public class Protagonista implements Personaje, Jugador {

	private int xActual;
	private int yActual;

	@Override
	public void mover(int x) {
		xActual = xActual + x;

	}

	@Override
	public void saltar() {
		// Aumentamos hasta 5
		while (yActual < 5) {
			yActual++;
		}
		// Cuando sea 5, disminuimos a 1 nuevamente
		while (yActual > 1) {
			yActual--;
		}

	}

	@Override
	public void ejecutarAccion(String accion) {
		if (accion.equals("saltar") && yActual == 1) {
			saltar();
		} else if (accion.equals("avanzar")) {
			mover(1);
		}

	}

}
