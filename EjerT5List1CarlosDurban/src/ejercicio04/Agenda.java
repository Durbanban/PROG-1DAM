package ejercicio04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;


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
	
	public Contacto buscarContactoPorNombre (String nombre) {
		Contacto aux = null;
		boolean salir = false;
		Iterator <Contacto> it = agenda.keySet().iterator();
		while (it.hasNext() && !salir) {
			aux = it.next();
			if (aux.getNombre().equalsIgnoreCase(nombre)) {
				salir = true;
			}
		}
		if (!salir) {
			aux = null;
		}
		return aux;
	}
	
	public void mostrarAgenda () {
		Contacto aux = null;
		Iterator <Contacto> it = agenda.keySet().iterator();
		while (it.hasNext()) {
			aux = it.next();
			System.out.println("Clave: " + aux + " -> " + agenda.get(aux));
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(agenda);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agenda other = (Agenda) obj;
		return Objects.equals(agenda, other.agenda);
	}
	
	
	
	
	
	
	

}
