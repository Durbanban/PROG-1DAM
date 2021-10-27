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
		System.out.println("Vamos a calcular la media y el número de ceros introducidos");
		int tam = 8, ceros = 0;
		double media = 0.0, sum = 0.0;
		double [] lista = new double [tam]; 
		System.out.println("A continuación va a introducir 8 números");
		for (int i = 0; i < lista.length; i++) {
			System.out.println("Escriba el número de la posición " + (i+1) + ": ");
			lista[i] = Leer.datoDouble();
			sum = sum + lista[i];
			if ( lista[i] == 0) {
				ceros++;
			}	
		}
		media = sum / lista.length;
		System.out.printf("\nLa media de los números introducidos es %.2f", media);
		System.out.println("\nEl número de ceros introducido es " + ceros);
		System.out.println("Gracias por usar el programa");
	}

}
