package ejercicio03;

import java.util.Set;

public class Colegio {
	
	private int idColegio;
	private Set <Alumno> listadoAlumnos;
	
	public Colegio(int idColegio, Set<Alumno> listadoAlumnos) {
		this.idColegio = idColegio;
		this.listadoAlumnos = listadoAlumnos;
	}

	public int getIdColegio() {
		return idColegio;
	}

	public void setIdColegio(int idColegio) {
		this.idColegio = idColegio;
	}

	public Set<Alumno> getListadoAlumnos() {
		return listadoAlumnos;
	}

	public void setListadoAlumnos(Set<Alumno> listadoAlumnos) {
		this.listadoAlumnos = listadoAlumnos;
	}

	@Override
	public String toString() {
		return "Colegio [idColegio=" + idColegio + ", listadoAlumnos=" + listadoAlumnos + "]";
	}
	
	 
	
	

}
