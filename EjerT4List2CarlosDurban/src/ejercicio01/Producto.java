package ejercicio01;

public class Producto implements Impuesto {
	
	private String id;
	private String nombre;
	private int diasParaCaducar;
	
	public Producto (String id, String nombre, int diasParaCaducar) {
		this.id = id;
		this.nombre = nombre;
		this.diasParaCaducar = diasParaCaducar;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDiasParaCaducar() {
		return diasParaCaducar;
	}

	public void setDiasParaCaducar(int diasParaCaducar) {
		this.diasParaCaducar = diasParaCaducar;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", diasParaCaducar=" + diasParaCaducar + "]";
	}

	@Override
	public double calculoIva(double precio, int iva) {
		double divisor = 0.0;
		return precio + precio * (iva / divisor);
	}

	@Override
	public double calculoIrpf(double sueldo) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
