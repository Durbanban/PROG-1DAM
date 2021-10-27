package ejercicio04;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejercicio 4
		/*Leer un número y mostrar por la salida estandar si dicho número es par o no par.
		 * 
		 */
		
		int a = 0, div = 2, result = 0;
		System.out.println("Bienvenido al programa de los pares");
		System.out.println("Introduzca un número para saber si es par: ");
		a = Leer.datoInt();
		result = a % div;
		if (result == 0){
			System.out.printf("%d es par\n", a);
		}else {
			System.out.printf("%d es impar\n", a);
			
		}
		System.out.println("Gracias por usar el programa");
		

	}

}
