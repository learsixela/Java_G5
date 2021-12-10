package com.desafiolatam.utilidades;

import java.util.ArrayList;

public class Util {

	public static Double promedioArray(ArrayList<Integer> numeros) {
		int suma = 0;
		
		for (int i = 0; i < numeros.size(); i++) {
			suma = suma + numeros.get(i);
		}
		
		return (double) (suma/numeros.size());
	}
	
	public Float promedioArrayEstatico(String[] args) {
		int suma = 0;
		for (int i = 0; i < args.length; i++) {
			suma = suma + Integer.parseInt(args[i]);
		}
		
		return (float) (suma/args.length);
	}
}
