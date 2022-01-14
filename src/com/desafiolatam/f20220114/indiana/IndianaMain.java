package com.desafiolatam.f20220114.indiana;

import java.util.Scanner;

import com.desafiolatam.f20220114.indiana.models.ExportarTxt;
import com.desafiolatam.f20220114.indiana.models.Menu;
import com.desafiolatam.f20220114.indiana.models.ProductoServicio;

public class IndianaMain {

	public static void main(String[] args) {
		// Inicio de Sistema
		Scanner sc = new Scanner(System.in);
		ProductoServicio ps= new ProductoServicio();
		ExportarTxt exportarTxt = new ExportarTxt();
		int opcion = 0;
		// instancia de menu
		Menu menu = new Menu();
		do {
			menu.menu1();
			try {
				System.out.println("Ingrese una opción:");
				opcion = sc.nextInt();
				sc.nextLine();

				if (opcion == 1) {
					// llamado al metodo Listar Producto
					ps.listarProductos();
				} else if (opcion == 2) {
					// Agregar Producto
					ps.agregarProductos();
				} else if (opcion == 3) {
					// Exportar Datos
					exportarTxt.exportar();
				} else if (opcion == 4) {
					System.out.println("adios...");
				}

			} catch (Exception e) {
				opcion = 0;
			}

		} while (opcion < 1 || opcion > 4);
		
	}

}
