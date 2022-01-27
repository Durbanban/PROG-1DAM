package ejemploConstructorMadre;

public class Consultor extends Trabajador {
	private int horas;
	private double tarifa;
	
	
	public Consultor (String nombre, String puesto, int horas, double tarifa) {
		super (nombre, puesto);
		this.horas = horas;
		this.tarifa = tarifa;		
	}


	public int getHoras() {
		return horas;
	}


	public void setHoras(int horas) {
		this.horas = horas;
	}


	public double getTarifa() {
		return tarifa;
	}


	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}


	@Override
	public String toString() {
		return super.toString() + " Consultor [horas=" + horas + ", tarifa=" + tarifa + "]";
	}
	
	public double calcularPaga () { //Tiene que tener la misma firma que el método de la clase padre.
		return super.calcularPaga() + horas * tarifa;
	}
	
	public void avisarHorasExtras (int tope) {
		if (horas > tope) {
			System.out.println("No trabajes tanto");
		}else {
			System.out.println("Sigue currando malandrín");
		}
	}


	


	


	


	


	
	
	
	

}
