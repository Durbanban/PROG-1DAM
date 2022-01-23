package ejercicio06;

public class Entrada {
	
	private int id;
	private double precio;
	private boolean disponible;
	private int numFila;
	private int numButaca;
	
	public Entrada (int id, double precio, boolean disponible, int numFila, int numButaca) {
		this.id = id;
		this.precio = precio;
		this.disponible = disponible;
		this.numFila = numFila;
		this.numButaca = numButaca;
	}
	
	public Entrada () {
		
	}

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public int getNumFila() {
		return numFila;
	}

	public void setNumFila(int numFila) {
		this.numFila = numFila;
	}

	public int getNumButaca() {
		return numButaca;
	}

	public void setNumButaca(int numButaca) {
		this.numButaca = numButaca;
	}

	@Override
	public String toString() {
		return "Entrada [id=" + id + ", precio=" + precio + ", disponible=" + disponible + ", numFila=" + numFila
				+ ", numButaca=" + numButaca + "]";
	}
	
	
	

}
