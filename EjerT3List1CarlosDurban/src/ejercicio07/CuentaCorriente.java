package ejercicio07;

public class CuentaCorriente {
	
	// Atributos
	
	private double saldo;
	private String nombre;
	
	// Constructor
	
	public CuentaCorriente (double saldo, String nombre) {
		this.saldo = saldo;
		this.nombre = nombre;
	}
	
	// Constructor vacío
	
	public CuentaCorriente () {
		
	}
	
	// getters y setters
	
	public double getSaldo () {
		return saldo;
	}
	
	public void setSaldo (double saldo) {
		this.saldo = saldo;
	}
	
	public String getNombre () {
		return nombre;
	}
	
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	public double ingresar (double ingreso) {
		double resultado = saldo;
		resultado = resultado + ingreso;
		return resultado;
	}
	
	public double retirar (double retirada, double saldo) {
		double resultado = this.saldo;
		if (retirada < this.saldo) {
			resultado = resultado - retirada;
		}else {
			System.out.println("Lo sentimos no es posible realizar la operación");
		}
		return resultado;
	}
	
	public double convertir (double saldo) {
		double conversor = 1.13;
		double resultado = saldo;
		resultado = resultado * conversor;
		return resultado;		
	}

}
