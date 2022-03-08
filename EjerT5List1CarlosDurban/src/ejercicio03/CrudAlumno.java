package ejercicio03;

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
	
	
	
	

}
