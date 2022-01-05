package com.desafiolatam.f20220104;

import java.util.ArrayList;
import java.util.Collections;

public class Main2 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(5);
		numeros.add(1);
		numeros.add(8);
		numeros.add(-1);
		numeros.add(9);
		numeros.add(9);
		numeros.add(-1);
		numeros.add(-1);
		System.out.println(numeros);
		System.out.println(Collections.min(numeros)); // 1
		System.out.println(Collections.max(numeros));
		System.out.println("frecuency "+Collections.frequency(numeros, 1)); 

		System.out.println("frecuency num min "+Collections.frequency(numeros, Collections.min(numeros))); 
		System.out.println("frecuency num max "+Collections.frequency(numeros, Collections.max(numeros))); 
	}

}
