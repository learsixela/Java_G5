package com.desafiolatam.f20211228;

public class Gato {
	//metodo main, el primeroen ejecutarse
	public static void main(String[] args) {

		//mostrar un mensaje por consola		
		System.out.println("\t123");//"Cadena de texto"
		System.out.println("sdfgvb\nsdfgb");
		System.out.println(2+9);
		System.out.printf("\n\ttexto4\n\n\n\n");
		System.out.printf("2\n");
		
		//tipo_de_dato  nombre_variable = valor a asignar 
		int numeroCero = 0;
		
		//"2" != 2 != "dos"
		int numeroDos = 2;
		String palabraDos = "dos";
		String caracterDos = "2";
		
		float nota = 4.5f;
		long nota2 = 54l;
		double promedio = 4.3;	
		
		//instancia de String
		String palabra = new String("Esto es una palabra");
		
		//SUMA DE STRING (concatenar o juntar textos)
		
		System.out.println("hola"+" clase "+palabraDos);
		System.out.println("123" + promedio);//String +tipoNumero = String
		System.out.println("789"+ true);
		
		System.out.println(palabraDos + numeroDos + ";");
		System.out.println("mi edad es: "+ 20+" años");
		System.out.println(1+2+3+4+5+6+7+8+"9");
		System.out.println("1"+2+3+4+5+6+7+8+9);
		
		int edad = 18;
		edad = 25;
		edad = 55;

	}
}
