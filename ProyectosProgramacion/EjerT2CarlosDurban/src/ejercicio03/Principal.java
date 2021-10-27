package ejercicio03;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejercicio 3
		/* Leer un número que será la cantidad de dinero que una persona quiere retirar de su cuenta
		bancaria. Mostrar un mensaje diciendo que “no es posible” si la cantidad que se quiere retirar
		es mayor que el saldo de la cuenta y el nuevo saldo si se ha podido retirar.
		 */
		
		double saldo = 550.50, retirada = 0.0, remanente = 0.0; 
		
		System.out.println("Bienvenido a tu banco\n");
		System.out.println("Le quedan " + saldo + "€ en su cuenta");
		System.out.println("Introduzca una cantidad a retirar: ");
		retirada = Leer.datoDouble();
		if (retirada > saldo) {
			System.out.println("No está permitido saca más dinero del que se tiene.");
		}else {
			remanente = saldo - retirada;
			System.out.printf("Ha sacado %.2f €\nLe quedan %.2f €.\n", retirada, remanente);
			
		}
		System.out.println("Gracias por usar este cajero");
			
	}

}
