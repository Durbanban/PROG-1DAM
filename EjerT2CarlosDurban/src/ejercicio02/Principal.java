package ejercicio02;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejercicio 2
		/* Leer dos números doubles. Vamos a dividir el primero entre el segundo y se debe
		 * mostrar un mensaje de error si el segundo es cero ANTES de hacer la operación.
		 * Mostrar el resultado de la división con dos decimales si no lo es.
		 */
		
		double dividendo = 0.0, divisor = 0.0, division = 0.0;
		System.out.println("Bienvenido al programa de divisiones realistas");
		System.out.println("Introduzca un número: ");
		dividendo = Leer.datoDouble();
		System.out.println("Introduzca un número para dividirlo: ");
		divisor = Leer.datoDouble();
		if ( divisor > 0) {
			division = dividendo / divisor;
			System.out.printf("El resultado de la división es: %.2f\n", division);
		}else {
			System.out.println("El divisor no puede ser 0");			
		}
		System.out.println("Gracias por usar el programa");
		

	}

}
