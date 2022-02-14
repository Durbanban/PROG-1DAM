package ejercicio03;


/**
 * 
 * Clase POJO de Motocicleta, que hereda de Vehiculo
 * 
 * @author DURBAN
 *
 */
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
	
	/**
	 * 
	 * Método sobreescrito de la clase Vehiculo
	 * 
	 * @param impuesto Puede variar según el usuario
	 * @return Devuelve el precio final de la motocicleta
	 * 
	 */
	public double calcularImpuesto (double impuesto) {
		// Se crea un porcentaje para el cálculo del precio, ya que es un 60% de la potencia
		double porcentaje = 60.0, divisor = 100.0;
		return super.calcularImpuesto(impuesto) + (getPotencia() * porcentaje) / divisor;
	}
	
	

}
