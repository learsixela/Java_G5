package com.desafiolatam.f20211229;

public class Main {

	public static void main(String[] args) {
		//una linea
		/*
		 * mas de 
		 * una linea
		 * */
		
		//variables primitivas
		//int, long, float, double, char, byte, boolean 
		
		//variables objetos
		//String,Integer, Long, Float, Double, Boolean
		
		//null !=""
		
		//tipo nombre_variable = valor a asignar;
		int edad = 18;
		Integer edad2= 18;
		float altura = 1.73f;
		double peso = 85.47d;
		
		Float altura2 =1.73f;
		
		boolean isMayor = false;
		char letra = 'a';
		
		/*** STRING ***/
		//asdfASDF 123456!"#!"#$
		String texto ="el mensaje 1234564!$"; //new String(" informacion");
		System.out.println(texto.length());//cantidad de elementos
		String palabraLarga = "electroencefalografista";
		System.out.println(palabraLarga.length());
		String texto1= palabraLarga.substring(0,7);//[0,7[		
		System.out.println(texto1);
		String texto2= palabraLarga.substring(7,15);//
		System.out.println(texto2);
		String texto3 = palabraLarga.substring(15);
		System.out.println(texto3);
		String numeros = texto.substring(11, 18);
		System.out.println(numeros);
		System.out.println(palabraLarga);
	}

}
