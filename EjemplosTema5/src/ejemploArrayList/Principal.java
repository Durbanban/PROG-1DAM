package ejemploArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tam = 6;
		List <String> lista = new ArrayList <String> ();
		List <String []> listaArrays = new ArrayList <String []> ();
		List <String> pila = new Stack <String> ();
		String [] nombres = {"pollo", "pollo2", "pollo3"};
		List <Alumno> listaAlumnos = new ArrayList <Alumno> ();
		
		Alumno a = new Alumno ("Miguel", 37, 4.7);
		Alumno a2 = new Alumno ("Álvaro", 42, 5.4);
		
		lista.add("Durbán");
		lista.add("Álvaro");
		System.out.println(lista);
		System.out.println(lista.get(1));
		lista.remove(0);
		System.out.println(lista.get(0));
		lista.clear();
		System.out.println(lista);
		listaArrays.add(nombres);
		System.out.println(listaArrays.get(0)[1]);
		listaAlumnos.add(0, a2);
		listaAlumnos.add(new Alumno ("Durbán", 30, 9.2));
		listaAlumnos.add(0, a);
		System.out.println(listaAlumnos);
		System.out.println(listaAlumnos.size());
		for (int i = 0; i < listaAlumnos.size(); i++) {
			System.out.println(listaAlumnos.get(i).getEdad() + " años");
		}
		for (Alumno alumno : listaAlumnos) {
			if (alumno.getNotaMedia() > 5) {
				System.out.println(alumno);
			}else {
				System.out.println("Suspendido");
			}
		}
		
	}

}
