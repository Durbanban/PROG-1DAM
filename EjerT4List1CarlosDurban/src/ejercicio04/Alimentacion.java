package ejercicio04;

public class Alimentacion extends Producto {
	
	private boolean caducado;
	
	
	public Alimentacion (Double precioUnitario, String nombre, String id, boolean caducado) {
		super (precioUnitario, nombre, id);
		this.caducado = caducado;
	}


	public boolean isCaducado() {
		return caducado;
	}


	public void setCaducado(boolean caducado) {
		this.caducado = caducado;
	}


	@Override
	public String toString() {
		return super.toString() + "Alimentacion [caducado=" + caducado + "]";
	}
	
	

}
