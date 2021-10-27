package ejemplofor;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int topeI = 0, topeJ = 0;
		String nombre;
		System.out.println("Introduzca un tope para i");
		topeI = Leer.datoInt();
		System.out.println("Ahora un tope para j");
		topeJ = Leer.datoInt();
		System.out.println("Introduzca un nombre");
		nombre = Leer.dato();
		
		for (int i = 0; i < topeI; i++){
			System.out.println("Número " + (i+1) + " Hola: " + nombre);
			for (int j = 0; j < topeJ; j++) {
				System.out.println("Hola");
				
			}
		}

	}

}
