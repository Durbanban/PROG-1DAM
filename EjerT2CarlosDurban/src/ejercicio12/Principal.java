package ejercicio12;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejercicio 12
		/* Se desea realizar un programa que gestione las notas de un alumno del centro. Para ello, se
		 * necesita leer las notas de las 6 asignaturas de un solo alumno y mostrar por pantalla al final,
		 * la nota media y el número de suspensos que tiene. No usar una variable para cada nota, ni es
		 * necesario mostrar las notas de cada asignatura, solo la media y el número de suspensos.
		 */
		
		System.out.println("Bienvenido a tu evaluación");
		double nota = 0.0, media = 0.0, totalNotas = 0.0;
		int suspensos = 0, numNotas = 6, minNota = 0;
		do {
			suspensos = 0;
			media = 0.0;
			totalNotas = 0;
			for (int i = 0; i < numNotas && nota >= minNota; i++) {
				System.out.println("Introduzca una nota. Para salir introduzca un número negativo");
				nota = Leer.datoDouble();
				totalNotas = nota + totalNotas;
				if (nota < 5)
					suspensos++;
			}
			media = totalNotas / numNotas;
			System.out.printf("Su media de evaluación es: %.2f.\n", media);
			if (suspensos == 1) {
				System.out.println("Ha tenido " + suspensos + " suspenso esta evaluación.");
			}else if (suspensos == 0) {
				System.out.println("Esta evaluación no ha tenido ningún suspenso.");
			}else {
			System.out.println("Ha tenido " + suspensos + " suspensos esta evaluación.");
			}
		}while (nota >=0);
		System.out.println("Gracias por usar el programa.");
		
	}

}
