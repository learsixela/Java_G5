package com.desafiolatam.f20211221;

import java.util.ArrayList;
import java.util.Iterator;

import com.desafiolatam.f20211221.models.Estudiante;
import com.desafiolatam.f20211221.models.Profesor;

public class Main {

	public static void main(String[] args) {

		ArrayList<Profesor> profesores = new ArrayList<Profesor>();
		ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
		
		Estudiante estudiante = new Estudiante();
		estudiante.setNombre("Zoe");
		estudiante.setApellido("Loren");
		estudiante.setAsistencia(true);		
		estudiantes.add(estudiante);
		
		estudiantes.add(new Estudiante("Ayun","Palma",null,null,true));
		estudiantes.add(new Estudiante("Donato","Palma",null,null,false));
		
		/********************************/
		profesores.add(new Profesor("Pamela","Arriagada",null, "1-9",true));
		
		/*recorrer las listas*/
		
		for (Iterator iterator = estudiantes.iterator(); iterator.hasNext();) {
			Estudiante alumno = (Estudiante) iterator.next();
			System.out.println(alumno.toString());
			
		}
		System.out.println("For Each");
		for (Estudiante estudiantefe : estudiantes) {
			System.out.println(estudiantefe.toString());
		}
		
		System.out.println();
		for (int i = 0; i < profesores.size(); i++) {
			System.out.println(profesores.get(i).toString());
		}
		

	}

}