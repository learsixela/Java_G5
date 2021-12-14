package com.desafiolatam.f20211214;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Ejemplo2 {

	public static void main(String[] args) {
		//if - else if -  else

		int numero = -10;
		
		if(numero < 0) {
			System.out.println("Si es verdadero se imprime");
		}else if(numero > 0) {
			System.out.println(" si se cumple el else if el numero es positivo mayor a cero");
		}else {
			System.out.println("El numero es cero por default");
		}
		
		for (int i = 0; i <= 9; i+=2) {//i = i+2
			System.out.println("valor i:" + i);
			if(i >=5) {
				break;
			}
		}
		System.out.println();
		String[] arregloVocales = {"a","e","i","o","u"};//arregloVocales.length = 5
		for (int i = 0; i < arregloVocales.length; i++) {
			//acceder por posicion
			//arregloVocales[i];
			System.out.println("valor posicion i:" + i+ " valor elemento: "+arregloVocales[i]);
		}
		System.out.println();
		ArrayList<String> vocales = new ArrayList<String>();
		
		vocales.add("e");
		vocales.add("i");
		vocales.add("a");
		vocales.add("o");
		vocales.add("u");
		
		for (int i = 0; i < vocales.size(); i++) {
			System.out.println("valor posicion i:" + i+ " valor elemento: "+vocales.get(i));
		}
		System.out.println();
		
		for (Iterator iterator = vocales.iterator(); iterator.hasNext();) {
			String vocal = (String) iterator.next();
			
			System.out.println("vocal: "+ vocal);
		}
		
		Collections.sort(vocales);
		Collections.reverse(vocales);
		System.out.println(vocales);
		
		for (int fila = 0; fila < 3; fila++) {
			for (int columnas = 0; columnas < 2; columnas++) {
				System.out.println("valor de fila: "+fila +" valor columna: "+columnas);
			}
		}
	}

}
