package com.desafiolatam.f20220105;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Archivos {

	public static void main(String[] args) {
		escribirEnArchivo();

		leerArchivo();
	}

	public static void escribirEnArchivo() {
		// crearlo y escribir en el
		File archivo = new File("src/com/desafiolatam/f20220105/ejemplo.txt");
		try {

			if (!archivo.exists()) {// SI no existe
				archivo.createNewFile();
			}

			FileWriter escribirArchivo = new FileWriter(archivo);
			BufferedWriter buffArchivo = new BufferedWriter(escribirArchivo);

			buffArchivo.write("12;123123;123123;ASDF");
			buffArchivo.write("\n\tHola clase2");
			buffArchivo.newLine();
			buffArchivo.write("esto es otra informacion");
			buffArchivo.close();

			System.out.println("***************");
		} catch (IOException e) {
			System.out.println("Error");
		}
	}

	public static void leerArchivo() {
		// ruta del archivo
		File archivo = new File("src/com/desafiolatam/f20220105/ejemplo.txt");
		try {
			FileReader archivoReader = new FileReader(archivo);
			BufferedReader archivoBuff = new BufferedReader(archivoReader);

			String informacion = archivoBuff.readLine();
			do {
				if (informacion != null) {
					System.out.println(informacion);
				}
				informacion = archivoBuff.readLine();
			} while (informacion != null);
			

		} catch (FileNotFoundException e) {
			System.out.println("Error al leer archivo");
		} catch (IOException e) {
			System.out.println("Error ");
		}
	}

}
