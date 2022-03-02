package ejercicio02;

import java.util.List;

public class Club {
	
	private int idClub;
	private List <Socio> listaSocios;
	private List <Pista> listaPistas;
	
	public Club(int idClub, List<Socio> listaSocios, List<Pista> listaPistas) {
		this.idClub = idClub;
		this.listaSocios = listaSocios;
		this.listaPistas = listaPistas;
	}

	public int getIdClub() {
		return idClub;
	}

	public void setIdClub(int idClub) {
		this.idClub = idClub;
	}

	public List<Socio> getListaSocios() {
		return listaSocios;
	}

	public void setListaSocios(List<Socio> listaSocios) {
		this.listaSocios = listaSocios;
	}
	
	public List<Pista> getListaPistas() {
		return listaPistas;
	}
	
	public void setListaPistas (List<Pista> listaPistas) {
		this.listaPistas = listaPistas;
	}

	@Override
	public String toString() {
		return "Club [idClub=" + idClub + ", listaSocios=" + listaSocios + ", listaPistas=" + listaPistas + "]";
	}
	
	
	public Socio buscarSocioPorId (int id) {
		for (Socio socio : listaSocios) {
			if (socio.getIdSocio() == id) {
				return socio;
			}
		}
		return null;
	}
	
	public Socio buscarSocioPorNombre (String nombre) {
		int i = 0;
		boolean encontrado = false;
		while (i < listaSocios.size() && !encontrado) {
			if (listaSocios.get(i).getNombre().equalsIgnoreCase(nombre)) {
				encontrado = true;
			}else {
				i ++;
			}
		}
		if (encontrado) {
			return listaSocios.get(i);
		}else {
			return null;
		}
	}
	
	public void agregarSocio (Socio s) {
		listaSocios.add(s);		
	}
	
	public void mostrarSocios () {
		for (int i = 0; i < listaSocios.size(); i++) {
			System.out.println((i + 1) + ". " + listaSocios.get(i));
		}
	}
	
	public boolean modificarNumeroHijos (int nuevoNumero, String nombre) {
		Socio auxiliar = buscarSocioPorNombre (nombre);
		if (auxiliar != null) {
			auxiliar.setNumHijos(nuevoNumero);
			return true;
		}else {
			return false;
		}
	}
	
	public void mostrarError (boolean verdadero) {
		if (!verdadero) {
			System.out.println("No se pudo ejecutar la acción");
		}
	}
	
	public void borrarUsuario (int seleccion) {
		listaSocios.get(seleccion - 1);
	}
	
	public void mostrarSociosVIP () {
		for (int i = 0; i < listaSocios.size(); i++) {
			if (listaSocios.get(i) instanceof SocioVip) {
				System.out.println(listaSocios.get(i));
			}
		}
	}
	
	public int calcularPistasDisponibles () {
		int pistasLibres = 0;
		for (Pista pista : listaPistas) {
			if (pista.isLibre()) {
				pistasLibres ++;
			}
		}
		return pistasLibres;
	}
	
	public boolean asignarPista (int idPista, String nombreSocio) {
		Pista aux = null;
		Socio socio;
		boolean encontrado = false;
		for (int i = 0; i < listaPistas.size() && !encontrado; i++) {
			if (listaPistas.get(i).getIdPista() == idPista) {
				aux = listaPistas.get(i);
				encontrado = true;
			}
		}
		
		if (buscarSocioPorNombre (nombreSocio) instanceof SocioVip) {
			socio = buscarSocioPorNombre (nombreSocio);
			((SocioVip)socio).getPistasAlquiladas().add(aux);
			aux.setLibre(false);
			aux.setUsuario(socio);
			return true;	
		}else {
			return false;
		}
					
	}
	
	public void modificarPrecioPista (int idPista, double precioNuevo) {
		boolean encontrado = false;
		for (int i = 0; i < listaPistas.size() && !encontrado; i++) {
			if (listaPistas.get(i).getIdPista() == idPista) {
				listaPistas.get(i).setPrecio(precioNuevo);
				encontrado = true;
			}
			
		}	
	}
	
	
	

	
	
	
	
	
	

}
