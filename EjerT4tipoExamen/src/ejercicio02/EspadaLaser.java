package ejercicio02;

public class EspadaLaser extends Producto {
	
	private String tipo;

	public EspadaLaser(double precioBase, int unidades, String nombre, String tipo) {
		super(precioBase, unidades, nombre);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return super.toString() + "EspadaLaser [tipo=" + tipo + "]";
	}
	
	
	public double calcularPVP (double porcentaje, double fijo) {
		double divisor = 100.0; 
		if (tipo.equalsIgnoreCase("doble")) {
			return super.getPrecioBase() + super.getPrecioBase() * (porcentaje / divisor) + fijo;
		}else {
			return super.getPrecioBase() + super.getPrecioBase() * (porcentaje / divisor);
		}
	}

}
