package ejercicio07;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejercicio 7
		// Leer un número entero y mostrar su tabla de multiplicar.
		
		int a = 0, b = 0, res = 0, tope = 10, salir = 0;
		System.out.println("Bienvenido a la tabla de multiplicar");
		do {
			System.out.println("Introduzca un número para imprimir su tabla de multiplicar: ");
			System.out.println("Pulse 0 para salir");
			b = 0;
			a = Leer.datoInt();
			while(b < tope && a != 0) {
				b++;
				res = a * b;
				System.out.printf("%d x %d = %d\n", a, b, res);
			
		}
		
		}while(a != salir);
		System.out.println("Gracias por usar el programa");

		

	}

}
