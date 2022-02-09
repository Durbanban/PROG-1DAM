package ejercicio05;

public class EmpleadoFijo extends Empleado {
	
	public EmpleadoFijo (String nombre, double sueldoBase, double recaudacionVentas, String id) {
		super (nombre, sueldoBase, recaudacionVentas, id);
	}

	@Override
	public String toString() {
		return super.toString() + "EmpleadoFijo []";
	}
	
	public double calcularSueldo (double impuesto) {
		double divisor = 100;
		return super.calcularSueldo(impuesto) + super.calcularSueldo(impuesto) * (impuesto / divisor);
	}
	
	
}
