package ejercicio01;

import java.util.Random;

public class Inmobiliaria {
	
	private int id;
	private Piso piso;
	private int [] precio6Meses;
	
	public Inmobiliaria (int id, Piso piso, int [] precio6Meses) {
		this.id = id;
		this.piso = piso;
		this.precio6Meses = precio6Meses;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Piso getPiso() {
		return piso;
	}

	public void setPiso(Piso piso) {
		this.piso = piso;
	}

	public int[] getPrecio6Meses() {
		return precio6Meses;
	}

	public void setPrecio6Meses(int[] precio6Meses) {
		this.precio6Meses = precio6Meses;
	}
	
	public void menuPrincipal () {
		System.out.println("Pulse 1 para generar los precios en 6 meses");
		System.out.println("Pulse 2 para calcular el precio de venta en un mes concreto");
		System.out.println("Pulse 3 para calcular el precio por metro cuadrado");
		System.out.println("Pulse 4 para convertir de euros a libras esterlinas");
		System.out.println("Pulse 5 para mostrar informe de inmueble");
		System.out.println("Pulse 0 para salir");
	}
	
	public int generarAleatorio () {
		int max = 30000, min = 3000, a = 0;
		Random num = new Random(System.nanoTime());
		a = num.nextInt((max - min) + 1);
		return a;
		
	}
	
	public int [] rellenarArray () {
		int [] array = new int[6];
		for (int i = 0; i < precio6Meses.length; i++) {
			array[i] = generarAleatorio();
		}
		setPrecio6Meses (array);
		return array;
	}
	
	public double calcularPrecioVenta (int porcentaje, int mes) {
		int divisor = 100;
		double resultado = 0.0, porciento = 0.0;
		porciento = getPrecio6Meses () [mes] * (porcentaje / divisor);
		for (int i = 0; i < precio6Meses.length; i++) {
			if ((i + 1) == mes) {
				resultado = getPrecio6Meses() [mes] + porciento;
			}
		}
		return resultado;
	}
	
	public double calcularPrecioM2 (int precioVenta, int m2) {
		double resultado = 0.0;
		resultado = precioVenta / m2;
		return resultado;
	}
	
	public double cambioDivisa (double conversor, int precioVenta) {
		double resultado = 0.0;
		resultado = precioVenta * conversor;
		return resultado;
	}
	
	public void mostrarPiso (Piso p) {
		System.out.println("Dirección: " + p.getDireccion());
		System.out.println("Metros cuadrados: " + p.getMetrosCuadrados() + " metros cuadrados");
		if (p.isReforma()) {
			System.out.println("Piso reformado");
		}else {
			System.out.println("Piso sin reformar");
		}
		System.out.println("Precio de venta al público: " + p.getPrecioVenta() + " €");
	}
	

}
