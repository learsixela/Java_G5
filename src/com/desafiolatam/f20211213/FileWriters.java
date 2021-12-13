package com.desafiolatam.f20211213;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String rutaBase = "src/com/desafiolatam/f20211213";
		
		// ruta de mi carpeta
		File carpeta = new File(rutaBase);
		// si no exite la ruta, crea la nueva carpeta
		if(!carpeta.exists()) {
			carpeta.mkdir();
		}
		
		try {
			File archivo = new File(rutaBase+"/index.txt");
			if(!archivo.exists()) {
				archivo.createNewFile();
			}
			
			FileWriter fileWriter = new FileWriter(archivo);
			fileWriter.write("cualquier cosa\n");
			fileWriter.write("otra linea");
			//fileWriter.close();
			
			BufferedWriter buff = new BufferedWriter(fileWriter);
			buff.write("\nOtro String\n");
			
			System.out.println("Ingrese texto a agregar");
			String texto = sc.nextLine();
			buff.write(texto);
			buff.close();
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("fin file");
	}

}
