package ejercicio02;

public class Pista {
	
	private int idPista;
	private boolean libre;
	private Socio usuario;
	private double precio;
	
	
	public Pista(int idPista, boolean libre, Socio usuario, double precio) {
		this.idPista = idPista;
		this.libre = libre;
		this.usuario = usuario;
		this.precio = precio;
	}


	public int getIdPista() {
		return idPista;
	}


	public void setIdPista(int idPista) {
		this.idPista = idPista;
	}


	public boolean isLibre() {
		return libre;
	}


	public void setLibre(boolean libre) {
		this.libre = libre;
	}


	public Socio getUsuario() {
		return usuario;
	}


	public void setUsuario(Socio usuario) {
		this.usuario = usuario;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Pista [idPista=" + idPista + ", libre=" + libre + ", usuario=" + usuario + ", precio=" + precio + "]";
	}
	
	
	
	

}
