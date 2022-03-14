package ejercicio06;

public class Trabajador implements Comparable <Trabajador> {
	
	private int idTrabajador;
	private String nombre;
	private String dni;
	private int horasTrabajadas;
	private double sueldoPorHora;
	
	
	public Trabajador(int idTrabajador, String nombre, String dni, int horasTrabajadas, double sueldoPorHora) {
		this.idTrabajador = idTrabajador;
		this.nombre = nombre;
		this.dni = dni;
		this.horasTrabajadas = horasTrabajadas;
		this.sueldoPorHora = sueldoPorHora;
	}
	
	
	public int getIdTrabajador() {
		return idTrabajador;
	}
	
	public void setIdTrabajador(int idTrabajador) {
		this.idTrabajador = idTrabajador;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}
	
	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	
	public double getSueldoPorHora() {
		return sueldoPorHora;
	}
	
	public void setSueldoPorHora(double sueldoPorHora) {
		this.sueldoPorHora = sueldoPorHora;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Trabajador [idTrabajador=" + idTrabajador + ", nombre=" + nombre + ", dni=" + dni + ", horasTrabajadas="
				+ horasTrabajadas + ", sueldoPorHora=" + sueldoPorHora + ", Sueldo Final -> " + calcularSueldo() + "]";
	}


	public double calcularSueldo () {
		return horasTrabajadas * sueldoPorHora;
	}


	@Override
	public int compareTo(Trabajador t) {
		// TODO Auto-generated method stub
		return -(t.getNombre().compareTo(nombre));
	}
	
	
	


	
	
	
	

}
