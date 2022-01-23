package ejercicio04;

import java.util.Iterator;

public class Gimnasio {
	
	private Cliente [] listaClientes;
	
	
	public Gimnasio (Cliente [] listaClientes) {
		this.listaClientes = listaClientes;
	}
	
	public Gimnasio () {
		
	}


	public Cliente[] getListaClientes() {
		return listaClientes;
	}


	public void setListaClientes(Cliente[] listaClientes) {
		this.listaClientes = listaClientes;
	}
	
	
	public void mostrarMenuPrincipal () {
		System.out.println("\nPulse 1 para añadir cliente");
		System.out.println("Pulse 2 para mostrar todos los clientes");
		System.out.println("Pulse 3 para calcular el IMC de un cliente");
		System.out.println("Pulse 4 para dar de baja un cliente");
		System.out.println("Pulse 5 para calcular el IMC medio de todos los clientes");
		System.out.println("Pulse 0 para salir");
	}
	
	public void addCliente (Cliente c, int posicion) {
		for (int i = 0; i < listaClientes.length; i++) {
			if (i == posicion) {
				listaClientes [i] = c;
			}
		}
	}
	
	public void mostrarClientes () {
		for (int i = 0; i < listaClientes.length; i++) {
			System.out.println(listaClientes [i]);
		}
	}
	
	public Cliente buscarPorDni (String dni) {
		for (int i = 0; i < listaClientes.length; i++) {
			if (dni.equalsIgnoreCase(listaClientes [i].getDni())) {
				return listaClientes [i];
			}
		}
		return null;
	}
	
	public void darDeBaja (Cliente c) {
		c.setActivo(false);
		
	}
	
	public double calcularMediaIMC () {
		int contador = 0;
		double mediaIMC = 0.0;
		for (int i = 0; i < listaClientes.length; i++) {
			if (listaClientes [i] != null && listaClientes [i].isActivo()) {
				mediaIMC += listaClientes [i].calcularIMC();
				contador ++;
			}
		}
		return mediaIMC / contador;
		
	}
	
	
	
	

}
