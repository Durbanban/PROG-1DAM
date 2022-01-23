package ejercicio05;

public class Electrodomestico {
	
	private double precio;
	private String color;
	private char consumo;
	private double peso;
	
	
	public Electrodomestico () {
		this.precio = 100.0;
		this.color = "Blanco";
		this.consumo = 'F';
		this.peso = 5.0;
	}
	
	public Electrodomestico (double precio, double peso) {
		this.precio = precio;
		this.color = "Blanco";
		this.consumo = 'F';
		this.peso = peso;
	}
	
	public Electrodomestico (double precio, String color, char consumo, double peso) {
		this.precio = precio;
		this.color = color;
		this.consumo = consumo;
		this.peso = peso;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumo() {
		return consumo;
	}

	public void setConsumo(char consumo) {
		this.consumo = consumo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	@Override
	public String toString() {
		return "Electrodomestico [precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso
				+ "]";
	}
	

	public static char comprobarConsumoEnergetico (char c) {
		if (c == 'A' || c == 'B' || c == 'C' || c == 'D' || c == 'E') {
			return c;
		}else {
			return 'F';
		}
	}
	
	public static String comprobarColor (String color) {
		if (color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {
			return color;
		}else {
			return "Blanco";
		}
	}
	
	public double calcularPrecioFinal () {
		int aumento = 0;
		if (consumo == 'A') {
			aumento = 100;
			return precio + aumento;
		}else if (consumo == 'B') {
			aumento = 80;
			return precio + aumento;
		}else if (consumo == 'C') {
			aumento = 60;
			return precio + aumento;
		}else if (consumo == 'D') {
			aumento = 50;
			return precio + aumento;
		}else if (consumo == 'E') {
			aumento = 30;
			return precio + aumento;
		}else {
			aumento = 10;
			return precio + aumento;
		}
	}
	
	
	
	
	
	

}
