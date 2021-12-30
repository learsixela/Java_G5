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
		
		
		System.out.println("****** Hipotenusa***********");
		
		System.out.println("Ingrese cateto A");
		String catetoA = sc.nextLine();
		double catA= Double.parseDouble(catetoA);
		double catA2= Math.pow(catA, 2);
		
		System.out.println("Ingrese cateto B");
		String catetoB = sc.nextLine();		
		double catB= Double.parseDouble(catetoB);
		double catB2= Math.pow(catB, 2);
				
		Double hipo=Math.sqrt(catA2 + catB2 );		
		System.out.println("La hipotenusa es: "+hipo);
		
		//Math.pow()
		//System.out.println("math pow "+Math.pow(catA, 2));
		//System.out.println("math pow "+ Math.pow(catB, 2));
		
	}

}
