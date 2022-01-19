package com.desafiolatam.f20220106;

import com.desafiolatam.utilidades.Util;

public class Main {

	public static void main(String[] arreglo) {
		
		resta();
		suma(5,9);
		suma(8,1);
		resta();
		
		int valor = multiplicacion();
		System.out.println(valor);
		int resultadoDivision = division(18,3);
		System.out.println(resultadoDivision);
		Util util = new Util();
		util.promedioArray(null);
	}
	
	public static void resta() {
		int resultado = 4-1;
		System.out.println(resultado);
	}
	
	public static void suma(int numero1, int numero2) {
		int resultado = numero1 +numero2;
		System.out.println(resultado);
	}
	
	public static int multiplicacion() {
		int resultado = 7 * 3;
		
		return resultado;		
	}
	
	public static int division(int dividendo, int divisor) {
		int resultado = dividendo/divisor;		
		return resultado;
	}
	
}