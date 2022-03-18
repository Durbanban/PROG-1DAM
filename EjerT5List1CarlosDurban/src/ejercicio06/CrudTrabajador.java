package ejercicio06;

import java.util.Iterator;
import java.util.List;

public class CrudTrabajador {
	
	private List <Trabajador> listado;

	public CrudTrabajador(List<Trabajador> listado) {
		this.listado = listado;
	}

	public List<Trabajador> getListado() {
		return listado;
	}

	public void setListado(List<Trabajador> listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "CrudTrabajador [listado=" + listado + "]";
	}
	
	public void agregarTrabajador (Trabajador t) {
		listado.add(t);
	}
	
	public void mostrarLista() {
		for (Trabajador trabajador : listado) {
			System.out.println(trabajador);
		}
		System.out.println();
	}
	
	public Trabajador buscarPorNombre(String nombre) {
		Trabajador aux = null;
		boolean salir = false;
		Iterator <Trabajador> it = listado.iterator();
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
	
	

	
	
	

}
