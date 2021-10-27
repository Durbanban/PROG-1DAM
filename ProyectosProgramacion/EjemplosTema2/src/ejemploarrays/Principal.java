package ejemploarrays;



import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Los arrays siempre tienen tamaño fijo. No pueden cambiar de tamaño.
		int tam = 10;
		int [] edades = new int [tam];
		
		for (int i = 0;i < edades.length;i++) {//for para cargar el array
			System.out.printf("Introduzca el número %d", (i+1));
			edades [i] = Leer.datoInt();
		}
		for (int i = 0; i < edades.length; i++) {//for para mostrar el array
			System.out.print(edades [i]);
		}
		
		
		
	}

}
