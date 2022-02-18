package ejercicio;

public class Familiar extends Visitante {
	
	private int numHijosMatriculados;

	public Familiar(String id, double precioBasico, int edad, int numHijosMatriculados) {
		super(id, precioBasico, edad);
		this.numHijosMatriculados = numHijosMatriculados;
	}

	public int getNumHijosMatriculados() {
		return numHijosMatriculados;
	}

	public void setNumHijosMatriculados(int numHijosMatriculados) {
		this.numHijosMatriculados = numHijosMatriculados;
	}

	@Override
	public String toString() {
		return super.toString() + "Familiar [numHijosMatriculados=" + numHijosMatriculados + "]";
	}
	
	public double calcularPrecioEntrada (double descGen, double descEmp, double descFam) {
		return super.calcularPrecioEntrada(descGen, descEmp, descFam) - (descFam * numHijosMatriculados);
	}
	
	

}
