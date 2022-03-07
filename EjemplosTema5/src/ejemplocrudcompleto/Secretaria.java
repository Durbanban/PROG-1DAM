package ejemplocrudcompleto;

import java.util.ArrayList;
import java.util.List;

public class Secretaria {
	
	private List <Alumno> listAlumnos;

	public Secretaria(List<Alumno> listAlumnos) {
		this.listAlumnos = listAlumnos;
	}
	
	// Constructor vacío (se instancia la lista para que no pete con un NullPointer cuando se intenta agregar el Alumno
	public Secretaria () {
		listAlumnos = new ArrayList <Alumno> ();
	}

	public List<Alumno> getListAlumnos() {
		return listAlumnos;
	}

	public void setListAlumnos(List<Alumno> listAlumnos) {
		this.listAlumnos = listAlumnos;
	}

	@Override
	public String toString() {
		return "Secretaria [listAlumnos=" + listAlumnos + "]";
	}
	
	public void agregarAlum (Alumno alum) {
		listAlumnos.add(alum);
	}
	
	public boolean agregar2 (Alumno al) {
		return listAlumnos.add(al);
	}
	
	public int buscarAlum (String dni) {
		int temp = -1;
		boolean salir = false;
		
		for (int i = 0; i < listAlumnos.size() && !salir; i++) {
			if (listAlumnos.get(i).getDni().equalsIgnoreCase(dni)) {
				temp = i;
				salir = true;
			}
		}
		return temp;
	}
	
	public void modificarAlumno (String dni, String nombreNuevo) {
		int index = buscarAlum (dni);
		
		if (index  >= 0) {
			listAlumnos.get(index).setNombre(nombreNuevo);
		}
	}
	
	public Alumno buscarAlum2 (String dni) {
		Alumno tem = null;
		boolean salir = false;
		
		for (int i = 0; i < listAlumnos.size() && !salir; i++) {
			if (listAlumnos.get(i).getDni().equalsIgnoreCase(dni)) {
				tem = listAlumnos.get(i);
				salir = true;
			}
		}
		return tem;
	}
	
	// Este método no pertenece al ejemplo, es cosecha propia.
	public void modificarAlumno2 (String dni, String nombreNuevo) {
		Alumno a = buscarAlum2 (dni);
		if (a != null) {
			a.setNombre(nombreNuevo);
		}
	}
	
	public void imprimirLista () {
		for (Alumno alumno : listAlumnos) {
			System.out.println(alumno);
		}
	}
	
	// Se puede usar el .isempty de la lista en vez de la condición del index >= 0.
	public void borrarAlumno (String dni) {
		int index = buscarAlum (dni);
		
		if (index >= 0) {
			listAlumnos.remove(index);
		}
	}
	
	// Este método no pertenece al ejemplo, es cosecha propia.
	public void borrarAlumno2 (String dni) {
		Alumno a = buscarAlum2 (dni);
		
		if (a != null) {
			listAlumnos.remove(a);
		}
	}
	
	//Este método estaría en la clase Vista. Realmente lo práctico es que sólo pinte el error.
	public void mostrarErrorAgregar (boolean b) {
		if (b) {
			System.out.println("Se ha agregado correctamente");
		}else {
			System.out.println("Error al insertar");
		}
	}
	
	// Este método se ha añadido en clase
	public List <Alumno> buscarAlum3 (String nombre) {
		List <Alumno> listado = new ArrayList <Alumno> ();
		
		for (int i = 0; i < listAlumnos.size(); i++) {
			if (listAlumnos.get(i).getNombre().equalsIgnoreCase(nombre)) {
				listado.add(listAlumnos.get(i));
			}
		}
		return listado;
	}
	
	
	
	
	
	
	
	

}
