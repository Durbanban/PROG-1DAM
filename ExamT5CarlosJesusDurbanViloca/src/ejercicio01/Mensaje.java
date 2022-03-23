package ejercicio01;

import java.util.Objects;

public class Mensaje implements Comparable <Mensaje>{
	
	private int idMensaje;
	private String Emisor;
	private String cuerpo;


	public Mensaje(int idMensaje, String emisor, String cuerpo) {
		this.idMensaje = idMensaje;
		Emisor = emisor;
		this.cuerpo = cuerpo;
	}

	
	public int getIdMensaje() {
		return idMensaje;
	}

	public void setIdMensaje(int idMensaje) {
		this.idMensaje = idMensaje;
	}
	
	public String getEmisor() {
		return Emisor;
	}

	public void setEmisor(String emisor) {
		Emisor = emisor;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(Emisor, cuerpo, idMensaje);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mensaje other = (Mensaje) obj;
		return Objects.equals(Emisor, other.Emisor) && Objects.equals(cuerpo, other.cuerpo)
				&& idMensaje == other.idMensaje;
	}
	
	
	
	@Override
	public String toString() {
		return "Mensaje [idMensaje=" + idMensaje + ", Emisor=" + Emisor + ", cuerpo=" + cuerpo + "]";
	}


	@Override
	public int compareTo(Mensaje m) {
		int resultado = 0;
		if (m.getIdMensaje() > idMensaje) {
			resultado = -1;
		}else if (m.getIdMensaje() < idMensaje) {
			resultado = 1;
		}
		return resultado;
	}
	
	
	
	

}
