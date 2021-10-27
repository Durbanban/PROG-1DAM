package ejemploif;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad = 0, mayoria = 0;
		System.out.println("¿Con cuántos años se es mayor de edad en tu país?");
		mayoria = Leer.datoInt();
		System.out.println("¿Cuántos años tienes?");
		edad = Leer.datoInt();
		
		if ( edad >= mayoria) {
			System.out.println("Entre");
		}else {
			System.out.println("Pa casa");
		}
	}

}
