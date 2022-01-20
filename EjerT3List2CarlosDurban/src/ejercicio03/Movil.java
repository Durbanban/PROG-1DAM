package ejercicio03;

public class Movil {
	
	private String marca;
	private String modelo;
	private boolean vendido;
	private double precioU;
	
	
	public Movil(String marca, String modelo, boolean vendido, double precioU) {
		this.marca = marca;
		this.modelo = modelo;
		this.vendido = vendido;
		this.precioU = precioU;
	}

	public Movil() {
		
	}

	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public boolean isVendido() {
		return vendido;
	}


	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}


	public double getPrecioU() {
		return precioU;
	}


	public void setPrecioU(double precioU) {
		this.precioU = precioU;
	}

	@Override
	public String toString() {
		return "Movil [marca=" + marca + ", modelo=" + modelo + ", vendido=" + vendido + ", precioU=" + precioU + "]";
	}
	
	
	
	
	
	
	
	

}
