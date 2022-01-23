package ejercicio06;

public class Sala {
	
	private int id;
	private int aforoMaximo;
	private Entrada [] localidades;
	private static double recaudacion;
	
	
	public Sala (int id, int aforoMaximo, Entrada [] localidades, double recaudacion) {
		this.id = id;
		this.aforoMaximo = aforoMaximo;
		this.localidades = localidades;
		Sala.recaudacion = recaudacion;
	}
	
	public Sala () {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAforoMaximo() {
		return aforoMaximo;
	}

	public void setAforoMaximo(int aforoMaximo) {
		this.aforoMaximo = aforoMaximo;
	}

	public Entrada[] getLocalidades() {
		return localidades;
	}

	public void setLocalidades(Entrada[] localidades) {
		this.localidades = localidades;
	}
	
	public static double getRecaudacion() {
		return recaudacion;
	}
	
	public static void setRecaudacion (double recaudacion) {
		Sala.recaudacion = recaudacion;
	}
	
	public static void mostrarMenuPrincipal () {
		System.out.println("Pulse 1 para ver la cartelera");
		System.out.println("Pulse 2 para comprar una entrada");
		System.out.println("Pulse 3 para mostrar las ganancias totales");
		System.out.println("Pulse 4 para modificar el precio de la entrada");
		System.out.println("Pulse 5 para mostrar las localidades disponbles");
		System.out.println("Pulse 0 para salir");
	}
	
	public void mostrarCartelera () {
		System.out.println("La película que se proyectará en la Sala " + id + " seguro que no es Matrix Resurrections porque es malísima");
	}
	
	public void mostrarEntradas () {
		for (Entrada entrada : localidades) {
			System.out.println(entrada);
		}
	}
	
	public void comprarEntrada (int posicion) {
		if (localidades [posicion - 1].isDisponible()) {
			recaudacion += localidades [posicion - 1].getPrecio();
			localidades [posicion - 1].setDisponible(false);
			
		}
	}
	
	public void mostrarGanancias () {
		System.out.println("La cantidad total de ganancias hoy es: " + recaudacion + " €");
	}
	
	public void modificarPrecio (int id, double precio) {
		localidades [id - 1].setPrecio(precio);
	}
	
	public int calcularLocalidadesDisponibles () {
		int cantidad = 0;
		for (Entrada entrada : localidades) {
			if (entrada.isDisponible()) {
				cantidad ++;
			}
		}
		return cantidad;
	}

	
	
	
	
	

}
