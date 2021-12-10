package cl.desafiolatam.f20211206;

import java.util.Scanner;

public class Ciclos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0;i<4;i++) {
			System.out.println(2 * i);
		}
		//i=5
		//i++ ; i = i + 1 ; i+=1
		
		Integer numero1 = 5;
		while(numero1 == 5 ) {
			System.out.println("Dentro del while");
			numero1=6; 
		}
		
		boolean menorEdad = false;
		do {			
			System.out.println("Dentro del DO-While");
			System.out.println("Ingrese edad");
			Integer edad= sc.nextInt();
			if (edad>=18) {
				menorEdad= true;
			}else {
				menorEdad= false;
			}

		}while(menorEdad );
		
		
		sc.close();
	}

}
