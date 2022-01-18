package com.desafiolatam.f20220117;

public class InstitutoEducativo {
	//atributos
	private static InstitutoEducativo ie;
	private String nombre;
	
	//Contructor privado
	private InstitutoEducativo(String nombre) {
		System.out.println("nombre instituto: "+ nombre);
		this.nombre = nombre;		
	}
	
	//metodo crea la instancia unica de la clase
	public static InstitutoEducativo getSingleton(String nombre) {
		if (ie == null) {
			ie = new InstitutoEducativo(nombre);
		}else{
			System.out.println("No se puede instanciar nuevamente la clase");			
		}
		return ie;
	}

	//Getter y Setter
	public static InstitutoEducativo getIe() {
		return ie;
	}

	public static void setIe(InstitutoEducativo ie) {
		InstitutoEducativo.ie = ie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
