package ejemplosuma;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0, num2 = 0, suma = 0;
		System.out.println("Bienvenido a la suma de números enteros");
		System.out.println("Introduzca un número: ");
		num1 = Leer.datoInt();
		System.out.println("Introduzca ahora el otro número a sumar: ");
		num2 = Leer.datoInt();
		suma = num1 + num2;
		System.out.println("La suma de " + num1 + " y " + num2 + " es igual a: " + suma);
		System.out.println("Gracias por usar el programa");
	}

}
