package com.desafiolatam.f20220103;

public class ArreglosMain {

	public static void main(String[] args) {
		/** Arreglos estaticos*/
		//conjunto de datos, separados por coma y ordenado segun su ingreso.
		//comienzan en la posicion cero
		//la cantidad de elemento del arreglo. (arreglo.length)
		//tipo[] variable = [a,b,c,d];
		
		int[] numeros = new int[4];
		System.out.println("tamaño del arreglo "+ numeros.length);
		System.out.println(numeros);
		
		//agregando un dato al arreglo
		numeros[1]= 456;
		numeros[0]= 5;
		System.out.println(numeros[0]);
		
		numeros[2]= 888;
		numeros[3]= -123;
		//numeros[4] = 7; //fuera de indice
		//System.out.println(numeros[4]);
		
		//arreglo, pre lleno
		String[] vocales = {"a","e","i","o","u"};
		//acceder a sus valores
		System.out.println("vocal en posicion 2: "+vocales[4]);
		System.out.println("vocales.length, cantidad de elementos: "+vocales.length);
		
		int[] pares = {2,4,6,8};
		//nombreArreglo[posicion]
		System.out.println(pares[3]);
				
		//RECORRER ARREGLO
		//vocales.length = 5
		for (int i = 0; i < vocales.length; i++) {
			System.out.println(vocales[i]);
		}
	}

}
