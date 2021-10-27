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
		int tam = 10,min = 0, max = 0, pos = 0, uno = 1;
		int [] arraynum;
		do {
			System.out.println("Escriba el mínimo valor posible ");
			System.out.println("Pulse -1 para salir");
			min = Leer.datoInt();
			if (min >= 0) {
			System.out.println("Escriba el máximo valor posible: ");
			max = Leer.datoInt();
			arraynum = new int [tam];
			//Carga el array con aleatorios
			for (int i = 0; i < arraynum.length; i++) {
				arraynum [i] = num.nextInt(max - min + 1) + min;
			}
			
			for ( int i = 0; i < arraynum.length; i++) {
				System.out.println("\t" + arraynum[i]);
			}
			
			System.out.println("¿Qué posición desea ver del array?");
			pos = Leer.datoInt();
			System.out.printf("El valor en la posición %d es %d\n", pos, arraynum[pos - uno]);
			}else {
				System.out.println("Hasta otra");
			}
			
		
		}while(min >= 0);
		System.out.println("Gracias por usar el programa");
	}

}
