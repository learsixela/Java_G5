package com.desafiolatam.f20220103;

public class Main {

	public static void main(String[] args) {

		// numero%2-> el resto de dividir un numero por dos
		//== 0 ; != 0		
		//variable = variable + algo;
		int sumaTotal = 0;//variable acumuladora o contadora
		int sumaPar = 0;
		int sumaImpar = 0;
		
		//0,1,2,3,4
		for (int i = 0; i <= 4; i++) {
			
			if(i%2== 0) {
				//par
				sumaPar = sumaPar + i;
			}else {
				//impar
				sumaImpar = sumaImpar + i;
			}
			
			sumaTotal = sumaTotal + i;
		}
		
		System.out.println("sumaTotal "+sumaTotal);
		System.out.println("sumaPar "+sumaPar);
		System.out.println("sumaImpar "+ sumaImpar);
		
	}

}