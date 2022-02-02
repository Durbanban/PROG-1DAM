package ejercicio03;

public class Vehiculo {
	
	private String marca;
	private String modelo;
	private int cilindrada;
	private int potencia;
	private String tipoCombustible;
	private double precio;
	private boolean vendido;
	
	
	public Vehiculo (String marca, String modelo, int cilindrada, int potencia, String tipoCombustible, double precio, boolean vendido) {
		this.marca = marca;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
		this.potencia = potencia;
		this.tipoCombustible = tipoCombustible;
		this.precio = precio;
		this.vendido = vendido;
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


	public int getCilindrada() {
		return cilindrada;
	}


	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}


	public int getPotencia() {
		return potencia;
	}


	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}


	public String getTipoCombustible() {
		return tipoCombustible;
	}


	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public boolean isVendido () {
		return vendido;
	}
	
	public void setVendido (boolean vendido) {
		this.vendido = vendido;
	}


	
	
	
	@Override
	public String toString() {
		return super.toString() + "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", cilindrada=" + cilindrada + ", potencia="
				+ potencia + ", tipoCombustible=" + tipoCombustible + ", precio=" + precio + ", vendido=" + vendido
				+ "]";
	}


	public double calcularImpuesto (double impuesto) {
		return precio + impuesto;
	}

}
