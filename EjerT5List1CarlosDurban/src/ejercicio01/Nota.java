package ejercicio01;

public class Nota {
	
	private int idNota;
	private String cabecera;
	private String cuerpo;
	private boolean urgente;
	
	
	public Nota(int idNota, String cabecera, String cuerpo, boolean urgente) {
		this.idNota = idNota;
		this.cabecera = cabecera;
		this.cuerpo = cuerpo;
		this.urgente = urgente;
	}


	public int getIdNota() {
		return idNota;
	}


	public void setIdNota(int idNota) {
		this.idNota = idNota;
	}


	public String getCabecera() {
		return cabecera;
	}


	public void setCabecera(String cabecera) {
		this.cabecera = cabecera;
	}


	public String getCuerpo() {
		return cuerpo;
	}


	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}


	public boolean isUrgente() {
		return urgente;
	}


	public void setUrgente(boolean urgente) {
		this.urgente = urgente;
	}


	@Override
	public String toString() {
		return "Notas [id=" + idNota + ", cabecera=" + cabecera + ", cuerpo=" + cuerpo + ", urgente=" + urgente + "]";
	}
	
	
	
	
	
	
	

}
