package ejemploAbstracto;

public class Rectangulo extends Figura {
	
	private double altura;
	private double base;
	
	public Rectangulo (double x, double y, double altura, double base) {
		super (x, y);
		this.altura = altura;
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	@Override
	public String toString() {
		return super.toString() + "Rectangulo [altura=" + altura + ", base=" + base + "]";
	}
	
	public double calcularArea () {
		return base * altura;
	}
	
	
	

}
