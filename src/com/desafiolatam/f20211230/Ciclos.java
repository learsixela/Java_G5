package com.desafiolatam.f20211230;

public class Ciclos {

	public static void main(String[] args) {
		// Ciclo FOR
		//definir variable; condicion de acceso(true)/termino(false); incremento o decremento
		//i++; i = i + 1; i+=1
		//i--; i = i - 1; i-=1 
		
		for(int i = 0; i < 5;i++) {//i=5
			System.out.println(i);
		}
		
		int edad = 20;
		while(edad>10) {
			System.out.println("hola clase");
			edad= edad - 2;
		}
		//edad = 8
		do {
			System.out.println("mayor a 10");
			edad = edad -1;//edad= 10
		}while(edad > 10);
		
	}

}
