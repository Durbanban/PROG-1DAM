package ejercicio05;

import java.util.Random;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcionMenu = 0, tam = 7, maxS = 1200, minS = 1000, maxR = 600, minR = 100, numEmpleado = 0;
		double impuesto = 15.0, sueldo = 0.0, recaudacion = 0.0;
		
		Random num = new Random (System.nanoTime());
		
		sueldo = minS + (maxS - minS) * num.nextDouble();
		
		recaudacion = minR + (maxR - minR) * num.nextDouble();
		
		Empleado [] listaEmpleados = new Empleado [tam];
		
		while (numEmpleado < tam) {
			listaEmpleados [numEmpleado] = new Empleado ("Jorge Javier Vázquez", sueldo, recaudacion, "1");
			numEmpleado ++;
		}	
		

		
		
		System.out.println("Bienvenido a Güguel");
		mostrarMenu();
		opcionMenu = Leer.datoInt();
		switch (opcionMenu) {
			case 1:
				break;
			case 2:
				break;
			case 0:
				break;
			default:
				System.out.println("Por favor elija la opción correcta");
				break;
		}
		

	}
	
	public static void mostrarMenu () {
		System.out.println("Pulse 1 para calcular el sueldo de un empleado");
		System.out.println("Pulse 2 para calcular el sueldo total de la plantilla");
		
	}

}
