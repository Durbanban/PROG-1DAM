package ejercicio;

public class Plataforma {
	
	private Deposito [] listaDepo;
	public static int capacidadTotal;
	
	public Plataforma (Deposito [] listaDepo) {
		this.listaDepo = listaDepo;
		Plataforma.capacidadTotal = 0;
	}
	
	public Plataforma () {
		
	}

	public Deposito[] getListaDepo() {
		return listaDepo;
	}

	public void setListaDepo(Deposito[] listaDepo) {
		this.listaDepo = listaDepo;
	}

	public static int getCapacidadTotal() {
		return capacidadTotal;
	}

	public static void setCapacidadTotal(int capacidadTotal) {
		Plataforma.capacidadTotal = capacidadTotal;
	}
	
	
	public void mostrarMenuPrincipal () {
		System.out.println("\nPulse 1 para añadir un nuevo deposito a la plataforma");
		System.out.println("Pulse 2 para calcular el precio de venta al público");
		System.out.println("Pulse 3 para calcular la capacidad total de la plataforma");
		System.out.println("Pulse 4 para calcular el beneficio de Repsol con un depósito");
		System.out.println("Pulse 5 para calcular el beneficio de Repsol con todos los depósitos");
		System.out.println("Pulse 6 para calcular el beneficio teórico (todos los depósitos llenos) de Repsol con la plataforma");
		System.out.println("Pulse 0 para salir");
	}
	
	public void addDeposito (Deposito depo, int posicion) { // Me sobra el bucle for.
		for (int i = 0; i < listaDepo.length; i++) {
			if (i == posicion) {
				listaDepo [i] = depo;
				capacidadTotal += listaDepo [i].calcularLitros();
			}
		}	
	}
	
	public void mostrarDepos () {
		for (int i = 0; i < listaDepo.length; i++) {
			if (listaDepo [i] == null) {
				System.out.println("En construcción");
			}else {
				System.out.println((i+1) + ". " + listaDepo [i]);
			}
			
		}
	}
	
	public double calcularPrecioFinal (int posicion, int porcentaje) {
		double divisor = 100.0;
		return listaDepo [posicion - 1].getPrecioCoste() + listaDepo [posicion - 1].getPrecioCoste() * (porcentaje / divisor);
	}
	
	public int calcularLitrosTotales () {
		int suma = 0;
		for (int i = 0; i < listaDepo.length; i++) {
			if (listaDepo[i] != null) {
				suma += listaDepo [i].getLitros();	
			}			
		}
		return suma;
	}
	
	public double calcularBeneficio (int posicion, double precioLitro) {
		return listaDepo [posicion - 1].getLitros()* precioLitro;
	}
	
	public double calcularBeneficioTotal (double precioLitro) {
		int suma = 0;
		for (int i = 0; i < listaDepo.length; i++) {
			if (listaDepo [i] != null) {
				suma += listaDepo [i].getLitros();
			}			
		}
		return suma * precioLitro;
	}
	
	public double calcularBeneficioTeorico (double precioLitro) {
		return capacidadTotal * precioLitro;
	}

}
