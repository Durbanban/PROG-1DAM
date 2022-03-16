package intermedio;

import java.util.Collections;
import java.util.List;

public class Agenda {
	
	private List <Persona> listado;

	
	public Agenda(List<Persona> listado) {
		this.listado = listado;
	}


	public List<Persona> getListado() {
		return listado;
	}


	public void setListado(List<Persona> listado) {
		this.listado = listado;
	}


	@Override
	public String toString() {
		return "Agenda [listado=" + listado + "]";
	}
	
	public void mostrarAgenda () {
		for (Persona persona : listado) {
			System.out.println(persona);
		}
	}
	
	public void ordenarNatural () {
		Collections.sort(listado);
	}
	
	
	
	
	
	

}
