package com.desafiolatam.f20220105;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String rutaDefault = "src/com/desafiolatam/";
		
		System.out.println("Ingrese nombre de carpeta o directorio");
		String carpeta = sc.nextLine();//"f20220107";
		System.out.println("Ingrese nombre del archivo y su extension");
		String nombreArchivo =  sc.nextLine();//"Main";
		
		File directorio = new File(rutaDefault+carpeta);//("ruta") rutaDefault+carpeta
		File archivo = new File(rutaDefault+carpeta+"/"+nombreArchivo);//("nombre_archivo.extension")
		//src/com/desafiolatam/f20220106/Main.java
		//exists()		
		if(directorio.exists()) {
			System.out.println("Directorio ya existe");
		}else {
			System.out.println("No existe el directorio, procederemos a crearlo");
			//mkdirs()
			directorio.mkdir();
		
			/**CREACION DE ARCHIVO*/
			if(archivo.exists()) {
				System.out.println("Archivo ya existe");
			}else {
				System.out.println("No existe el archivo, procederemos a crearlo");
				//mkdirs()
				//archivo.mkdir();//solo sirve para crear carpetas
				try {
					//createNewFile()
					archivo.createNewFile();
				} catch (IOException e) {
					System.out.println("No se puede crear el archivo");
					//e.printStackTrace();
				}
			}
		}
		
		
		
	}
}
