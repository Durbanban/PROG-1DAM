package ejercicio03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idCole = 0, idAlumno = 0;
		Set <Alumno> listaAlumnos = new HashSet <Alumno> ();
		
		Alumno a1 = new Alumno (idAlumno + 1, "Carlos Jesús", "Durbán Viloca", new ArrayList <Nota> (), 30);
		
		CrudAlumno crudAlumno;
		System.out.println("Bienvenido a la EscuelApp");
		
		System.out.println("Indique el id del colegio");
		idCole = Leer.datoInt();
		
		Colegio c = new Colegio (idCole, listaAlumnos);
		crudAlumno = new CrudAlumno (listaAlumnos);
		
		crudAlumno.mostrarAlumnos();
		
		
		
		
	}

}
