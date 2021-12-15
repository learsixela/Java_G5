package com.desafiolatam.f20211214;

public class Main {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i == 0 || i == n-1) {
					System.out.printf("*");
				}else {
					//i=1;j=3
					//i=2;j=2
					//i=3;j=1
					//	0 == (5-1)-1 = 3
					if(j == (n-1)-i) {
						System.out.printf("*");
					}else {
						System.out.printf(" ");
					}
				}						
			}
			System.out.println();
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				//primera fila
				if(i == 0 && j < n-1) {
					System.out.printf("*");
				}else if(i == 0 && j == n-1) {
					System.out.printf(" ");
				}
				
				//ultima fila
				if(i == n-1 && j > 0) {
					System.out.printf("*");
				}else if(i == n-1 && j == 0) {
					System.out.printf(" ");
				}
				
				//no es la primera ni ultima fila
				if(i > 0 && i < n-1) {
					if(j > 0 && j < n-1) {
						System.out.printf("*");
					}else {
						System.out.printf(" ");
					}
				}
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i==j) {
					System.out.printf("*");
				} else if(i == (n-1)-j) {
					System.out.printf("*");
				}else {
					System.out.printf(" ");
				}

				//0.0			 0.4
				//	1.1 	1.3
				//  	2.2
				//	3.1 	3.3
				//4.0 			4.4
			}
			System.out.println();
		}
		
	}

}