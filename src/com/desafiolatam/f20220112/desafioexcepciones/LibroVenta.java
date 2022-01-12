package com.desafiolatam.f20220112.desafioexcepciones;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LibroVenta {

	private String nombreVenta;
	private String fechaVenta;
	
	public LibroVenta() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LibroVenta(String nombreVenta, String fechaVenta) {
		super();
		this.nombreVenta = nombreVenta;
		this.fechaVenta = fechaVenta;
	}
	public String getNombreVenta() {
		return nombreVenta;
	}
	public void setNombreVenta(String nombreVenta) {
		this.nombreVenta = nombreVenta;
	}
	public String getFechaVenta() {
		return fechaVenta;
	}
	public void setFechaVenta(String fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	@Override
	public String toString() {
		return "LibroVenta [nombreVenta=" + nombreVenta + ", fechaVenta=" + fechaVenta + "]";
	}
	
	public void guardarVenta(Cliente cliente, Vehiculo vehiculo) {
		
		
		File fichero = new File("src/com/desafiolatam/f20220112/ficheros");
		//validando la existencia de la carpeta
		if(!fichero.exists()) {
			fichero.mkdirs();
		}
		
		//crear archivo
		File archivo = new File(fichero+"/nombreVenta.txt");
		
		//validando la existencia del archivo
		if(!archivo.exists()) {
			try {
				archivo.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			FileWriter archivoWriter = new FileWriter(archivo);
			BufferedWriter archivoBuff = new BufferedWriter(archivoWriter);
			
			archivoBuff.write(vehiculo.getPatente());//obteniendo el valor de el objeotr vehiculo
			archivoBuff.newLine();
			archivoBuff.write(""+cliente.getEdad());
			
			archivoBuff.newLine();
			archivoBuff.write(this.fechaVenta);//obteniendo valores de atributos propios
			archivoBuff.newLine();
			archivoBuff.write(this.nombreVenta);
			
			archivoBuff.close();//guardar los textos en el archivo
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
