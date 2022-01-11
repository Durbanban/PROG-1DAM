package ejercicio09;

public class Maquina {
	
	private String password;
	
	public Maquina (String password) {
		this.password = password;
	}
		
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	public double comprarBilletes (int numBilletes, double cantInsertada, double precioTicket) {	
		double coste = 0.0, devolucion = 0.0;
		coste = numBilletes * precioTicket;
		devolucion = cantInsertada - coste;
		return devolucion;
	}
	
	public boolean pedirPassword (String pass) {		
		boolean confirmacion;
		if (pass.equals(getPassword())) {
			confirmacion = false;
		}else {
			confirmacion = true;
		}
		return confirmacion;
	}
	
	public void bienvenida () {
		System.out.println("Bienvenido al metro de Triana");
		System.out.println("Pulse 1 para comprar billetes");
		System.out.println("Pulse 2 para opciones de operario");
		System.out.println("Pulse 0 para salir");
	}
	
	
	
	

}
