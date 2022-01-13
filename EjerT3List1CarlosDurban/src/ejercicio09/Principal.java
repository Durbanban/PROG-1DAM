package ejercicio09;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String  pass;
		Ticket ticket = new Ticket (1.5);
		Maquina maquina = new Maquina ("123", 0.0);
		double cantInsertada = 0.0;
		int opcion = 0, numBillete = 0, opcionOperario = 0;
		boolean check;

		System.out.println("Bienvenido al metro de Triana");
		do {
			maquina.menuPrincipal();
			opcion = Leer.datoInt();
			switch (opcion) {
				case 1:
					System.out.println("¿Cuántos billetes quiere?");
					numBillete = Leer.datoInt();
					System.out.println("¿Qué cantidad va a introducir?");
					cantInsertada = Leer.datoDouble();
					check = maquina.comprobarCompra(numBillete, cantInsertada, ticket);
					while (check) {
						System.out.println("Lo sentimos, la cantidad insertada no es suficiente");
						System.out.println("¿Cuántos billetes quiere?");
						numBillete = Leer.datoInt();
						System.out.println("¿Qué cantidad va a introducir?");
						cantInsertada = Leer.datoDouble();
						check = maquina.comprobarCompra(numBillete, cantInsertada, ticket);
					}
					maquina.devolverImporte(numBillete, cantInsertada, ticket);
					
					break;
				case 2:
					System.out.println("Introduzca la contraseña para operarios");
					pass = Leer.dato();
					while (maquina.pedirPassword(pass)) {
						System.out.println("Contraseña incorrecta, vuelva a intentarlo");
						pass = Leer.dato();
					}
					maquina.menuOperario();
					opcionOperario = Leer.datoInt();
					switch (opcionOperario) {
						case 1:
							System.out.println("El total de hoy es: " + maquina.getRecaudacion() + " €.");
							break;
						case 2:
							maquina.setRecaudacion(0.0);
							break;
						case 0:
							break;
						default:
							System.out.println("Elija una opción correcta");
							break;
					}
					break;
					
						
					
					
			}
		}while (opcion != 0);

	}

}
