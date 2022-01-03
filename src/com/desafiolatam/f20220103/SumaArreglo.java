package com.desafiolatam.f20220103;

import java.util.Scanner;

public class SumaArreglo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arregloNumeros = { 12, 2342, 3234, 44, 4325, 6, 723, 4588, 5469, 1240};
		int suma = 0;// variable acumuladora; suma = suma + algo;

		// solicitar el ingreso del intervalo, inicio y fin
		System.out.println("Ingrese intervalo de inicio");
		int inicio = sc.nextInt();
		System.out.println("Ingrese intervalo de fin");
		int fin = sc.nextInt();

		// recorrer el arreglo
		for (int i = 0; i < arregloNumeros.length; i++) {
			if (arregloNumeros[i] >= inicio && arregloNumeros[i] <= fin) {
				suma = suma + arregloNumeros[i];
			}
		}
		System.out.println("la suma total es: " + suma);
		System.out.println("***********************************");
		/*
		 * sueldos
		 * **/
		
		int[] sueldos = { 400000, 760000, 1100000,650000, 654980, 987300, 700450, 442300 };
		int sumaSueldos = 0;
		int contador = 0;
		
		for (int i = 0; i < sueldos.length; i++) {
			if(sueldos[i] > 500000) {
				sumaSueldos = sumaSueldos + sueldos[i];
				contador++;
			}	
		}
		
		float promedioSueldos =  sumaSueldos/contador;
		
		System.out.println("El promedio de sueldos mayores a 500mil es: "+ promedioSueldos);
		
	}

	// metodo o funcion

}
