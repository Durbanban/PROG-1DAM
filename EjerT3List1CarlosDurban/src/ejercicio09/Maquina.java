package ejercicio09;

public class Maquina {
	
	private String password;
	
	public Maquina (String password) {
		this.password = password;
	}
	
	public double comprarBilletes (int numBilletes, double cantInsertada, double precioTicket) {	
		double coste = 0.0, devolucion = 0.0;
		coste = numBilletes * precioTicket;
		devolucion = cantInsertada - coste;
		return devolucion;
	}
	
	public boolean pedirPassword (String password) {		
		boolean confirmacion = true;
		if (password == this.password) {
			confirmacion = true;
		}else {
			confirmacion = false;
		}
		return confirmacion;
		
	}
	
	
	
	

}
