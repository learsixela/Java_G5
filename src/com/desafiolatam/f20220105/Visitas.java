	package com.desafiolatam.f20220105;

public class Visitas {

	public static void main(String[] args) {
		
		float promedio = promedio(args);
		System.out.println("Para la entrada anterior, el resultado es: "+ promedio);
	}
	
	public static float promedio(String[] args) {
		int sumaTotal = 0;//variable = variable + algo;
		for (int i = 0; i < args.length; i++) {
			//conversion String a numero
			sumaTotal = sumaTotal + Integer.parseInt(args[i]);			
		}
		float promedio = sumaTotal / args.length;
		return promedio;		
	}

}
