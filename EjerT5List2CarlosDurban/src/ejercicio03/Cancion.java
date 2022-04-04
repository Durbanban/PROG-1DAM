package ejercicio03;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Objects;

public class Cancion implements Comparable<Cancion>{
	
	private int idCancion;
	private String nombre;
	private List <Artista> interpretes;
	private String genero;
	private LocalDate fechaSalida;
	private LocalTime duracion;
	
	
	public Cancion(int idCancion, String nombre, List<Artista> interpretes, String genero, LocalDate fechaSalida,
			LocalTime duracion) {
		super();
		this.idCancion = idCancion;
		this.nombre = nombre;
		this.interpretes = interpretes;
		this.genero = genero;
		this.fechaSalida = fechaSalida;
		this.duracion = duracion;
	}


	public int getIdCancion() {
		return idCancion;
	}


	public void setIdCancion(int idCancion) {
		this.idCancion = idCancion;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public List<Artista> getInterpretes() {
		return interpretes;
	}


	public void setInterpretes(List<Artista> interpretes) {
		this.interpretes = interpretes;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public LocalDate getFechaSalida() {
		return fechaSalida;
	}


	public void setFechaSalida(LocalDate fechaSalida) {
		this.fechaSalida = fechaSalida;
	}


	public LocalTime getDuracion() {
		return duracion;
	}


	public void setDuracion(LocalTime duracion) {
		this.duracion = duracion;
	}


	@Override
	public int hashCode() {
		return Objects.hash(duracion, fechaSalida, genero, idCancion, interpretes, nombre);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cancion other = (Cancion) obj;
		return Objects.equals(duracion, other.duracion) && Objects.equals(fechaSalida, other.fechaSalida)
				&& Objects.equals(genero, other.genero) && idCancion == other.idCancion
				&& Objects.equals(interpretes, other.interpretes) && Objects.equals(nombre, other.nombre);
	}


	@Override
	public String toString() {
		return "Cancion [idCancion=" + idCancion + ", nombre=" + nombre + ", interpretes=" + interpretes + ", genero="
				+ genero + ", fechaSalida=" + fechaSalida + ", duracion=" + duracion + "]";
	}


	@Override
	public int compareTo(Cancion o) {
		return o.nombre.compareTo(nombre);
	}
	
	
	
	
	

}
