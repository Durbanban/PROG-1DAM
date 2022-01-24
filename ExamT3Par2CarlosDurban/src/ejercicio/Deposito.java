package ejercicio;

public class Deposito {
	
	private double altura;
	private double radio;
	private int litros;
	private double precioCoste;
	
	public Deposito (double altura, double radio, int litros, double precioCoste) {
		this.altura = altura;
		this.radio = radio;
		this.litros = litros;
		this.precioCoste = precioCoste;
	}
	
	public Deposito () {
		
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public int getLitros() {
		return litros;
	}

	public void setLitros(int litros) {
		this.litros = litros;
	}
	
	public double getPrecioCoste() {
		return precioCoste;
	}

	public void setPrecioCoste(double precioCoste) {
		this.precioCoste = precioCoste;
	}
	
	
	
		
	@Override
	public String toString() {
		return "Deposito [altura=" + altura + " metros, radio=" + radio + " metros, litros=" + litros + ", precioCoste=" + precioCoste + " €"
				+ "]";
	}
	
	

	public double calcularLitros () {
		int dos = 2, litros = 1000;
		double res = 0.0;
		res = (altura * Math.PI * Math.pow(radio, dos)) * litros;
		return res;
	}
	
	
	
	

}
