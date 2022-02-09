package ejercicio05;

public class EmpleadoAComision extends Empleado {
	
	private double incentivo;
	
	public EmpleadoAComision (String nombre, double sueldoBase, double recaudacionVentas, String id, double incentivo) {
		super (nombre, sueldoBase, recaudacionVentas, id);
		this.incentivo = incentivo;
	}

	public double getIncentivo() {
		return incentivo;
	}

	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}

	@Override
	public String toString() {
		return super.toString() + "EmpleadoAComision [incentivo=" + incentivo + "]";
	}
	
	
	public double calcularSueldo (double impuesto) {
		double divisor = 100;
		return super.calcularSueldo(impuesto) + incentivo;
	}
	
}
