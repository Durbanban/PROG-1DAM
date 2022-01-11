package ejercicio02;

public class Operaciones {
	
	public double calcularVolumenCilindro (Cilindro c) {
		int dos = 2;
		double resultado = 0.0;
		resultado = Math.PI * Math.pow(c.getRadio(), dos) * c.getAltura();
		return resultado;
	}

}
