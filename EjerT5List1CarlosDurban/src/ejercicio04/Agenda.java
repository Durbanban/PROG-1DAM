package ejercicio04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;


public class Agenda {
	
	private Map <Contacto, String> agenda;

	public Agenda(Map<Contacto, String> agenda) {
		this.agenda = agenda;
	}

	public Map<Contacto, String> getAgenda() {
		return agenda;
	}

	public void setAgenda(Map<Contacto, String> agenda) {
		this.agenda = agenda;
	}

	@Override
	public String toString() {
		return "Agenda [agenda=" + agenda + "]";
	}
	
	public Map <Contacto, String> buscarContactoPorNombre (String nombre) {
		Contacto aux;
		Map <Contacto, String> mapaAux = new HashMap <Contacto, String> ();
		Iterator <Contacto> it = agenda.keySet().iterator();
		while (it.hasNext()) {
			aux = it.next();
			if (aux.getNombre().equalsIgnoreCase(nombre)) {
				mapaAux.put(aux, aux.getNumTelefono());
			}
		}
		return mapaAux;
	}
	
	public void mostrarAgenda () {
		Contacto aux = null;
		Iterator <Contacto> it = agenda.keySet().iterator();
		while (it.hasNext()) {
			aux = it.next();
			System.out.println("Clave: " + aux + " -> " + agenda.get(aux));
		}
	}
	
	
	
	
	
	
	
	

}
