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
	
	
	public void buscarSocio (int id) {
		for (Socio socio : listaSocios) {
			if (socio.getIdSocio() == id) {
				System.out.println(socio);
			}
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
	
	
	

	
	
	
	
	
	

}
