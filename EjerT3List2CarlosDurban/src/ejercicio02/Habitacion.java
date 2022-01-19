package ejercicio02;

public class Habitacion {
	
	private int tipo;
	private double precioB;
	private boolean extras;
	private String nombreCliente;
	private int numDias;
	private boolean ocupada;
	private boolean limpia;

	
	public Habitacion (int tipo, double precioB, boolean extras, String nombreCliente, int numDias, boolean ocupada, boolean limpia) {
		this.tipo = tipo;
		this.precioB = precioB;
		this.extras = extras;
		this.nombreCliente = nombreCliente;
		this.numDias = numDias;
		this.ocupada = ocupada;
		this.limpia = limpia;
	}
	
	public Habitacion () {
		
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public double getPrecioB() {
		return precioB;
	}

	public void setPrecioB(double precioB) {
		this.precioB = precioB;
	}

	public boolean isExtras() {
		return extras;
	}

	public void setExtras(boolean extras) {
		this.extras = extras;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public int getNumDias() {
		return numDias;
	}

	public void setNumDias(int numDias) {
		this.numDias = numDias;
	}

	public boolean isOcupada() {
		return ocupada;
	}

	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}

	public boolean isLimpia() {
		return limpia;
	}

	public void setLimpia(boolean limpia) {
		this.limpia = limpia;
	}

	@Override
	public String toString() {
		return "Habitacion [tipo=" + tipo + ", precioB=" + precioB + ", extras=" + extras + ", nombreCliente="
				+ nombreCliente + ", numDias=" + numDias + ", ocupada=" + ocupada + ", limpia=" + limpia + "]";
	}
	
	
	
	

}
