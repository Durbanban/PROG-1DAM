package ejemploInstrumentos;

import java.util.Iterator;

public class Musica {
	
	
	public void afinar (IInstrumento i) {
		i.afinar();
	}
	
	public void tocar (IInstrumento i) {
		i.tocar();
	}
	
	public String mostrarTipo (IInstrumento i) {
		return i.tipo();
	}
	
	public void afinarTodos (IInstrumento [] listaI) {
		for (int i = 0; i < listaI.length; i++) {
			afinar (listaI [i]);
		}
	}
	
	public void tocarTodos (IInstrumento [] listaI) {
		for (int i = 0; i < listaI.length; i++) {
			tocar (listaI [i]);
		}
	}
	
	public void mostrarTipos (IInstrumento [] listaI) {
		for (int i = 0; i < listaI.length; i++) {
			System.out.println(mostrarTipo (listaI [i]));
		}
		
	}

}
