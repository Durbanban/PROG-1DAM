package ejercicio09;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String  defPassword = "123", pass;
		Ticket ticket = new Ticket (1.5);
		Maquina maquina = new Maquina (defPassword);
		double cantInsertada = 0.0;
		int opcion = 0, numBillete = 0;
		
		System.out.println("Bienvenido al metro de Triana");
		System.out.println("Pulse 1 para comprar billetes");
		System.out.println("Pulse 2 para opciones de operario");
		System.out.println("Pulse 0 para salir");
		opcion = Leer.datoInt();
		switch (opcion) {
			case 1:
				numBillete = Leer.datoInt();
				cantInsertada = Leer.datoDouble();
				System.out.println(maquina.comprarBilletes(numBillete, cantInsertada, ticket.getPrecio()));
			case 2:
				System.out.println("Introduzca la contraseña de operario");
				pass = Leer.dato();
				while (maquina.pedirPassword(pass) != true) {
					System.out.println("Contraseña incorrecta, vuelva a intentarlo");
					pass = Leer.dato();
				}
					
				
				
		}

	}

}
