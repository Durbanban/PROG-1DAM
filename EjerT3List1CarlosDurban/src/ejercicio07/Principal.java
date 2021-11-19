package ejercicio07;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = "";
		double saldo = 0.0, ingreso= 0.0, nuevoSaldo = 0.0, retirada = 0.0;
		int opcion = 0;
		CuentaCorriente cliente1;
		System.out.println("Bienvenido a Banca Tiesa");
		System.out.println("Desde 1750");
		System.out.println("Introduzca su nombre para abrir una cuenta");
		nombre = Leer.dato();
		cliente1 = new CuentaCorriente (saldo, nombre);
		do {
			System.out.println("Para consultar su saldo pulse 1");
			System.out.println("Para hacer un ingreso pulse 2");
			System.out.println("Para hacer una retirada pulse 3");
			System.out.println("Para calcular su saldo en dólares pulse 4");
			System.out.println("Para salir pulse 0");
			opcion = Leer.datoInt();
			if (opcion != 0) {
				switch (opcion) {
					case 1:
						System.out.println("Su saldo es: €" + cliente1.getSaldo());
						break;
					case 2:
						System.out.println("Introduzca la cantidad a ingresar");
						System.out.println("Pulse 0 para volver al menú principal");
						ingreso = Leer.datoDouble();
						if (ingreso != 0) {
							nuevoSaldo = cliente1.ingresar(ingreso);
							cliente1.setSaldo(nuevoSaldo);
						}
						break;
					case 3:
						System.out.println("Introduzca la cantidad a retirar");
						retirada = Leer.datoDouble();
						
						nuevoSaldo = cliente1.retirar(retirada);
						cliente1.setSaldo(nuevoSaldo);
						break;
					case 4:
						System.out.printf("Su saldo en dolares es: %.2f $", cliente1.convertir(nuevoSaldo));
						break;
					default:
						System.out.println("Por favor, pulse una opción posible");
						
						
				}
			}
		} while (opcion != 0);
	}

}
