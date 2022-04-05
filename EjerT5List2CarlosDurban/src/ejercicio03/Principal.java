package ejercicio03;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.function.Supplier;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idCancion = 1, idArtista = 1, opcionMenu = 0, numeroArtistas= 0, contador = 0;
		Random num = new Random (System.nanoTime());
		String nombreCancion, genero, nombreArtista;
		List <Cancion> listaCanc = new ArrayList();
		Set <Artista> listaArt = new HashSet();
		List <Artista> artistaCancion = new ArrayList();
		LocalTime duracionCancion;
		Supplier <LocalTime> crearDuracion = () -> {
			int max = 360, min = 120, duracionRandom;
			duracionRandom = num.nextInt((max - min + 1) + min);
			return LocalTime.ofSecondOfDay(duracionRandom);
			
			
		
		};
		
		Supplier <LocalDate> crearFechaSalida = () -> {
			int max, min, aleatorio;
			min = ((int)LocalDate.of(1980, 1, 1).toEpochDay());
			max = ((int)LocalDate.now().toEpochDay());
			aleatorio = num.nextInt((max - min + 1) + min);
			return LocalDate.ofEpochDay(((long)aleatorio));
		};
		
		Supplier <Cancion> crearCancion = () -> new Cancion (0, "", new ArrayList<Artista>(), "", crearFechaSalida.get(), crearDuracion.get());
		
		
		Playlist pl = new Playlist (listaCanc, listaArt);
		LocalDate fechaRandom = crearFechaSalida.get();
		duracionCancion = crearDuracion.get();
		System.out.println(fechaRandom);
		System.out.println(duracionCancion);
		
		
		
		System.out.println("Bienvenido a Espotifai");
		
		do {
			mostrarMenuPrincipal();
			opcionMenu = Leer.datoInt();
			switch(opcionMenu) {
				case 1:
					System.out.println("Indique el nombre de la canción: ");
					nombreCancion = Leer.dato();
					System.out.println("Indique su género: ");
					genero = Leer.dato();
					System.out.println("Indique el número de artistas que han hecho la canción");
					numeroArtistas = Leer.datoInt();
					do {
						System.out.println("Indique el nombre del artista: ");
						nombreArtista = Leer.dato();
						artistaCancion.add(new Artista(idArtista, nombreArtista, new ArrayList <Cancion>()));
						idArtista++;
						
						contador++;
					}while (contador < numeroArtistas);
					
					pl.agregarCancion(crearCancion, nombreCancion, genero, artistaCancion, nombreArtista, idCancion);
					idCancion++;
					break;
				case 2:
					pl.mostrarListaCanciones();
					break;
				case 3:
					pl.mostrarListaArtistas();
					break;
				case 0:
					break;
				default:
					System.out.println("Por favor elija una opción correcta");
					break;
			}
		}while (opcionMenu != 0);
		
		

	}
	
	public static void mostrarMenuPrincipal() {
		System.out.println("Pulse 1 para añadir canción a la lista");
		System.out.println("Pulse 2 para mostrar todas las canciones");
		System.out.println("Pulse 3 para mostrar todos los artistas");
		System.out.println("Pulse 0 para salir");
	}

}
