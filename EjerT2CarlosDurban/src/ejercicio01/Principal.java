package ejercicio01;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejercicio 1
		/* Leer 2 números y determinar el mayor de ellos. Mejorar el programa mostrando también la
		 * posibilidad de que sean iguales.
		 */
		double a = 0, b = 0;
		System.out.println("Bienvenido al programa que decide qué número es mayor");
		System.out.println("Introduzca el primer número: ");
		a = Leer.datoDouble();
		System.out.println("Introduzca el segundo número ");
		b = Leer.datoDouble();
		if(a > b) {
			System.out.printf("%.2f es mayor que %.2f", a, b);		
		}else if (a == b) {
			System.out.printf("%.2f es igual que %.2f", a, b);
		}else {
			System.out.printf("%.2f es mayor que %.2f", b, a);
			
		}
		System.out.println("\nGracias por usar el programa");

	}

}
