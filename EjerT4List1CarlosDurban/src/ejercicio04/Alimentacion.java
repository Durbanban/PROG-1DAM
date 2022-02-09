package ejercicio04;

public class Alimentacion extends Producto {
	
	private int diasParaCaducar;
	
	
	public Alimentacion (double precioUnitario, String nombre, String id, int diasParaCaducar) {
		super (precioUnitario, nombre, id);
		this.diasParaCaducar = diasParaCaducar;
	}


	public int getDiasParaCaducar() {
		return diasParaCaducar;
	}


	public void setDiasParaCaducar(int diasParaCaducar) {
		this.diasParaCaducar = diasParaCaducar;
	}


	@Override
	public String toString() {
		return super.toString() + "Alimentacion [diasParaCaducar=" + diasParaCaducar + "]";
	}


	public void avisarCaducidad () {
		int dos = 2;
		if (diasParaCaducar <= dos) {
			System.out.println("Este producto caduca en dos o menos días.");
		}
	}
	
	public double calcularPrecioFinal (double impuesto, double descuento) {
		int dos = 2;
		double divisor = 100.0;
		if (diasParaCaducar <= dos) {
			return getPrecioUnitario() - getPrecioUnitario() * (descuento / divisor);
		}else {
			return getPrecioUnitario();
		}
	}



	
	

}
