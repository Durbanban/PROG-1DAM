package ejercicio04;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcionMenu = 0, idContacto = 1, edadContacto = 0;
		String nombreContacto, sexoContacto, numTlfContacto, entornoContacto;
		Set <Contacto> contactos = new HashSet <Contacto> ();
		Map <Contacto, String> listadoAgenda = new HashMap <Contacto, String> ();
		CrudContacto crudContacto = new CrudContacto (contactos);
		Agenda agenda = new Agenda (listadoAgenda);
		
		Contacto c1 = new Contacto (idContacto, "Javier García", "Hombre", 30, "655255544", "Personal");
		idContacto ++;
		Contacto c2 = new Contacto (idContacto, "Fulanito Durbán", "Hombre", 69, "632212547", "Familiar");
		idContacto ++;
		Contacto c3 = new Contacto (idContacto, "Paula Torres", "Mujer", 26, "612548769", "Laboral");
		idContacto ++;
		Contacto c4 = new Contacto (idContacto, "Ángel Naranjo", "Hombre", 49, "636325221", "Académico");
		idContacto ++;
		
		contactos.add(c1);
		contactos.add(c2);
		contactos.add(c3);
		contactos.add(c4);
		
		listadoAgenda.put(c1, c1.getNumTelefono());
		listadoAgenda.put(c2, c2.getNumTelefono());
		listadoAgenda.put(c3, c3.getNumTelefono());
		listadoAgenda.put(c4, c4.getNumTelefono());
		
		System.out.println("Bienvenido a tu AgendApp");
		do {
			mostrarMenuPrincipal ();
			opcionMenu = Leer.datoInt();
			switch (opcionMenu) {
			case 1:
				System.out.println("Introduzca el nombre del contacto");
				nombreContacto = Leer.dato();
				System.out.println("Introduzca el sexo del contacto");
				sexoContacto = Leer.dato();
				System.out.println("Introduzca la edad del contacto");
				edadContacto = Leer.datoInt();
				System.out.println("Introduzca el número de teléfono del contacto");
				numTlfContacto = Leer.dato();
				System.out.println("Introduzca el entorno del contacto");
				entornoContacto = Leer.dato();
				Contacto nuevoContacto = new Contacto (idContacto, nombreContacto, sexoContacto, edadContacto, numTlfContacto, entornoContacto);
				crudContacto.agregarContacto(nuevoContacto, agenda);
				idContacto ++;
				break;
			case 2:
				System.out.println("Introduzca el nombre del contacto");
				nombreContacto = Leer.dato();
				crudContacto.borrarContacto(nombreContacto, agenda);
				break;
			case 3:
				System.out.println("Introduzca el nombre del contacto");
				nombreContacto = Leer.dato();
				crudContacto.mostrarUnContacto(nombreContacto);
				break;
			case 4:
				agenda.mostrarAgenda();
				break;
			case 5:
				System.out.println("Introduzca el nombre del contacto");
				nombreContacto = Leer.dato();
				System.out.println("Introduzca el nuevo número de teléfono");
				numTlfContacto = Leer.dato();
				crudContacto.modificarNumeroDeTelefono(nombreContacto, numTlfContacto, agenda);
				break;
			case 0:
				break;
			default:
				System.out.println("Por favor elija una opción correcta");
				break;
			}
		} while (opcionMenu != 0);
		
		System.out.println("Gracias por usar AgendApp");
		
		
		
		

	}
	
	public static void mostrarMenuPrincipal () {
		System.out.println("Pulse 1 para agregar un contacto");
		System.out.println("Pulse 2 para borrar un contacto");
		System.out.println("Pulse 3 para mostrar un contacto");
		System.out.println("Pulse 4 para mostrar todos los contactos");
		System.out.println("Pulse 5 para modificar el número de teléfono de un contacto");
		System.out.println("Pulse 0 para salir");
	}

}
