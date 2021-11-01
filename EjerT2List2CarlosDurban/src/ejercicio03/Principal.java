package ejercicio03;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejercicio 3
		/* Crear un array de enteros unidimensional de 8 posiciones. Rellenarlo con números leídos por teclado
		 * y mostrar la media de todos los elementos y la cantidad de números "cero" introducidos.
		 */
		System.out.println("Bienvenido al programarrays!");
		System.out.println("Vamos a calcular la media y el número de numCeros introducidos");
		int tam = 8, numCeros = 0, opcion = 0, cero = 0;
		double media = 0.0, sum = 0.0;
		double [] lista = new double [tam]; 
		do {
			numCeros = 0;
			media = 0;
			sum = 0;
			System.out.println("Pulse cualquier número para empezar a introducir números");
			System.out.println("Pulse 0 para salir");
			opcion = Leer.datoInt();
			if (opcion != cero) {
				for (int i = 0; i < lista.length; i++) {
					System.out.println("Escriba el número de la posición " + (i+1) + ": ");
					lista[i] = Leer.datoDouble();
					sum = sum + lista[i];
					if ( lista[i] == 0) {
						numCeros++;
					}	
				}
			
		
				media = sum / lista.length;
				System.out.printf("\nLa media de los números introducidos es %.2f", media);
				System.out.println("\nEl número de numCeros introducido es " + numCeros);
			}
		}while (opcion != cero);
		System.out.println("Gracias por usar el programa");
	}

}
