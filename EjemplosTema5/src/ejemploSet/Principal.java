package ejemploSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random num = new Random (System.nanoTime());
		int max = 99, min = 16, maxNota = 10, minNota = 0;
		
		Set <String> lista = new HashSet <String> ();
		
		Set <Alumno> listaAlumnos = new HashSet <Alumno> ();
		
		lista.add("Durbán");
		lista.add("Álvaro");
		lista.add("Ángel");
		lista.add("Miguel");
		System.out.println(lista + "\n");
		
		listaAlumnos.add(new Alumno ("Rafa", (num.nextInt(max - min + 1) + min), (minNota + (maxNota - minNota) * num.nextDouble())));
		listaAlumnos.add(new Alumno ("Luismi", (num.nextInt(max - min + 1) + min), (minNota + (maxNota - minNota) * num.nextDouble())));
		listaAlumnos.add(new Alumno ("Durbaner", (num.nextInt(max - min + 1) + min), (minNota + (maxNota - minNota) * num.nextDouble())));
		listaAlumnos.add(new Alumno ("Fernando", (num.nextInt(max - min + 1) + min), (minNota + (maxNota - minNota) * num.nextDouble())));
		for (Alumno alumno : listaAlumnos) {
			if (alumno.getNotaMedia() >= 5) {
				System.out.println(alumno + "APROBADO");
			}else {
				System.out.println(alumno + "SUSPENSO");
			}
		}
		
		System.out.println("\n" + listaAlumnos.size());
		Alumno [] listado;
		
		
		System.out.println("\n" + listaAlumnos.toArray()[0] + "\n");
		for (int i = 0; i < listaAlumnos.size(); i++) {
			if (((Alumno)listaAlumnos.toArray()[i]).getEdad() >= 18) {
				System.out.println(listaAlumnos.toArray()[i] + "MAYOR DE EDAD");
			}else {
				System.out.println(listaAlumnos.toArray()[i] + "MENOR DE EDAD");
			}
		}
		
		listaAlumnos.remove(listaAlumnos.toArray()[0]);
		System.out.println();
		for (Alumno alumno : listaAlumnos) {
			System.out.println(alumno);
		}
		

	}

}
