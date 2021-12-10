package com.desafiolatam.f20211207;

import java.util.Scanner;

public class CiclosAnidados {

	public static void main(String[] args) {
		//numero tabla de multiplicar
		for (int i = 0; i <= 2; i++) {//i=1
			System.out.println("********** tabla del "+ i +"*************");
			for (int j = 0; j <= 2; j++) {//j=0
				//System.out.println("i "+ i +" - j "+j +" = "+ (i*j));
				System.out.println(i +" * "+ j +" = "+ (i*j));
			}
			
		}
		
		Scanner sc = new Scanner(System.in);
		int cantidad = 0;// definicion de variable
		boolean error = false;// variables de control

		// solicitamos el ingreso de datos
		try {// error controlado
			do {
				// capturar el dato
				System.out.println("Ingrese cantidad de veces a mostrar *");
				cantidad = sc.nextInt();
			} while (cantidad < 1);
			error = false;
		} catch (Exception e) {
			System.out.println("Error de ingreso");
			error = true;
		}

		if (!error) {
			// validar el dato, no negativo y mayor a cero
			if (cantidad > 0) {
				// realizar la accion
				String caracter = "";
				for (int i = 1; i <= cantidad; i++) {
						for (int j = 1; j <= i; j++) {
							caracter += i;//caracter = caracter + j;
							System.out.printf("%d",j);
						}
						caracter = "";
						System.out.printf("\n");
				}
				
			} else {
				System.out.println("SOlo numeros positivos mayor a cero");
			}
		}
		

		System.out.println("********* Fin **************");
	}

}
