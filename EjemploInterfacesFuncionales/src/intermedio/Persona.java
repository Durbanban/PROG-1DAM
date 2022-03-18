package intermedio;

import java.util.function.BiFunction;

public class Persona implements Comparable <Persona> {
	
	private int idPersona;
	private String nombre;
	private String apellido;
	private String telefono;
	private int edad;
	private double altura;
	private double peso;
	private String domicilio;
	
	
	public Persona(int idPersona, String nombre, String apellido, String telefono, int edad, double altura, double peso, String domicilio) {
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
		this.domicilio = domicilio;
	}
	
	public int getIdPersona() {
		return idPersona;
	}
	
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public String getDomicilio() {
		return domicilio;
	}
	
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono="
				+ telefono + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + ", domicilio=" + domicilio
				+ "]";
	}

	@Override
	public int compareTo(Persona p) {
		return -(p.getApellido().compareTo(apellido));
	}
	
	public double calcularIMC () {
		double divisor = 100.0, alturaEnMetros = 0.0, dos = 2.0;
		alturaEnMetros = (altura / divisor);
		return (peso / Math.pow(alturaEnMetros, dos));
		
		
	}
	
	
	
	
	
	

}
