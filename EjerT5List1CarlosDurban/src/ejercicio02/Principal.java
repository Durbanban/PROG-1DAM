package ejercicio02;

import java.util.ArrayList;
import java.util.List;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombreSocio, nombreSeleccion;
		double descEdad = 0.0, descFamiliaNumerosa = 0.0, cuota = 0.0, cuotaExtra = 0.0, precioPista = 10.0, precioNuevoPista = 0.0;
		int idClub = 0, opcionMenu = 0, idSocio = 0, edadSocio = 0, numeroHijos = 0, 
				opcionVip = 0, aux = 0, topeEdad = 0, topeHijos = 0, idPista = 0, numPistas = 9, opcionPistas = 0, idSeleccionPista = 0;
		boolean esVip;
		Socio s;
		List <Socio> listaSocios = new ArrayList <Socio> ();
		List <Pista> listaPistas = new ArrayList <Pista> ();
		List <Pista> pistasAlquiladas = new ArrayList <Pista> ();
		
		while (listaPistas.size() <= numPistas) {
			listaPistas.add(new Pista ((idPista + 1), true, null, precioPista));
			idPista ++;
		}
		System.out.println("Bienvenido al Club Pijeda");
		
		System.out.println("Introduzca el id del Club");		
		idClub = Leer.datoInt();
		System.out.println("Introduzca la cuota de socios");
		cuota = Leer.datoDouble();
		System.out.println("Introduzca el extra de la cuota de socios VIP");
		cuotaExtra = Leer.datoDouble();
		System.out.println("Introduzca la edad a partir de la cuál se hace descuento");
		topeEdad = Leer.datoInt();
		System.out.println("Introduzca el número de hijos a partir del cuál se considera familia numerosa");
		topeHijos = Leer.datoInt();		
		System.out.println("Introduzca el descuento por familia numerosa");
		descFamiliaNumerosa = Leer.datoDouble();
		System.out.println("Introduzca el descuento por edad de oro");
		descEdad = Leer.datoDouble();
		
		Club club = new Club (idClub, listaSocios, listaPistas);
		
		
		
		do {
			mostrarMenuPrincipal ();
			opcionMenu = Leer.datoInt();
			switch (opcionMenu) {
			case 1:
				System.out.println("Indique el nombre completo");
				nombreSocio = Leer.dato();
				System.out.println("Introduzca la edad");
				edadSocio = Leer.datoInt();
				System.out.println("Introduzca el número de hijos");
				numeroHijos = Leer.datoInt();
				do {
					System.out.println("¿Es vip? Pulse 1 si lo es. Pulse 0 si no lo es.");
					opcionVip = Leer.datoInt();
					esVip = convertirIntABoolean (opcionVip);
				} while (opcionVip != 1 && opcionVip != 0);
				switch (opcionVip) {
					case 1:
						s = new SocioVip ((idSocio + 1), nombreSocio, edadSocio, numeroHijos, cuota, pistasAlquiladas, cuotaExtra);
						club.agregarSocio(s);
						idSocio ++;
						break;
					case 0:
						s = new Socio ((idSocio + 1), nombreSocio, edadSocio, numeroHijos, cuota);
						club.agregarSocio(s);
						idSocio ++;
						break;
					default:
						break;
				}
				break;
			case 2:
				club.mostrarSocios();
				System.out.println("Elija al socio");
				aux = Leer.datoInt();
				System.out.printf("La cuota de ese socio es: %.2f €\n", club.getListaSocios().get(aux - 1).calcularCuotaSocio(topeEdad, topeHijos, descEdad, descFamiliaNumerosa));
				break;
			case 3:
				System.out.println("Introduzca el nombre del socio");
				nombreSeleccion = Leer.dato();
				System.out.println("Introduzca el número de hijos actual");
				aux = Leer.datoInt();
				club.mostrarError(club.modificarNumeroHijos(aux, nombreSeleccion));			
				break;
			case 4:
				club.mostrarSociosVIP();
				break;
			case 5:
				System.out.println("Seleccione un socio");
				club.mostrarSocios();
				aux = Leer.datoInt();
				club.borrarUsuario(aux);
				break;
			case 6:
				do {
					mostrarMenuPistas ();
					opcionPistas = Leer.datoInt();
					switch (opcionPistas) {
						case 1:
							System.out.println("Actualmente hay " + club.calcularPistasDisponibles() + " pistas disponibles");
							break;
						case 2:
							System.out.println("Indique el id de la pista");
							idSeleccionPista = Leer.datoInt();
							System.out.println("Indique el nombre del Socio que la alquila");
							nombreSeleccion = Leer.dato();
							club.mostrarError(club.asignarPista(idSeleccionPista, nombreSeleccion));
							break;
						case 3:
							System.out.println("indique el id de la pista");
							idSeleccionPista = Leer.datoInt();
							System.out.println("Indique el precio nuevo");
							precioNuevoPista = Leer.datoDouble();
							club.modificarPrecioPista(idSeleccionPista, precioNuevoPista);						
							break;
						case 0:
							break;
						default:
							System.out.println("Por favor elija una opción correcta");
							break;
					}
				}while (opcionPistas != 0);
				break;
			case 0:
				break;
			default:
				System.out.println("Por favor elija una opción correcta");
				break;
			}
		}while (opcionMenu != 0);
		
		System.out.println("Gracias por usar el programa");
		
		
		
		

	}
	
	public static void mostrarMenuPrincipal () {
		System.out.println("Pulse 1 para dar de alta un socio");
		System.out.println("Pulse 2 para calcular cuota de un socio");
		System.out.println("Pulse 3 para modificar el número de hijos de un socio");
		System.out.println("Pulse 4 para mostrar todos los socios VIP");
		System.out.println("Pulse 5 para borrar a un socio");
		System.out.println("Pulse 6 para gestión de pistas");
		System.out.println("Pulse 0 para salir");
	}
	
	public static void mostrarMenuPistas () {
		System.out.println("Pulse 1 para mostrar el numero de pistas disponibles");
		System.out.println("Pulse 2 para asignar una pista");
		System.out.println("Pulse 3 para modificar el precio de una pista");
		System.out.println("Pulse 0 para volver al menú principal");
	}
	
	public static void mostrarMenuModificar () {
		System.out.println("Pulse 1 para modificar el id del socio");
		System.out.println("Pulse 2 para modificar el nombre del socio");
		System.out.println("Pulse 3 para modificar la edad del socio");
		System.out.println("Pulse 4 para modificar el número de hijos del socio");		
	}
	
	public static boolean convertirIntABoolean (int opcion) {
		if (opcion >= 1) {
			return true;
		}else {
			return false;
		}
	}

}
