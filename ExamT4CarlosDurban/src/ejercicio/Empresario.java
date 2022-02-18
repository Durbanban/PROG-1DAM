package ejercicio;

public class Empresario extends Visitante {
	
	private String nombreEmpresa;
	private double dineroAportado;
	
	
	public Empresario(String id, double precioBasico, int edad, String nombreEmpresa, double dineroAportado) {
		super(id, precioBasico, edad);
		this.nombreEmpresa = nombreEmpresa;
		this.dineroAportado = dineroAportado;
	}


	public String getNombreEmpresa() {
		return nombreEmpresa;
	}


	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}


	public double getDineroAportado() {
		return dineroAportado;
	}


	public void setDineroAportado(double dineroAportado) {
		this.dineroAportado = dineroAportado;
	}


	@Override
	public String toString() {
		return super.toString() + "Empresario [nombreEmpresa=" + nombreEmpresa + ", dineroAportado=" + dineroAportado + "]";
	}
	
	public double calcularPrecioEntrada (double descGen, double descEmp, double descFam) {
		double topeDescuento = 100.0, divisor = 100.0;
		if (dineroAportado > topeDescuento) {
			return super.calcularPrecioEntrada(descGen, descEmp, descFam) - (super.calcularPrecioEntrada(descGen, descEmp, descFam) * (descEmp / divisor));
		}else {
			return super.calcularPrecioEntrada(descGen, descEmp, descFam);
		}
	}
	
	public String invitarCafe () {
		return "Consumición gratis";
	}
	
	
	
	
}
