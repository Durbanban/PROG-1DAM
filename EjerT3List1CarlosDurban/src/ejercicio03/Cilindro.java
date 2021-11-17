package ejercicio03;

public class Cilindro {
	
	// Atributos
	
	private double radio;
	private double altura;
	
	// Constructor
	
	public Cilindro (double altura, double radio) {
		this.altura = altura;
		this.radio = radio;
	}
	
	//Constructor vacío
	
	public Cilindro () {
		
	}
	
	// getters y setters
	
	public double getRadio () {
		return radio;
	}
	
	public void setRadio (double radio) {
		this.radio = radio;
	}
	
	public double getAltura () {
		return altura;
	}
	
	public void setAltura (double altura) {
		this.altura = altura;
	}
	
	//Métodos
	
	public double calcularVolumen (double altura, double radio) {
		double resultado = 0, dos = 2.0;
		resultado = (Math.PI) * (Math.pow (radio, dos) * altura);	
		return resultado;
	}

}
