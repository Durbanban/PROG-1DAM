package ejercicio11;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejercicio 11
		/* Escriba un programa al que se le pasen dos números a y b y calcule y muestre la operación ab
		 * No se puede usar la función pow ().
		 */
		
		System.out.println("Bienvenido a Potencias");
		int a = 0, b = 0, res = 0;
		System.out.println("Introduzca la base");
		a = Leer.datoInt();
		System.out.println("Ahora introduzca el exponente");
		b = Leer.datoInt();
		for (int i = 0; i <= b; i++) {
			res = a * (a*i);
			System.out.println(res);
		}
		System.out.printf("%d elevado a %d es igual a %d\n", a, b , res);
		System.out.println("Gracias por usar el programa");
	}

}
