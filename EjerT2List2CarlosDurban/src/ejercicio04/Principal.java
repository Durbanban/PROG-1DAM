package ejercicio04;
import java.util.Random;

import lectura.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejercicio 4 Listado 2
		/* Rellenar un array unidimensional de 10 posiciones con números aleatorios entre 1 y 99 y
		 * mostrar el número guardado en un lugar que indique el usuario por teclado.
		 */
		System.out.println("Bienvenido al creador de arrays aleatorio");
		Random num = new Random (System.nanoTime());
		int tam = 10, min = 1, max = 99, pos = 0, uno = 1;
		int [] arraynum;
		do {
			arraynum = new int [tam];
			// Carga el array con aleatorios
			for (int i = 0; i < arraynum.length; i++) {
				arraynum [i] = num.nextInt(max - min + 1) + min;
			}
			System.out.println("\nArray generado");
			System.out.println("¿Qué posición desea ver del array?");
			System.out.println("Pulse 0 para salir");
			pos = Leer.datoInt();
			if (pos > 0) {
				System.out.printf("El valor en la posición %d es %d\n", pos, arraynum[pos - uno]);
				// Muestra el array con aleatorios para ver si está bien la posición
				// elegida por el usuario.
				for ( int i = 0; i < arraynum.length; i++) {
					System.out.println("Posición " + (i+1) + "\t" + arraynum[i]);
				}
				
			}
		}while(pos > 0);
			
		System.out.println("Gracias por usar el programa");
	}

}
