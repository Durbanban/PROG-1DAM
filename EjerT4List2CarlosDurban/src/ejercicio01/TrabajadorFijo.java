package ejercicio01;

public class TrabajadorFijo extends Trabajador {
	
	private int diasVacaciones;
	
	public TrabajadorFijo (String id, String nombre, int edad, int diasVacaciones) {
		super (id, nombre, edad);
		this.diasVacaciones = diasVacaciones;
	}

	public int getDiasVacaciones() {
		return diasVacaciones;
	}

	public void setDiasVacaciones(int diasVacaciones) {
		this.diasVacaciones = diasVacaciones;
	}

	@Override
	public String toString() {
		return super.toString() + "TrabajadorFijo [diasVacaciones=" + diasVacaciones + "]";
	}
	
	public double calculoIrpf (double sueldo) {
		double irpf = 2.0, divisor = 100.0;
		return sueldo - sueldo * (irpf / divisor);
	}
	


	

}
