package basico;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List <Producto> lista = new ArrayList <Producto>();
		CrudProducto crudP = new CrudProducto(lista);
		
		String [] idProductos = {"a001", "a002", "a003", "a004", "a005", "b001", "b002",
				"b003", "b004", "b005", "c001", "c002", "c003", "c004", "c005", "d001", "d002", "d003", "d004", "d005"};
		String [] nombreProductos = {"Paté de atún", "Cacao desgrasado", "Mantequilla ligera", "Yogur griego", "Pizza Congelada", "Pizza Fresca", "Huevos XL", 
				"Huevos L", "Huevos M", "Salchichón al corte", "Anchoa", "Chorizo al corte", "Pato a la naranja", "Sirope de Agave", "Chocolate blanco", 
				"Chocolate negro", "Spaguetti", "Taggliatelle", "Arroz redondo", "Arroz largo"};
		for (int i = 0; i < nombreProductos.length; i++) {
			crudP.agregarProducto(new Producto(idProductos[i], nombreProductos[i], "Categoria"));
		}

	}

}
