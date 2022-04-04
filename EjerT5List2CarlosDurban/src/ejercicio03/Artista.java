package ejercicio03;

import java.util.List;
import java.util.Objects;

public class Artista implements Comparable <Artista>{
	
	private int idArtista;
	private String nombre;
	private List <Cancion> canciones;
	
	
	public Artista(int idArtista, String nombre, List<Cancion> canciones) {
		super();
		this.idArtista = idArtista;
		this.nombre = nombre;
		this.canciones = canciones;
	}


	public int getIdArtista() {
		return idArtista;
	}


	public void setIdArtista(int idArtista) {
		this.idArtista = idArtista;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public List<Cancion> getCanciones() {
		return canciones;
	}


	public void setCanciones(List<Cancion> canciones) {
		this.canciones = canciones;
	}


	@Override
	public int hashCode() {
		return Objects.hash(canciones, idArtista, nombre);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artista other = (Artista) obj;
		return Objects.equals(canciones, other.canciones) && idArtista == other.idArtista
				&& Objects.equals(nombre, other.nombre);
	}


	@Override
	public String toString() {
		return "Artista [idArtista=" + idArtista + ", nombre=" + nombre + ", canciones=" + canciones + "]";
	}


	@Override
	public int compareTo(Artista o) {
		return o.nombre.compareTo(nombre);
	}
	
	
	
	
	

}
