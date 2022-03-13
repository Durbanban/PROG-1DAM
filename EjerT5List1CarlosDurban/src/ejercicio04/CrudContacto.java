package ejercicio04;

import java.util.Iterator;
import java.util.Set;

public class CrudContacto {
	
	private Set <Contacto> listado;

	public CrudContacto(Set<Contacto> listado) {
		this.listado = listado;
	}

	public Set<Contacto> getListado() {
		return listado;
	}

	public void setListado(Set<Contacto> listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "CrudContacto [listado=" + listado + "]";
	}
	
	public void agregarContacto (Contacto c, Agenda a) {
		listado.add(c);
		a.getAgenda().put(c, c.getNumTelefono());
		
	}
	
	public Contacto buscarPorNombre (String nombre) {
		Contacto aux = null;
		boolean salir = false;
		Iterator <Contacto> it = listado.iterator();
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
	
	public void borrarContacto (String nombre, Agenda a) {
		Contacto aux = buscarPorNombre (nombre);
		if (aux != null) {
			listado.remove(aux);
			if (a.getAgenda().containsKey(aux)) {
				a.getAgenda().remove(aux);
			}
		}
	}
	
	public void mostrarUnContacto (String nombre) {
		Contacto aux = buscarPorNombre (nombre);
		if (aux != null) {
			System.out.println(aux);
		}
	}
	
	public void modificarNumeroDeTelefono (String nombre, String numeroActualizado, Agenda a) {
		Contacto aux = buscarPorNombre (nombre);
		if (aux != null) {
			aux.setNumTelefono(numeroActualizado);
			a.getAgenda().put(aux, numeroActualizado);
		}
	}
	
	

}
