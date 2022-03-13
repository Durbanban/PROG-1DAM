package ejercicio03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idCole = 0, opcionMenu = 0, opcionBuscar = 0, idAlumno = 0, edadActual = 0;
		String nombreAlumno, apellidoAlumno;
		Set <Alumno> listaAlumnos = new HashSet <Alumno> ();
		Alumno aux;
		
		listaAlumnos.add(new Alumno (1, "Carlos Jesús", "Durbán", new ArrayList <Nota> (), 30));
		listaAlumnos.add(new Alumno (2, "Álvaro", "Franco", new ArrayList <Nota> (), 25));
		listaAlumnos.add(new Alumno (3, "Víctor",  "González", new ArrayList <Nota> (), 19));
		listaAlumnos.add(new Alumno (4, "Álvaro", "Chaves", new ArrayList <Nota> (), 19));
		listaAlumnos.add(new Alumno (5, "Nicolás", "Bursón", new ArrayList <Nota> (), 28));
		listaAlumnos.add(new Alumno (6, "Luis Miguel", "Serón", new ArrayList <Nota> (), 29));
		listaAlumnos.add(new Alumno (7, "Jose Luis", "Hidalgo", new ArrayList <Nota> (), 18));
		listaAlumnos.add(new Alumno (8, "Jose Luis", "Gil", new ArrayList <Nota> (), 19));
		listaAlumnos.add(new Alumno (9, "Ana Pilar", "Barba", new ArrayList <Nota> (), 18));
		listaAlumnos.add(new Alumno (10, "Adrián", "Arnaiz", new ArrayList <Nota> (), 19));
		listaAlumnos.add(new Alumno (11, "Rogelio", "Moihefer", new ArrayList <Nota> (), 32));
		
		
		CrudAlumno crudAlumno = new CrudAlumno (listaAlumnos);
		
		
		System.out.println("Bienvenido a la EscuelApp");
		
		System.out.println("Indique el id del colegio");
		idCole = Leer.datoInt();
		
		Colegio c = new Colegio (idCole, listaAlumnos);
		do {
			mostrarMenuPrincipal ();
			opcionMenu = Leer.datoInt();
			switch (opcionMenu) {
				case 1:
					System.out.println("Pulse 1 para buscar al alumno por su nombre y apellido");
					System.out.println("Pulse 2 para buscar al alumno por su id");
					System.out.println("Pulse 0 para salir");
					opcionBuscar = Leer.datoInt();
					switch (opcionBuscar) {
						case 1:
							System.out.println("Introduzca el nombre");
							nombreAlumno = Leer.dato();
							System.out.println("Introduzca el primer apellido");
							apellidoAlumno = Leer.dato();
							crudAlumno.mostrarUnAlumno(nombreAlumno, apellidoAlumno);
							break;
						case 2:
							System.out.println("Introduzca el id");
							idAlumno = Leer.datoInt();
							crudAlumno.mostrarUnAlumnoId(idAlumno);
							break;
						case 0:
							break;
						default:
							System.out.println("Por favor, elija una opción correcta");
					}					
					break;
				case 2:
					System.out.println("Pulse 1 para buscar al alumno por su nombre y apellido");
					System.out.println("Pulse 2 para buscar al alumno por su id");
					System.out.println("Pulse 0 para salir");
					opcionBuscar = Leer.datoInt();
					switch (opcionBuscar) {
						case 1:
							System.out.println("Introduzca el nombre");
							nombreAlumno = Leer.dato();
							System.out.println("Introduzca el primer apellido");
							apellidoAlumno = Leer.dato();
							System.out.println("Indique la edad actual del alumno");
							edadActual = Leer.datoInt();
							crudAlumno.modificarEdadAlumno(nombreAlumno, apellidoAlumno, edadActual);
							break;
						case 2:
							System.out.println("Introduzca el id");
							idAlumno = Leer.datoInt();
							System.out.println("Indique la edad actual del alumno");
							edadActual = Leer.datoInt();
							crudAlumno.modificarEdadAlumnoId(idAlumno, edadActual);
							break;
						case 0:
							break;
						default:
							System.out.println("Por favor, elija una opción correcta");
					}	
					break;
				case 3:
					System.out.println("Pulse 1 para buscar al alumno por su nombre y apellido");
					System.out.println("Pulse 2 para buscar al alumno por su id");
					System.out.println("Pulse 0 para salir");
					opcionBuscar = Leer.datoInt();
					switch (opcionBuscar) {
						case 1:
							System.out.println("Introduzca el nombre");
							nombreAlumno = Leer.dato();
							System.out.println("Introduzca el primer apellido");
							apellidoAlumno = Leer.dato();
							crudAlumno.borrarAlumno(nombreAlumno, apellidoAlumno);
							break;
						case 2:
							System.out.println("Introduzca el id");
							idAlumno = Leer.datoInt();
							crudAlumno.borrarAlumnoId(idAlumno);
							break;
						case 0:
							break;
						default:
							System.out.println("Por favor, elija una opción correcta");
					}	
					break;
				case 0:
					break;
				default:
					System.out.println("Por favor elija una opción correcta");
			}
		}while (opcionMenu != 0);
		
		System.out.println("Gracias por usar el programa");
		
		
		
		
	}
	
	public static void mostrarMenuPrincipal () {
		System.out.println("Pulse 1 para mostrar un alumno");
		System.out.println("Pulse 2 para modificar la edad de un alumno");
		System.out.println("Pulse 3 para borrar un alumno");
		System.out.println("Pulse 0 para salir");
	}

}
