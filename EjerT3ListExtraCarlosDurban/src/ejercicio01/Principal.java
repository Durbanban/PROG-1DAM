package ejercicio01;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operaciones op = new Operaciones ();
		int numero = 0;
		
		op.darBienvenida();
		do {
			op.darEleccion();
			numero = Leer.datoInt();
			if (numero != 0) {
			op.mostrarNumeroElegido(numero);
			System.out.println("El número " + numero + " " + op.determinarSigno(numero));
			}
		}while (numero != 0);
		
		op.darDespedida();
		

	}

}
