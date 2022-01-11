package ejercicio01;

public class Operaciones {
	
	public void mostrarNumeroElegido (int num) {
		System.out.println("Has elegido el número " + num);
	}
	
	public String determinarSigno (int num) {
		String cadena = "";
		if (num > 0) {
			cadena = "es positivo";
		}else {
			cadena = "es negativo";
		}
		return cadena;
	}
	
	public void darBienvenida () {
		System.out.println("Bienvenido al calculador de signos.");
	}
	
	public void darEleccion () {
		System.out.println("\n\nIntroduzca un número para saber su signo");
		System.out.println("Pulse 0 para salir del programa (0 es un número positivo)");
	}
	
	public void darDespedida () {
		System.out.println("Gracias por usar el programa");
		System.out.println("Hasta la próxima");
	}

}
