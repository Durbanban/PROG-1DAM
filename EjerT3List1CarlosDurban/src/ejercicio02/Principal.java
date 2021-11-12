package ejercicio02;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		Operaciones b = new Operaciones ();
		System.out.println("Bienvenido al programa de la naturaleza numérica");
		do {
			
		
			System.out.println("Introduzca un número entero");
			System.out.println("Para salir pulse 0.");
			
			a = Leer.datoInt();
			
			System.out.println("El número " + a + " es " + b.positivoNegativo(a) + ". Además es " + b.parImpar(a));
		}while (a != 0);
		System.out.println("Gracias por usar el programa");
		
	}

}
