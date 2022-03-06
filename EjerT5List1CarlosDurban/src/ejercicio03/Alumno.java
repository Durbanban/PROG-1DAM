package ejercicio03;

import java.util.List;

public class Alumno {
	
	private int idAlumno;
	private String nombre;
	private String apellidos;
	private List <Nota> listaNotas;
	private int edad;
	
	public Alumno(int idAlumno, String nombre, String apellidos, List<Nota> listaNotas, int edad) {
		this.idAlumno = idAlumno;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.listaNotas = listaNotas;
		this.edad = edad;
	}

	public int getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public List<Nota> getListaNotas() {
		return listaNotas;
	}

	public void setListaNotas(List<Nota> listaNotas) {
		this.listaNotas = listaNotas;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Alumno [idAlumno=" + idAlumno + ", nombre=" + nombre + ", apellidos=" + apellidos + ", listaNotas="
				+ listaNotas + ", edad=" + edad + "]";
	}
	
	
	
	

}
