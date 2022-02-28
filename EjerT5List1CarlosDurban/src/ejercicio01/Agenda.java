package ejercicio01;

import java.util.List;

public class Agenda {
	
	private int idAgenda;
	private List <Nota> listaNotas;
	
	
	public Agenda(int idAgenda, List<Nota> listaNotas) {
		this.idAgenda = idAgenda;
		this.listaNotas = listaNotas;
	}
	


	public int getIdAgenda() {
		return idAgenda;
	}


	public void setIdAgenda(int idAgenda) {
		this.idAgenda = idAgenda;
	}


	public List<Nota> getListaNotas() {
		return listaNotas;
	}


	public void setListaNotas(List<Nota> listaNotas) {
		this.listaNotas = listaNotas;
	}


	@Override
	public String toString() {
		return "Agenda [idAgenda=" + idAgenda + ", listaNotas=" + listaNotas + "]";
	}
	
	
	public void mostrarNotas () {
		int recorrido = 0;
		for (Nota nota : listaNotas) {
			System.out.println((recorrido + 1) + ". " +  nota);
			recorrido++;
		}
	}
	
	public int mostrarTotalNotas () {
		return listaNotas.size();
	}
	
	public void addNota (Nota n) {
		listaNotas.add(n);
		System.out.println("La nota se agregó con éxito");
	}
	
	public void mostrarUnaNota (int seleccion) {
		if (seleccion <= listaNotas.size() && seleccion > 0) {
			System.out.println(listaNotas.get(seleccion - 1));
		}else {
			System.out.println("No existen notas en su selección");
		}
	}
	
	public void borrarNota (int seleccion) {
		if (seleccion <= listaNotas.size() && seleccion > 0) {
			listaNotas.remove(seleccion - 1);
			System.out.println("Nota borrada con éxito");
		}else {
			System.out.println("No existen notas en su selección");
		}
	}
	
	
	
	
	
	
	
	
	

}
