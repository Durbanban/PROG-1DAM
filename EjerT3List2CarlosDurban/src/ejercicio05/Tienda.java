package ejercicio05;

public class Tienda {
	
	private Electrodomestico [] listaElec;
	
	public Tienda (Electrodomestico [] listaElec) {
		this.listaElec = listaElec;
	}

	public Electrodomestico[] getlistaElec() {
		return listaElec;
	}

	public void setlistaElec(Electrodomestico[] listaElec) {
		this.listaElec = listaElec;
	}
	
	
	public void mostrarMenuPrincipal () {
		System.out.println("\nPulse 1 para mostrar todos los productos en stock");
		System.out.println("Pulse 2 para calcular el precio de un producto");
		System.out.println("Pulse 3 para calcular la suma del precio de todos los productos");
		System.out.println("Pulse 4 para calcular la media de los precios de todos los productos");
		System.out.println("Pulse 0 para salir");		
	}
	
	public void mostrarStock () {
		for (int i = 0; i < listaElec.length; i++) {
			System.out.println("Producto " + (i+1) + ": " + listaElec [i]);
		}
	}
	
	public void mostrarPrecioFinal (int posicion) {
		System.out.println("El precio final del producto " + (posicion) + " es: " + listaElec [posicion -1].calcularPrecioFinal() + " €");
	}
	
	public double sumarPrecios () {
		double suma = 0.0;
		for (int i = 0; i < listaElec.length; i++) {
			suma += listaElec[i].calcularPrecioFinal();
		}
		return suma;
	}
	
	public double calcularMediaPrecios () {
		double media = 0.0;
		int contador = 0;
		for (int i = 0; i < listaElec.length; i++) {
			media += listaElec[i].calcularPrecioFinal();
			contador ++;
		}
		return media / contador;
	}
	
	

}
