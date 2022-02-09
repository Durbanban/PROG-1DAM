package ejercicio05;

import java.util.Arrays;
import java.util.Iterator;

public class Oficina {
	
	private Empleado [] plantilla;
	
	public Oficina (Empleado [] plantilla) {
		this.plantilla = plantilla;
	}

	public Empleado[] getPlantilla() {
		return plantilla;
	}

	public void setPlantilla(Empleado[] plantilla) {
		this.plantilla = plantilla;
	}

	@Override
	public String toString() {
		return "Oficina [plantilla=" + Arrays.toString(plantilla) + "]";
	}
	
	
	public double calcularSueldoUnEmpleado (Empleado emp, double impuesto) {
		return emp.calcularSueldo(impuesto);
	}
	
	public double calcularSueldoPlantilla (double impuesto) {
		double suma = 0.0;
		for (Empleado empleado : plantilla) {
			suma += empleado.calcularSueldo(impuesto);
		}
		return suma;
	}

}
