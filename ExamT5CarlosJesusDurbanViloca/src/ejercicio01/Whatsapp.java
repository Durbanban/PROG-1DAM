package ejercicio01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Whatsapp {
	
	private List <Mensaje> listado;

	public Whatsapp(List<Mensaje> listado) {
		this.listado = listado;
	}

	public List<Mensaje> getListado() {
		return listado;
	}

	public void setListado(List<Mensaje> listado) {
		this.listado = listado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(listado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Whatsapp other = (Whatsapp) obj;
		return Objects.equals(listado, other.listado);
	}

	@Override
	public String toString() {
		return "Whatsapp [listado=" + listado + "]";
	}
	
	
	public void ordenarNatural() {
		Collections.sort(listado);
	}
	
	public void ordenarPorNombre() {
		Collections.sort(listado, new ComparaPorNombre());
	}
	
	public void mostrarLista() {
		Mensaje aux = null;
		Iterator <Mensaje> it = listado.iterator();
		while (it.hasNext()) {
			aux = it.next();
			System.out.println(aux);
		}
	}
	
	public Mensaje buscarPorNombre(String nombre) {
		Mensaje aux = null;
		boolean salir = false;
		for (int i = 0; i < listado.size() && !salir; i++) {
			if (listado.get(i).getEmisor().equalsIgnoreCase(nombre)) {
				aux = listado.get(i);
				salir = true;
			}
		}
		if (!salir) {
			aux = null;
		}
		return aux;
	}
	
	public List <Mensaje> buscarTodosLosMensajes (String nombre) {
		List <Mensaje> mensajes = new ArrayList <Mensaje>();
		for (Mensaje mensaje : listado) {
			if (mensaje.getEmisor().equalsIgnoreCase(nombre)) {
				mensajes.add(mensaje);
			}
		}
		return mensajes;
	}
	
	public void borrarMensaje (int id) {
		Mensaje aux = buscarPorId(id);
		if (aux != null) {
			listado.remove(aux);
		}
		
	}
	
	public Mensaje buscarPorId (int id) {
		Mensaje aux = null;
		boolean salir = false;
		Iterator <Mensaje> it = listado.iterator();
		while (it.hasNext() && !salir) {
			aux = it.next();
			if (aux.getIdMensaje() == id) {
				salir = true;
			}
		}
		if (!salir) {
			aux = null;
		}
		return aux;
	}
	
	public void modificarCuerpo (int id, String nuevoCuerpo) {
		Mensaje aux = buscarPorId(id);
		if (aux != null) {
			aux.setCuerpo("*" + nuevoCuerpo + "*");
		}
	}
	
	public void mostrarListaExterna (List <Mensaje> lista) {
		for (Mensaje mensaje : lista) {
			System.out.println(mensaje);
		}
	}
	
	public double calcularCosteMensajes (String nombre, double costePorMensaje) {
		List <Mensaje> lista = new ArrayList <Mensaje>();
		int contador = 0;
		double div = 100.0, resultado = 0.0;
		lista = buscarTodosLosMensajes(nombre);
		for (Mensaje mensaje : lista) {
			contador++;
		}
		resultado = (contador * costePorMensaje) / div;
		return resultado;
		
	}
	
	

}
