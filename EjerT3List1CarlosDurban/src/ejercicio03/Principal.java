package ejercicio03;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double altura = 0.0, radio = 0.0;
		Cilindro c1;
		
		System.out.println("Bienvenido al calculador de volúmenes para cilindros");
		do {
			System.out.println("\nIntroduzca una altura para el cilindro");
			System.out.println("Pulse 0 para salir");
			altura = Leer.datoDouble();
			if (altura != 0) {
				System.out.println("Introduzca un radio para el cilindro");
				radio = Leer.datoDouble();
				c1 = new Cilindro (altura, radio);
				System.out.printf("Su cilindro elegido tiene %.2f cm de altura y %.2f cm de radio\n", c1.getAltura(), c1.getRadio());
				System.out.printf("El volumen de su cilindro es: %.2f cm\n", c1.calcularVolumen(altura, radio));
			}
		} while (altura !=0);
		System.out.println("Gracias por usar el programa");
		

	}

}
