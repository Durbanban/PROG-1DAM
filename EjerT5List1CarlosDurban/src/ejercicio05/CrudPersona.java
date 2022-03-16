package ejercicio05;

import java.util.Collections;
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
	
	public void ordenarNatural () {
		Collections.sort(listaP);
	}
	
	public void ordenarPorNombreInverso (ComparaPorNombreInverso cpni) {
		Collections.sort(listaP, cpni);
	}
	
	public void ordenarPorAltura (ComparaPorAltura cpa) {
		Collections.sort(listaP, cpa);
	}
	
	public void ordenarPorPeso (ComparaPorPeso cpp) {
		Collections.sort(listaP, cpp);
	}
	

}
