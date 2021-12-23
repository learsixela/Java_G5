package com.desafiolatam.f20211223;

import java.util.Scanner;

public class MainWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		
		while (i < 50) {
			i += 1;// i++; i=i+1;
			System.out.printf("Iteración %d\n", i);
		}
		
		System.out.println();
		
		int j = 0;
		do {
			j++;
			System.out.println("Iteracion J "+j);
		} while (j < 50);
		
		
	}

}
