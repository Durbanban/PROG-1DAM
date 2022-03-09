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
	
	public void agregarAlumno (Alumno a) {
		listado.add(a);
	}
	
	public Alumno buscarPorNombre (String nombre) {
		Alumno aux = null;
		boolean salir = false;
		Iterator <Alumno> it = listado.iterator();
		while (it.hasNext() && !salir) {
			aux = it.next();
			if (aux.getNombre().equalsIgnoreCase(nombre)) {
				salir = true;				
			}
		}
		if (!salir) {
			aux = null;
		}
		return aux;
		
	}
	
	

}
