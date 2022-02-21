package ejemploArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tam = 6;
		List <String> lista = new ArrayList <String> ();
		List <String []> listaArrays = new ArrayList <String []> ();
		List <String> pila = new Stack <String> ();
		String [] nombres = new String [tam];
		
		lista.add("Durbán");
		lista.add("Álvaro");
		System.out.println(lista);
	}

}
