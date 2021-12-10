package com.desafiolatam.f20211209;

public class EjercicioSuma {

	public static void main(String[] args) {
		/* Construir un programa el cual nos permita sumar los 
			valores que est√©n entre 1 y 10 dentro de un arreglo.
		*/
		
		Integer suma = suma();
		System.out.println("La suma de los numeros entre 1 y 10 es  "+suma);

	}
	
//‚ó? Crear un m√©todo llamado Suma que retorna un n√∫mero entero de la suma.
	public static Integer suma() {
//‚ó? Dentro del m√©todo suma, declarar una variable local llamada suma que parte en cero.		
		Integer suma = 0; 
//‚ó? Inicializar el arreglo con valores aleatorios.
		int[] arregloNumeros = {11,544,32,10,15,17,55}; //arregloNumeros.length = 7
//‚ó? Recorrer el arreglo con un ciclo for.
		for (int i = 0; i < arregloNumeros.length; i++) {
/*			‚ó? Dentro del ciclo, realizar condici√≥n if donde 
			preguntamos por los valores que est√°n en el 
			intervalo solicitado.*/
			int numero = arregloNumeros[i];
			
			if(numero > 1 && numero < 10) {
//‚ó? Si la condici√≥n se cumple, sumar√° todos los valores.				
				suma = suma + numero;
			}
		}				
		return suma;
	}
}
