package ejercicio05;

import java.util.Objects;

public class Persona implements Comparable <Persona> {
	
	private int idPersona;
	private String nombre;
	private int edad;
	private String email;
	private int altura;
	private double peso;
	
	
	public Persona(int idPersona, String nombre, int edad, String email, int altura, double peso) {
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.edad = edad;
		this.email = email;
		this.altura = altura;
		this.peso = peso;
	}
	
	public int getIdPersona () {
		return idPersona;
	}
	
	public void setIdPersona (int idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getAltura() {
		return altura;
	}


	public void setAltura(int altura) {
		this.altura = altura;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}

	


	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + ", edad=" + edad + ", email=" + email
				+ ", altura=" + altura + ", peso=" + peso + "]";
	}

	


	@Override
	public int hashCode() {
		return Objects.hash(altura, edad, email, idPersona, nombre, peso);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return altura == other.altura && edad == other.edad && Objects.equals(email, other.email)
				&& idPersona == other.idPersona && Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(peso) == Double.doubleToLongBits(other.peso);
	}

	@Override
	public int compareTo(Persona p) {
		// TODO Auto-generated method stub
		return -(p.getNombre().compareTo(nombre));
	}

	
	
	
	

}
