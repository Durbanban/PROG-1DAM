package ejercicio03;


/**
 * 
 * Clase POJO de Coche, que hereda de Vehiculo
 * 
 * @author DURBAN
 *
 */
public class Coche extends Vehiculo {
	
	private String numBastidor;
	private int numPuertas;
	
	public Coche (String numBastidor, int numPuertas, String marca, 
			String modelo, int cilindrada, int potencia, String tipoCombustible, double precio, boolean vendido) {
		super (marca, modelo, cilindrada, potencia, tipoCombustible, precio, vendido);
		this.numBastidor = numBastidor;
		this.numPuertas = numPuertas;
	}

	public String getNumBastidor() {
		return numBastidor;
	}

	public void setNumBastidor(String numBastidor) {
		this.numBastidor = numBastidor;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	@Override
	public String toString() {
		return super.toString() + "Coche [numBastidor=" + numBastidor + ", numPuertas=" + numPuertas + "]";
	}
	
	/**
	 * 
	 * Método sobreescrito de la clase Vehiculo
	 * 
	 * @param impuesto Puede variar según el usuario
	 * @return Devuelve el precio final del coche
	 * 
	 */
	
	public double calcularImpuesto (double impuesto) {
		// Al precio final de vehiculo, hay que sumarle el 25% de la cilindrada del coche
		double porcentaje = 25.0, divisor = 100.0;
		return super.calcularImpuesto(impuesto) + (getCilindrada() * porcentaje) / divisor;
	}

	
	
	
	

}
