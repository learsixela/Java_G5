package com.desafiolatam.f20211222.juego;

public interface Jugador {
	//definicion
	void saltar();
	void ejecutarAccion(String accion);
	//NO TIENEN CONSTRUCTOR
	//NO SE EXTIENDEN, SOLO SE IMPLEMENTAN
	//NO TIENEN ATRIBUTOS(campos de instancia) 
	//¿Puede una interfaz,implementar otra interfaz?
	//NO
	//¿Puede una interfaz,extender de otra interfaz?
	//Si , y mas de una
}
