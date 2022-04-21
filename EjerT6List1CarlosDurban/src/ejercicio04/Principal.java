package ejercicio04;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Random num = new Random(System.nanoTime());
		String aux;
		int a = 0, b = 0 , c = 0, x = 0, max = 999, min = -999;
		List<Ecuacion2G> lista = new ArrayList<Ecuacion2G>();
		System.out.println("Bienvenido al calculador de ecuaciones de segundo grado");
		Scanner sc = new Scanner(System.in);
		x = num.nextInt(max - min + 1) + min;
		System.out.println("Indique el primer término: ");
		aux = sc.nextLine();
		a = Integer.parseInt(aux);
		System.out.println("Indique el segundo término: ");
		aux = sc.nextLine();
		b = Integer.parseInt(aux);
		System.out.println("Indique el tercer término: ");
		aux = sc.nextLine();
		c = Integer.parseInt(aux);
		CrudEcuacion2G crudE2G = new CrudEcuacion2G(lista);
		Ecuacion2G e2g = new Ecuacion2G(a, b, c);
		crudE2G.agregarEcuacion(e2g);
		
		
		
	}

}
