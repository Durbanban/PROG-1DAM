package ejercicio04;

import java.util.Arrays;

public class Venta {
	
	private LineaVenta [] lineasTicket;
	
	
	public Venta (LineaVenta [] lineasTicket) {
		this.lineasTicket = lineasTicket;
	}


	public LineaVenta[] getLineasTicket() {
		return lineasTicket;
	}


	public void setLineasTicket(LineaVenta[] lineasTicket) {
		this.lineasTicket = lineasTicket;
	}


	@Override
	public String toString() {
		return "Venta [lineasTicket=" + Arrays.toString(lineasTicket) + "]";
	}
	
	

}
