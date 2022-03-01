package ejemploInstrumentos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0, tam = 7;
		IInstrumento [] listaInstrumentos = new IInstrumento [tam];
		
		System.out.println("Bienvenido al ejemplo de interfaces");
		
		Musica m = new Musica ();
		
		listaInstrumentos [i++] = new Guitarra ();
		listaInstrumentos [i++] = new Ukelele ();
		listaInstrumentos [i++] = new Piano ();
		listaInstrumentos [i++] = new Saxofon ();
		listaInstrumentos [i++] = new Guzla ();
		listaInstrumentos [i++] = new Guitarra ();
		listaInstrumentos [i++] = new Piano ();
		
		m.tocarTodos(listaInstrumentos);
		m.afinarTodos(listaInstrumentos);
		m.mostrarTipos(listaInstrumentos);
		
		

	}

}
