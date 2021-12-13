package com.desafiolatam.f20211213;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DiaADia {

	public static void main(String[] args) {
		escribirMain();
	}
	
	public static void escribirMain()
	{
		Scanner sc = new Scanner(System.in);
		Date fecha = new Date();
		DateFormat nuevoDia = new SimpleDateFormat("yyyyMMdd");
		String hoy = nuevoDia.format(fecha);

		String rutaBase = "src/com/desafiolatam/f"+hoy;
		
		// ruta de mi carpeta
		File carpeta = new File(rutaBase);
		// si no exite la ruta, crea la nueva carpeta
		if(!carpeta.exists()) {
			carpeta.mkdir();
		}
		
		try {
			File archivo = new File(rutaBase+"/Main.java");
			if(!archivo.exists()) {
				archivo.createNewFile();
			}
			
			FileWriter fileWriter = new FileWriter(archivo);
			BufferedWriter buff = new BufferedWriter(fileWriter);
			buff.write("package com.desafiolatam.f"+hoy+";");
			buff.newLine();
			buff.newLine();
			buff.write("public class Main {");
			buff.newLine();
			buff.newLine();
			buff.write("	public static void main(String[] args) {");
			buff.newLine();
			buff.newLine();
			buff.write("	}");
			buff.newLine();
			buff.newLine();
			buff.write("}");
			buff.close();
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
