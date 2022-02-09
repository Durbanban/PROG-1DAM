package ejercicio05;

public class Empleado {
	
	private String nombre;
	private double sueldoBase;
	private double recaudacionVentas;
	private String id;
	
	public Empleado (String nombre, double sueldoBase, double recaudacionVentas, String id) {
		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
		this.recaudacionVentas = recaudacionVentas;
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public double getRecaudacionVentas() {
		return recaudacionVentas;
	}

	public void setRecaudacionVentas(double recaudacionVentas) {
		this.recaudacionVentas = recaudacionVentas;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sueldoBase=" + sueldoBase + ", recaudacionVentas=" + recaudacionVentas
				+ ", id=" + id + "]";
	}
	
	
	public double calcularSueldo (double impuesto) {
		return sueldoBase;
	}
	
	
	

}
