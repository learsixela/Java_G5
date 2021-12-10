package cl.desafiolatam.f20211206;

import java.util.Iterator;
import java.util.Scanner;

public class SumaPar {

	public static void main(String[] args) {
		/**
		 * 
		 * */
		Scanner sc = new Scanner(System.in);
		int sumaParcial = 0;
		int sumaTotalPar = 0;
		int sumaTotalImpar = 0;
		System.out.println("Ingrese numero de fin");
		int numerofin = sc.nextInt();
		//ojo faltan validaciones
		
		for (int i = 1; i <= numerofin; i++) {
			if(i%2 == 0) {//validar numero par
				sumaTotalPar = sumaTotalPar + i;
			}else {
				sumaTotalImpar = sumaTotalImpar + i;
			}
			System.out.println("La suma parcial es "+sumaParcial);
			sumaParcial = sumaParcial + i;
			
		}
		
		System.out.println("La suma de los pares es "+ sumaTotalPar);
		System.out.println("La suma de los impares es "+ sumaTotalImpar);
		
		sc.close();
	}

}
