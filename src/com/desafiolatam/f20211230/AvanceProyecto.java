package com.desafiolatam.f20211230;

import java.util.Scanner;

public class AvanceProyecto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 0; 0>x<100;  100;
		//solicitar en avance
		System.out.println("Ingrese el porcentaje de avance del proyecto ");
		// capturar el valor
		float avance = sc.nextFloat();
		//comparar con los parametros
		if(avance == 0) {
			System.out.println("Proyecto aun no ha iniciado");
		}else if(avance > 0 && avance < 100 ) {
			System.out.println("Proyecto tiene un "+ avance +"% de avance");
		}else {
			System.out.println("El proyecto esta concluido");
		}
		
		
	}

}
