package ejercicio03;

import java.util.Iterator;
import java.util.Set;

public class CrudAlumno {
	
	private Set <Alumno> listado;

	public CrudAlumno(Set<Alumno> listado) {
		this.listado = listado;
	}

	public Set<Alumno> getListado() {
		return listado;
	}

	public void setListado(Set<Alumno> listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "CrudAlumno [listado=" + listado + "]";
	}
	
	public void mostrarAlumnos () {
		for (Alumno alumno : listado) {
			System.out.println(alumno);
		}
	}
	
	public void mostrarUnAlumno (String nombre, String apellido) {
		Alumno aux = buscarPorNombre (nombre, apellido);
		if (aux != null) {
			System.out.println(aux);
		}
	}
	
	public void mostrarUnAlumnoId (int id) {
		Alumno aux = buscarPorId (id);
		if (aux != null) {
			System.out.println(aux);
		}
	}
	
	public void agregarAlumno (Alumno a) {
		listado.add(a);
		
	}
	
	public Alumno buscarPorNombre (String nombre, String apellido) {
		Alumno aux = null;
		boolean salir = false;
		Iterator <Alumno> it = listado.iterator();
		while (it.hasNext() && !salir) {
			aux = it.next();
			if (aux.getNombre().equalsIgnoreCase(nombre) && aux.getApellidos().equalsIgnoreCase(apellido)) {
				salir = true;				
			}
		}
		if (!salir) {
			aux = null;
		}
		return aux;
		
	}
	
	public Alumno buscarPorId (int id) {
		Alumno aux = null;
		boolean salir = false;
		Iterator <Alumno> it = listado.iterator();
		while (it.hasNext() && !salir) {
			aux = it.next();
			if (aux.getIdAlumno() == id) {
				salir = true;
			}
		}
		if (!salir) {
			aux = null;
		}
		return aux;
	}
	
	public void modificarEdadAlumno (String nombre, String apellido, int edad) {
		Alumno aux;
		aux = buscarPorNombre (nombre, apellido);
		if (aux != null) {
			aux.setEdad(edad);
		}
	}
	
	public void modificarEdadAlumnoId (int id, int edad) {
		Alumno aux = buscarPorId (id);
		if (aux != null) {
			aux.setEdad(edad);
		}
	}
	
	public void borrarAlumno (String nombre, String apellido) {
		Alumno aux;
		aux = buscarPorNombre (nombre, apellido);
		if (aux != null) {
			listado.remove(aux);
		}
	}
	
	public void borrarAlumnoId (int id) {
		Alumno aux = buscarPorId (id);
		if (aux != null) {
			listado.remove(aux);
		}
	}
	
	public void asignarNota (Alumno a, Nota n) {
		a.getListaNotas().add(n);
	}
	
	

}
