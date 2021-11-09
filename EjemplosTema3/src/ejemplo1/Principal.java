package ejemplo1;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad = 0;
		String nombre, apellidos;
		double notaMedia = 0.0;
		Alumno a1 = new Alumno (30, "Carlos Jesús", "Durbán Viloca", 9.3);
		Alumno a2 = new Alumno (25, "Álvaro", "Franco Martínez", 9.2);
		Alumno aEditado;
		
		System.out.println("Introduzca la edad");
		edad = Leer.datoInt();
		System.out.println("Introduzca el nombre");
		nombre = Leer.dato();
		System.out.println("Introduzca los apellidos");
		apellidos = Leer.dato();
		System.out.println("Introduzca la nota media");
		notaMedia = Leer.datoDouble();
		aEditado = new Alumno (edad, nombre, apellidos, notaMedia);
		System.out.println("Mi edad es " + a1.edad);
		System.out.println("Mi nombre es " + a1.nombre);
		System.out.println("Mis apellidos son " + a1.apellidos);
		System.out.println("Mi nota media es " + a1.notaMedia);
		System.out.println("Mi edad es " + a2.edad);
		System.out.println("Mi nombre es " + a2.nombre);
		System.out.println("Mis apellidos son " + a2.apellidos);
		System.out.println("Mi nota media es " + a2.notaMedia);
		System.out.println("Mi edad es " + aEditado.edad);
		System.out.println("Mi nombre es " + aEditado.nombre);
		System.out.println("Mis apellidos son " + aEditado.apellidos);
		System.out.println("Mi nota media es " + aEditado.notaMedia);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(aEditado);
	}

}
