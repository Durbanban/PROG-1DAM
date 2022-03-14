package ejercicio03;

import java.util.List;
import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, edad, idAlumno, listaNotas, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(apellidos, other.apellidos) && edad == other.edad && idAlumno == other.idAlumno
				&& Objects.equals(listaNotas, other.listaNotas) && Objects.equals(nombre, other.nombre);
	}
	
	
	
	
	

}
