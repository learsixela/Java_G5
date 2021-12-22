package com.desafiolatam.f20211221;

import com.desafiolatam.f20211221.figuras.Circulo;
import com.desafiolatam.f20211221.figuras.Figura;
import com.desafiolatam.f20211221.figuras.Triangulo;

public class MainFiguras {

	public static void main(String[] args) {
		
		Figura circulo = new Circulo();		
		circulo.pintar();		
		Figura triangulo = new Triangulo();
		
		Triangulo tr = (Triangulo) triangulo;		
		Triangulo tri = (Triangulo) new Figura();
		
	
	}

}
