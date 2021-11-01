package ejercicio11;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejercicio 11
		/* Escriba un programa al que se le pasen dos números a y b y calcule y muestre la operación ab
		 * No se puede usar la función pow ().
		 */
		
		int a = 0, b = 0, res = 1;
		
		System.out.println("Bienvenido a Potencias");
		do { 
			System.out.println("Para salir indique que la potencia sea negativa");
			res = 1;
			System.out.println("Introduzca la base");
			a = Leer.datoInt();
			System.out.println("Ahora introduzca el exponente");
			b = Leer.datoInt();
			if (b >= 0) {
				for (int i = 0; i < b; i++) {
					res = res * a;
				}
				System.out.printf("%d elevado a %d es igual a %d\n", a, b, res);
			}
		}while (b >= 0);
		
		System.out.println("Gracias por usar el programa");
	}

}
