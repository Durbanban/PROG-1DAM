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
		mostrarTicket(t, numBilletes , res);
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
	
	public void mostrarTicket (Ticket t, int cantidad, double devolucion) {
		double costeTotal = 0.0;
		costeTotal = t.getPrecio() * cantidad;
		System.out.println("\t\t\tMETRO DE TRIANA");
		System.out.println("\n\t*********************************************");
		System.out.println("\n\tPrecio unitario\tCantidad\tPrecio total");
		System.out.printf("\t%.2f\t\t%d\t\t%.2f", t.getPrecio(), cantidad, costeTotal);
		System.out.printf("\n\tSu cambio es: %.2f €", devolucion);
		System.out.println("\n\n\t*********************************************");
	}
	
	
	
	

}
