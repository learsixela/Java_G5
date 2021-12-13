package com.desafiolatam.f20211213;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Archivos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese nombre de carpeta a crear");
		String nombreCarpeta = sc.nextLine();
		String rutaBase = "src/com/desafiolatam/";
		
		// ruta de mi carpeta
		File carpeta = new File(rutaBase+nombreCarpeta);
		// si no exite la ruta, crea la nueva carpeta
		if(!carpeta.exists()) {
			carpeta.mkdir();
		}
		//archivo.exists();
		
		try {
			File archivo = new File(rutaBase+nombreCarpeta+"/index.html");
			archivo.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("fin file");
	}

}
