package ejercicio02;

public class Vista {
	
	public void darBienvenida () {
		System.out.println("Bienvenido al programa de cálculo de volúmenes");
	}
	
	public void darEleccion () {
		System.out.println("\nPulse 1 para crear un cilindro y calcular su volúmen");
		System.out.println("Pulse 2 para crear una pirámide y calcular su volúmen");
		System.out.println("Pulse 3 para crear un cubo y calcular su volúmen");
		System.out.println("Pulse 4 para crear una esfera y calcular su volúmen");
		System.out.println("Pulse 0 para salir del programa");
	}
	
	public void pedirRadio () {
		System.out.println("Introduzca un valor para el radio");
	}
	
	public void pedirAltura () {
		System.out.println("Introduzca un valor para la altura");
	}
	
	public void pedirBase () {
		System.out.println("Introduzca un valor para la base");
	}
	
	public void pedirLado () {
		System.out.println("Introduzca un valor para el lado");
	}
	
	public void darDespedida () {
		System.out.println("Gracias por usar el programa");
		System.out.println("Hasta la próxima");
	}
	
	public void darResultadoCilindro (Cilindro c, double volumen) {
		System.out.println("Su cilindro tiene " + c.getRadio() + " centímetros de radio y "
				+ c.getAltura() + " centímetros de altura");
		System.out.printf("Y su volúmen es de %.2f centímetros cúbicos\n\n", volumen);
	}

}
