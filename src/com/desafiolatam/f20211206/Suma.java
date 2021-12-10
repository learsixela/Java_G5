package com.desafiolatam.f20211206;
import java.util.Scanner;

public class Suma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero=0;
		int correcto=0;
		int sumaTotal =0;
		do {			
			System.out.println("Ingrese un numero");
			try {
				numero= sc.nextInt();
			}catch (Exception e) {
				System.out.println(" error -> " + e);
			} 
			
			if(numero>0) {
				for(int i=0;i<= numero;i++) {
					sumaTotal = sumaTotal + i;
				}
				correcto=1;
			}else {
				System.out.println("Error ingreso datos");
			}
			
		}while(correcto==0);
		
		System.out.println("La suma total es "+sumaTotal);
		
		sc.close();
	}
}


 
 
