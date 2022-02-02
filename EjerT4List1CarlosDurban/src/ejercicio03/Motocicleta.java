package ejercicio03;

public class Motocicleta extends Vehiculo {
	
	private String numBastidor;
	private boolean carenado;
	
	
	public Motocicleta (String numBastidor, boolean carenado, String marca, 
			String modelo, int cilindrada, int potencia, String tipoCombustible, double precio, boolean vendido) {
		super (marca, modelo, cilindrada, potencia, tipoCombustible, precio, vendido);
		this.numBastidor = numBastidor;
		this.carenado = carenado;
	}


	public String getNumBastidor() {
		return numBastidor;
	}


	public void setNumBastidor(String numBastidor) {
		this.numBastidor = numBastidor;
	}


	public boolean isCarenado() {
		return carenado;
	}


	public void setCarenado(boolean carenado) {
		this.carenado = carenado;
	}


	@Override
	public String toString() {
		return super.toString() + "Motocicleta [numBastidor=" + numBastidor + ", carenado=" + carenado + "]";
	}
	
	
	public double calcularImpuesto (double impuesto) {
		double porcentaje = 60.0, divisor = 100.0;
		return super.calcularImpuesto(impuesto) + (getPotencia() * porcentaje) / divisor;
	}
	
	

}
