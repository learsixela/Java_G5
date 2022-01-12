package com.desafiolatam.f20220111;

import com.desafiolatam.f20220111.models.CalculoArea;

public class Main {
	
	
	
	public static void main(String[] args) {

		//calculo area 
		CalculoArea area = new CalculoArea();
		
		float resultado= area.calculoArea(5f, 2f);
		System.out.println("El area del triangulo es: "+resultado);
		float resultado2= area.calcularArea(4, 6);
		System.out.println(resultado2);
		
	}

}