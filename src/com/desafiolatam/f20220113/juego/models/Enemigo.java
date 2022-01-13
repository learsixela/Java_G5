package com.desafiolatam.f20220113.juego.models;

import com.desafiolatam.f20211222.juego.Personaje;
import com.desafiolatam.f20220113.juego.interfaces.Jugador;

public class Enemigo implements Personaje,Jugador {

	private int xActual;

	@Override
	public void mover(int x) {
		while (xActual < x) {
			xActual++;
		}

	}

	@Override
	public void saltar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ejecutarAccion(String accion) {
		// TODO Auto-generated method stub
		
	}

}
