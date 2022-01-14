package com.desafiolatam.f20220114.indiana.models;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductoServicio {

	private ArrayList<Producto> listaProductos;

	public ProductoServicio() {
		super();
	}

	public ProductoServicio(ArrayList<Producto> listaProductos) {
		super();
		this.listaProductos = listaProductos;
	}

	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	@Override
	public String toString() {
		return "ProductoServicio [listaProductos=" + listaProductos + "]";
	}

	public void listarProductos() {
		Producto producto = new Producto();
		//for (Producto producto : listaProductos) {
			System.out.println("Datos del Producto:");
			System.out.println("Nombre articulo: "+ producto.getArticulo());
			System.out.println("Código: "+ producto.getCodigo());
			/*	Marca: Levis
				Color: Azul Marino
				Descripción: Es un Jean muy lindo con hermosos detalles
				Precio: 15000
				Talla: 42
				*/
		//}
	}

	public void agregarProductos() {
		Scanner sc = new Scanner(System.in);
		Producto producto = new Producto();
		
		System.out.println("*** Crear Producto ***");
		System.out.println("Ingresar nombre articulo:");
		String articulo = sc.nextLine();
		producto.setArticulo(articulo);
		//producto.setArticulo(sc.nextLine());
		
		/*Ingresa precio:
		15000
		Ingresa descripción:
		Es un Jean muy lindo con hermosos detalles
		Ingresa código:
		1500
		Ingresa talla:
		42
		Ingresa marca:
		Levis
		Ingresa color:
		Azul Marino*/
		
		

	}

}
