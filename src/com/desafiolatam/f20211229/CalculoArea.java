package com.desafiolatam.f20211229;

import java.util.Scanner;

public class CalculoArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el alto del rectangulo");
		String alto= sc.nextLine();
		System.out.println("Ingrese el largo del rectangulo");
		String largo= sc.nextLine();
		//area=a*l;
		int area = Integer.parseInt(alto) * Integer.parseInt(largo);

		System.out.println("El area del rectangulo es: "+ area);
	}

}
