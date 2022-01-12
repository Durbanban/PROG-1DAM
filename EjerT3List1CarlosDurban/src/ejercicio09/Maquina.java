package ejercicio09;

public class Maquina {
	
	private String password;
	private double recaudacion;
	
	public Maquina (String password, double recaudacion) {
		this.password = password;
		this.recaudacion = recaudacion;
	}
		
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public double getRecaudacion () {
		return recaudacion;
	}
	
	public void setRecaudacion (double recaudacion) {
		this.recaudacion = recaudacion;
	}


	public boolean comprobarCompra (int numBilletes, double cantInsertada, Ticket t) {	
		double coste = 0.0;
		coste = numBilletes * t.getPrecio();
		if (coste <= cantInsertada) {
			return false;
		}else {
			return true;
		}
	}
	
	public double devolverImporte (int numBilletes, double cantInsertada, Ticket t) {
		double res = 0.0, coste = 0.0;
		coste = numBilletes * t.getPrecio();
		res = cantInsertada - coste;
		this.recaudacion = recaudacion + coste;
		return res;
	}
	
	public boolean pedirPassword (String pass) {		
		if (pass.equals(getPassword())) {
			return false;
		}else {
			return true;
		}
	}
	
	public void menuPrincipal () {
		System.out.println("Pulse 1 para comprar billetes");
		System.out.println("Pulse 2 para opciones de operario");
		System.out.println("Pulse 0 para salir");
	}
	
	public void menuOperario () {
		System.out.println("Pulse 1 para mostrar recaudación");
		System.out.println("Pulse 2 para resetear la recaudación");
		System.out.println("Pulse 0 para volver al menú principal");
	}
	
	
	
	

}
