package ejercicio02;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejercicio 2 Listado 2
		/* Implementar un programa que rellene automáticamente un array de enteros con 10 posiciones, 
		 * cada elemento debe contener el valor del doble de su índice. Mostrar el resultado por pantalla.
		 */
		int tam = 10, multi = 2;
		int numeros [] = new int [tam];
		System.out.println("Bienvenido al rellenador de arrays para números enteros");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (i+1) * multi;
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("El índice " + (i+1) + " tiene el valor " + numeros[i]);
		}

	}

}
