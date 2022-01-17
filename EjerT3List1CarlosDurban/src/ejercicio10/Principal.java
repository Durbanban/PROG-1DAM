package ejercicio10;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion = 0, numeroNotas = 0;
		double nota = 0.0;
		String nombreAlumno;
		Alumno a1;
		Gestion g = new Gestion ();
		Nota [] notas;
		Nota n;
		
		g.menuPrincipal();
		opcion = Leer.datoInt();
		switch (opcion) {
			case 1:
				System.out.println("Introduzca un nombre para el alumno");
				nombreAlumno = Leer.dato();
				System.out.println("Introduzca el número de notas que tiene el alumno");
				numeroNotas = Leer.datoInt();
				notas = new Nota [numeroNotas];
				for (int i = 0; i < notas.length; i++) {
					System.out.println("Indique la nota " + (i+1));
					nota = Leer.datoDouble();
					n = new Nota (nota);
				}
				
				
				
				
		}

	}

}
