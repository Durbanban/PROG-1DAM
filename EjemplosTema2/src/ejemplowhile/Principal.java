package ejemplowhile;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Estructura while
		int a = 0, tope = 0;
		
		System.out.println("Introduzca un número que haga de tope de impresión: ");
		System.out.println("Si desea salir, pulse 0");
		tope = Leer.datoInt();
		if (tope != 0) {
			while (a < tope) {
				System.out.println("El número es: " + (a + 1));
				a++;
			}
		}else {
			System.out.println("Ha salido con éxito");
		}
	}	
}
