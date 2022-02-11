package ejemploInterface;

public class Autorizacion extends Carta {
	
	private int dias;

	public Autorizacion(String cabecera, String cuerpo, int dias) {
		super(cabecera, cuerpo);
		this.dias = dias;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	@Override
	public String toString() {
		return super.toString() + "Autorizacion [dias=" + dias + "]";
	}
	
	
	
	

}
