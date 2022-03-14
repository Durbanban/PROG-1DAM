package ejercicio05;

import java.util.List;

public class CrudPersona {
	
	private List <Persona> listaP;

	public CrudPersona(List<Persona> listaP) {
		this.listaP = listaP;
	}

	public List<Persona> getListaP() {
		return listaP;
	}

	public void setListaP(List<Persona> listaP) {
		this.listaP = listaP;
	}

	@Override
	public String toString() {
		return "CrudPersona [listaP=" + listaP + "]";
	}
	
	public void agregarPersona (Persona p) {
		listaP.add(p);
	}
	
	public void mostrarLista () {
		System.out.println("*--LAS AUTENTICAS SPICE GIRLS--*");
		for (Persona persona : listaP) {
			System.out.println(persona);
		}
		System.out.println();
	}
	

}
