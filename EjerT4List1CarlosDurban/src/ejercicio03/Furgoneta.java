package ejercicio03;


/**
 * 
 * Clase POJO de Furgoneta, que hereda de Vehiculo
 * 
 * @author DURBAN
 *
 */
public class Furgoneta extends Vehiculo {
	
	private String numBastidor;
	private double cargaMax;
	private double impuestoFurgo;
	
	
	public Furgoneta (String numBastidor, double cargaMax, double impuestoFurgo, String marca, 
			String modelo, int cilindrada, int potencia, String tipoCombustible, double precio, boolean vendido) {
		super (marca, modelo, cilindrada, potencia, tipoCombustible, precio, vendido);
		this.numBastidor = numBastidor;
		this.cargaMax = cargaMax;
		this.impuestoFurgo = impuestoFurgo;
	}


	public String getNumBastidor() {
		return numBastidor;
	}


	public void setNumBastidor(String numBastidor) {
		this.numBastidor = numBastidor;
	}


	public double getCargaMax() {
		return cargaMax;
	}


	public void setCargaMax(double cargaMax) {
		this.cargaMax = cargaMax;
	}


	public double getImpuestoFurgo() {
		return impuestoFurgo;
	}


	public void setImpuestoFurgo(double impuestoFurgo) {
		this.impuestoFurgo = impuestoFurgo;
	}


	@Override
	public String toString() {
		return super.toString() + "Furgoneta [numBastidor=" + numBastidor + ", cargaMax=" + cargaMax + ", impuestoFurgo=" + impuestoFurgo
				+ "]";
	}
	
	/**
	 * 
	 * Método sobreescrito de la clase Vehiculo
	 * 
	 * @param impuesto Puede variar según el usuario
	 * @return Devuelve el precio final de la furgoneta
	 * 
	 */
	
	public double calcularImpuesto (double impuesto) {
		// Al precio de Vehiculo, se le suma un impuesto especial de furgonetas.
		return super.calcularImpuesto(impuesto) + impuestoFurgo;
	}
	
	

}
