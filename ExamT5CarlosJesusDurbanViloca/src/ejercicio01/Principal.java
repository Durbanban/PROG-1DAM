package ejercicio01;

import java.util.ArrayList;
import java.util.List;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcionMenu = 0, idMensaje = 1, idBuscar = 0;
		double costeMensajes = 0.0;
		String nombre, cuerpo;
		List <Mensaje> listaMensajes = new ArrayList <Mensaje>();
		listaMensajes.add(new Mensaje(idMensaje++, "Ángel", "Buenos días"));
		listaMensajes.add(new Mensaje(idMensaje++, "Durbán", "Buenos días ángel tengo unas dudillas"));
		listaMensajes.add(new Mensaje(idMensaje++, "Álvaro", "Buenos días profesor"));
		listaMensajes.add(new Mensaje(idMensaje++, "David", "Hola ángel"));
		listaMensajes.add(new Mensaje(idMensaje++, "Ángel", "Hoy vamos a ver cómo se elimina con iterator"));
		listaMensajes.add(new Mensaje(idMensaje++, "David", "Pero tú dijiste"));
		listaMensajes.add(new Mensaje(idMensaje++, "Durbán","Tengo una duda"));
		listaMensajes.add(new Mensaje(idMensaje++, "Álvaro", "Eso es fácil"));
		listaMensajes.add(new Mensaje(idMensaje++, "Jose Ignacio", "Tú dijiste que eso no entraba en el examen"));
		listaMensajes.add(new Mensaje(idMensaje++, "Antonio", "¿Eso lo puedo hacer con un colador?"));
		listaMensajes.add(new Mensaje(idMensaje++, "Durbán", "Una duda Ángel"));
		listaMensajes.add(new Mensaje(idMensaje++, "Ángel", "Es el peor día de mi vida"));
		Whatsapp wapp = new Whatsapp(listaMensajes);
		System.out.println("Bienvenido a Whatsapp");
		do {
			mostrarMenuPrincipal();
			opcionMenu = Leer.datoInt();
			switch(opcionMenu) {
				case 1:
					System.out.println("Introduzca el nombre del contacto");
					nombre = Leer.dato();
					if (wapp.buscarPorNombre(nombre) != null) {
						System.out.println(wapp.buscarPorNombre(nombre));
					}else {
						System.out.println("Lo sentimos, no hemos encontrado mensajes");
					}
					break;
				case 2:
					System.out.println("Introduzca el nombre del contacto");
					nombre = Leer.dato();
					if (wapp.buscarTodosLosMensajes(nombre).isEmpty()) {
						System.out.println("Lo sentimos, no hemos encontrado mensajes");
					}else {
						wapp.mostrarListaExterna(wapp.buscarTodosLosMensajes(nombre));
					}
					break;
				case 3:
					System.out.println("Introduzca el id del mensaje");
					idBuscar = Leer.datoInt();
					System.out.println("Introduzca el nuevo cuerpo del mensaje");
					cuerpo = Leer.dato();
					wapp.modificarCuerpo(idBuscar, cuerpo);
					break;
				case 4:
					System.out.println("Introduzca el id del mensaje");
					idBuscar = Leer.datoInt();
					wapp.borrarMensaje(idBuscar);
					break;
				case 5:
					wapp.ordenarPorNombre();
					wapp.mostrarLista();
					break;
				case 6:
					wapp.ordenarNatural();
					wapp.mostrarLista();
					break;
				case 7:
					System.out.println("Introduzca el nombre del contacto");
					nombre = Leer.dato();
					System.out.println("Introduzca el coste del mensaje (en céntimos)");
					costeMensajes = Leer.datoDouble();
					System.out.printf("Al usuario %s sus mensajes le suponen un coste total de %.2f €\n\n", nombre, wapp.calcularCosteMensajes(nombre, costeMensajes));
					break;
				case 8:
					wapp.mostrarLista();
					break;
				case 0:
					break;
				default:
					System.out.println("Por favor elija una opción correcta");
					break;
			}
		}while (opcionMenu != 0);
	}
	
	public static void mostrarMenuPrincipal () {
		System.out.println("\nPulse 1 para buscar un mensaje por el nombre del contacto");
		System.out.println("Pulse 2 para buscar todos los mensajes de un contacto");
		System.out.println("Pulse 3 para modificar el cuerpo de un mensaje");
		System.out.println("Pulse 4 para borrar un mensaje");
		System.out.println("Pulse 5 para ordenar la lista de mensajes en orden alfabético de los contactos");
		System.out.println("Pulse 6 para ordenar la lista de mensajes en orden el id");
		System.out.println("Pulse 7 para calcular el importe de todos los mensajes de un contacto");
		System.out.println("Pulse 8 para mostrar la lista de todos los mensajes");
		System.out.println("Pulse 0 para salir");
	}

}
