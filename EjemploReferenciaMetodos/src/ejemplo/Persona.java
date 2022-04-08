package ejemplo;

import java.time.LocalDate;

public class Persona {

	private int edad;
	private LocalDate FechaCumple;
	private String nombre;
	
	public Persona(int edad, LocalDate fechaCumple, String nombre) {
		super();
		this.edad = edad;
		FechaCumple = fechaCumple;
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public LocalDate getFechaCumple() {
		return FechaCumple;
	}

	public void setFechaCumple(LocalDate fechaCumple) {
		FechaCumple = fechaCumple;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	@Override
	public String toString() {
		return "Persona [edad=" + edad + ", FechaCumple=" + FechaCumple + ", nombre=" + nombre + "]";
	}

	public static int compararPorEdad (Persona a, Persona b) {
		return a.FechaCumple.compareTo(b.FechaCumple);
	}
	

	
	
	
}
