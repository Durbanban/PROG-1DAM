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
	
	
	public void mostrarTicket (double impuesto, double descuento) {
		double suma = 0.0;
		System.out.println("**********************************************************************************"
				+ "**********************************\n\n\tCantidad\t\t\tProducto\t\t\tPrecioUnitario\t\t\tTotal");
		for (int i = 0; i < lineasTicket.length; i++) {
			Producto aux;
			System.out.printf("\n\r"
					+ "\t%d\t\t\t\t%s\t\t\t%.2f\t\t\t\t%.2f\n\r", lineasTicket [i].getCantidad(), lineasTicket[i].getProducto().getNombre()
					, lineasTicket[i].getProducto().calcularPrecioFinal(impuesto, descuento), 
					lineasTicket[i].getProducto().calcularPrecioFinal(impuesto, descuento) * lineasTicket [i].getCantidad());
			if (lineasTicket [i].getProducto() instanceof Alimentacion) {
				suma += ((Alimentacion)lineasTicket[i].getProducto()).calcularPrecioFinal(impuesto, descuento);
			}else if (lineasTicket [i].getProducto() instanceof Electronica) {
				suma += ((Electronica) lineasTicket [i].getProducto()).calcularPrecioFinal(impuesto, descuento);
			}else {
				suma += ((Ropa) lineasTicket [i].getProducto()).calcularPrecioFinal(impuesto, descuento);
			}
		}
		System.out.printf("\n********************************************************************************"
				+ "**********************************\n\n\t\t\t\t\t\t\t\tTOTAL IVA INCLUIDO: \t\t\t%.2f", suma);
		
	}
	
	public void listarProductos () {
		for (int i = 0; i < lineasTicket.length; i++) {
			System.out.println((i+1) + ". " +lineasTicket [i].getProducto());
		}
	}
	
	

}
