package ejemploleer;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String apellidos;
		int edad = 0;
		double sueldo = 0.0;
		
		System.out.println("Hola, introduzca sus apellidos:");
		apellidos = Leer.dato();
		System.out.println("Tus apellidos son: " + apellidos);
		System.out.printf("Ahora introduzca edad: ");
		edad = Leer.datoInt();
		System.out.printf("Tienes %d años", edad);
		System.out.println("¿Cuánto cobra?");
		sueldo = Leer.datoDouble();
		System.out.printf("Su sueldo es %.2f €", sueldo);
		
	}

}
