package ejercicio04;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 0;
		String frase = "";
		Copiado f1 = new Copiado();
		
		
		System.out.println("Bienvenido al repetidor de frases");
		do {
			System.out.println("Introduzca un número");
			System.out.println("Pulse 0 para salir");
			num = Leer.datoInt();
			if (num > 0) {
				System.out.println("Ahora introduzca una frase");
				frase = Leer.dato();
				System.out.println("Su frase repetida es ");
				System.out.println(f1.repetirFrase(num, frase));
			} else if (num < 0) {
				System.out.println("Por favor, intruduzca un número positivo");
			}
		} while (num != 0);
		System.out.println("Gracias por usar el programa");

	}

}
