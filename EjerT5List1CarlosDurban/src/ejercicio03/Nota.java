package ejercicio03;

public class Nota {
	
	private double calificacion;

	public Nota(double calificacion) {
		this.calificacion = calificacion;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	@Override
	public String toString() {
		return "Nota [calificacion=" + calificacion + "]";
	}
	
	

}
