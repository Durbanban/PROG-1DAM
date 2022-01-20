package ejercicio04;

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
		System.out.println("Pulse 1 para añadir cliente");
		System.out.println("Pulse 2 para mostrar todos los clientes");
		System.out.println("Pulse 3 para calcular el IMC de un cliente");
		System.out.println("Pulse 4 para dar de baja un cliente");
		System.out.println("Pulse 5 para calcular el IMC medio de todos los clientes");
		System.out.println("Pulse 0 para salir");
	}
	
	public void addCliente (Cliente c) {
		for (int i = 0; i < listaClientes.length; i++) {
			if (listaClientes [i] == null) {
				listaClientes [i] = c;
			}
		}
	}
	
	public void mostrarClientes () {
		for (int i = 0; i < listaClientes.length; i++) {
			System.out.println(listaClientes [i]);
		}
	}
	
	
	
	

}
