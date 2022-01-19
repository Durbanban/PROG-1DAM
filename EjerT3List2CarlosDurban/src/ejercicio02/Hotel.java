package ejercicio02;

public class Hotel {
	
	private String nombre;
	private Habitacion [] habitaciones;
	
	public Hotel (String nombre, Habitacion [] habitaciones) {
		this.nombre = nombre;
		this.habitaciones = habitaciones;
	}
	
	public Hotel () {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Habitacion[] getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(Habitacion[] habitaciones) {
		this.habitaciones = habitaciones;
	}
	
	public boolean comprobarLimpieza (int numH) {
		return habitaciones [numH-1].isLimpia();
	}
	
	public void imprimirLimpia (int numH) {
		if (comprobarLimpieza (numH)) {
			System.out.println("La habitación está limpia");
		}
		else {
			System.out.println("Todavía no se ha limpiado la habitación");
		}
	}
	
	public double calcularPrecio (int numH) {
		double res = 0.0;
		res = habitaciones [numH - 1].getPrecioB() * habitaciones [numH-1].getNumDias();
		return res;
	}
	
	public void imprimirListado () {
		for (int i = 0; i < habitaciones.length; i++) {
			System.out.println(habitaciones [i]);
		}
	}
	
	public double calcularPrecioExtras (int numH, double extra) {
		if (habitaciones [numH - 1].isExtras()) {
			return calcularPrecio (numH) + extra;
		}else {
			return calcularPrecio (numH);
		}
	}
	
	
	
	

}
