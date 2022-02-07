package ejemploAbstracto;

public class Cuadrado extends Figura{
	
	private double lado;
	
	public Cuadrado (double x, double y, double lado) {
		super (x, y);
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return super.toString() + "Cuadrado [lado=" + lado + "]";
	}
	
	
	public double calcularArea () {
		return lado * lado;
	}
	
	public void mostrarLados () {
		System.out.println("Sólo estoy en la clase cuadrado. Tengo 4 lados.");
	}
	
	
	

}
