package com.desafiolatam.f20211222.juego;

public class MainJuego {
	public static void main(String[] args) {
		Protagonista prota = new Protagonista();
		prota.ejecutarAccion("avanzar");
		prota.ejecutarAccion("avanzar");
		prota.ejecutarAccion("avanzar");
		prota.ejecutarAccion("saltar");
	}
	//NO SE PUEDE INSTANCIAR UNA INTERFAZ
	//Jugador jugador = new Jugador();
	

}
