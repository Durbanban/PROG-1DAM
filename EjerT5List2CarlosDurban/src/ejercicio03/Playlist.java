package ejercicio03;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Supplier;

public class Playlist {
	
	private List <Cancion> listadoCanciones;
	private Set <Artista> listadoArtistas;
	
	
	public Playlist(List<Cancion> listadoCanciones, Set<Artista> listadoArtistas) {
		super();
		this.listadoCanciones = listadoCanciones;
		this.listadoArtistas = listadoArtistas;
	}


	public List<Cancion> getListadoCanciones() {
		return listadoCanciones;
	}


	public void setListadoCanciones(List<Cancion> listadoCanciones) {
		this.listadoCanciones = listadoCanciones;
	}


	public Set<Artista> getListadoArtistas() {
		return listadoArtistas;
	}


	public void setListadoArtistas(Set<Artista> listadoArtistas) {
		this.listadoArtistas = listadoArtistas;
	}


	@Override
	public int hashCode() {
		return Objects.hash(listadoArtistas, listadoCanciones);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Playlist other = (Playlist) obj;
		return Objects.equals(listadoArtistas, other.listadoArtistas)
				&& Objects.equals(listadoCanciones, other.listadoCanciones);
	}


	@Override
	public String toString() {
		return "Playlist [listadoCanciones=" + listadoCanciones + ", listadoArtistas=" + listadoArtistas + "]";
	}
	
	public void agregarCancion (Supplier <Cancion> supCancion, String nombre, String genero, List <Artista> artistas, String nombreArtista, int idCancion) {
		Cancion c = supCancion.get();
		c.setIdCancion(idCancion);
		c.setNombre(nombre);
		listadoCanciones.add(c);
		c.setInterpretes(artistas);
		listadoArtistas.addAll(artistas);
		
		
	}
	
	
	public void mostrarListaCanciones() {
		listadoCanciones.stream()
						.forEach(cancion -> System.out.println(cancion));
		
	}
	
	public void mostrarListaArtistas() {
		Iterator<Artista> it = listadoArtistas.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public void mostrarListaNombre(String nombre) {
		listadoCanciones.stream()
						.filter(cancion -> cancion.getNombre().equalsIgnoreCase(nombre))
						.forEach(cancion -> System.out.println(cancion));
	}
	
	public Cancion seleccionarCancionMayorDuracion () {
		return listadoCanciones.stream()
						.max(Comparator.comparing(Cancion::getDuracion))
						.get();
	}
	
	
	
	

}
