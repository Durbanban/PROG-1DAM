package ejercicio02;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcionMenu, numDocu;
		String palabraDocu, telefono, destinatario;
		
		Documento doc;
		TarjetaVisita tj;
		Carta c;
		
		System.out.println("Bienvenido al generador de documentos");
		
		mostrarMenu();
		opcionMenu = Leer.datoInt();
		
		switch (opcionMenu) {
			case 1:
				System.out.println("Indique el número de veces que quiere la palabra");
				numDocu = Leer.datoInt();
				System.out.println("Indique la palabra");
				palabraDocu = Leer.dato();
				doc = new Documento (numDocu, palabraDocu);
				doc.imprimirDoc();
				break;
			case 2:
				System.out.println("Indique el número de veces que quiere la palabra");
				numDocu = Leer.datoInt();
				System.out.println("Indique la palabra");
				palabraDocu = Leer.dato();
				System.out.println("Indique el teléfono");
				telefono = Leer.dato();
				tj = new TarjetaVisita (numDocu, palabraDocu, telefono);
				tj.imprimirDoc();
				break;
			case 3:
				System.out.println("Indique el número de veces que quiere la palabra");
				numDocu = Leer.datoInt();
				System.out.println("Indique la palabra");
				palabraDocu = Leer.dato();
				System.out.println("Indique el destinatario");
				destinatario = Leer.dato();
				c = new Carta (numDocu, palabraDocu, destinatario);
				c.imprimirDoc();
				break;
			case 0:
				break;
			default:
				System.out.println("Por favor elija una opción correcta");
				break;
		}
		
		System.out.println("Gracias por usar el programa");
		
		

		

	}
public static void mostrarMenu () {
	System.out.println("Pulse 1 para imprimir un documento genérico");
	System.out.println("Pulse 2 para imprimir una tarjeta de visita");
	System.out.println("Pulse 3 para imprimir una carta");
	System.out.println("Pulse 0 para salir");
}

}
