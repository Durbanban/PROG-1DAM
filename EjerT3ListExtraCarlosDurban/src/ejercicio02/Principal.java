package ejercicio02;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operaciones op = new Operaciones ();
		Vista vista = new Vista ();
		Cilindro cilindro;
		Piramide piramide;
		Cubo cubo;
		Esfera esfera;
		int opcion = 0;
		double radio = 0.0, altura = 0.0, base = 0.0, lado = 0.0;
		
		vista.darBienvenida();
		do {
			vista.darEleccion();
			opcion = Leer.datoInt();
			switch (opcion) {
				case 1:
					vista.pedirRadio();
					radio = Leer.datoDouble();
					vista.pedirAltura();
					altura = Leer.datoDouble();
					cilindro = new Cilindro (radio, altura);
					vista.darResultadoCilindro(cilindro, op.calcularVolumenCilindro(cilindro));
			}
			
		}while (opcion != 0);

	}

}
