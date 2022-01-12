package com.desafiolatam.f20220107.models;

public class Escritorio {

	private String tamanio;
	private String tipo;
	public Escritorio() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Escritorio(String tamanio, String tipo) {
		super();
		this.tamanio = tamanio;
		this.tipo = tipo;
	}
	public String getTamanio() {
		return tamanio;
	}
	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Escritorio [tamanio=" + tamanio + ", tipo=" + tipo + "]";
	}
	
	
}
