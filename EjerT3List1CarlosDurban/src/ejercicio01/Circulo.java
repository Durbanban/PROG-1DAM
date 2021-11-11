package ejercicio01;

public class Circulo {
	
	//Atributos
	
	private double radio;
	
	//Constructores
	
	public Circulo (double radio) {
		this.radio = radio;
	}
	
	public Circulo () {
		
	}
	
	//getters y setters
	
	public double getRadio () {
		return radio;
	}
	
	public void setRadio (double radio) {
		this.radio = radio;
	}
	
	//Métodos propios
	
		public double calcularArea () {
			double dos = 2.0;
			return Math.PI * Math.pow(radio, dos);
		}
	

}
