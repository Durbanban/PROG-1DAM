package ejercicio;

public class Visitante implements IEntrada {
	
	private String id;
	private double precioBasico;
	private int edad;
	
	
	public Visitante(String id, double precioBasico, int edad) {
		this.id = id;
		this.precioBasico = precioBasico;
		this.edad = edad;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public double getPrecioBasico() {
		return precioBasico;
	}


	public void setPrecioBasico(double precioBasico) {
		this.precioBasico = precioBasico;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	@Override
	public String toString() {
		return "Visitante [id=" + id + ", precioBasico=" + precioBasico + ", edad=" + edad + "]";
	}
	
	
	public double calcularPrecioEntrada (double descGen, double descEmp, double descFam) {
		double divisor = 100.0;
		if (edad < 18) {
			return 0.0;
		}else if (edad < 65) {
			return precioBasico;
		}else {
			return precioBasico - precioBasico * (descGen / divisor);
		}
	}
	

}
