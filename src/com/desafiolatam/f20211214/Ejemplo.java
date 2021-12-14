package com.desafiolatam.f20211214;

import java.util.Scanner;

public class Ejemplo {
	
	public static void main(String[] gato) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la palabra");
		String palabra = sc.nextLine();
		if(contieneSoloLetras(palabra)) {
			System.out.println(" son solo letras");
		}else {
			System.out.println("contiene numeros o caracteres");
		}

		System.out.println("Ingrese el numero");
		Integer numero =sc.nextInt();
		//llamado al metodo
		//ejecutar();
		ejecutarConParametros(palabra,numero);
		ejecutarConParametros("informacion", 124);
		
		//llamado con  retorno
		System.out.println(metodoConRetorno());//System.out.println("esto es un parametro de retorno");
		String retorno = metodoConRetorno();
		System.out.println(retorno);
		
	}
	
	public static void Ejemplo() {
		System.out.println("Metodo ejecutar");
	}
	// texto = palabra-> texto = "esto es un texto"
	//numero = 789
	public static void ejecutarConParametros(String texto, Integer numero) {
		System.out.println(texto.length());
		System.out.println(numero.toString());
		System.out.println(metodoConRetorno());
	}
	
	// metodos con retorno
	public static String metodoConRetorno() {
		String retorno = "esto es un parametro de retorno";
		return retorno;
	}
	
	public static boolean contieneSoloLetras(String cadena) {
	    for (int x = 0; x < cadena.length(); x++) {
	        char c = cadena.charAt(x);
	        // Si no está entre a y z, ni entre A y Z, ni es un espacio
	        if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' ')) {
	            return false;
	        }
	    }
	    return true;
	}
	
}
