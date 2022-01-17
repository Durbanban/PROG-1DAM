package ejemploArrayObjetos;

public class Vehiculo {
	
	private String modelo;
	private double potencia;
	
	public Vehiculo () {
		
	}
	
	public Vehiculo (String modelo, double potencia) {
		this.modelo = modelo;
		this.potencia = potencia;
	}
	
	public String getModelo () {
		return modelo;
	}
	
	public void setModelo (String modelo) {
		this.modelo = modelo;
	}
	
	public double getPotencia () {
		return potencia;
	}
	
	public void setPotencia (double potencia) {
		this.potencia = potencia;
	}
	
	public String toString() {
		return "Vehículo [modelo = " + modelo + ", potencia = " + potencia + "]";
	}

}
