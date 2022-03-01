package ejercicio02;

public class Socio implements ICuota{
	
	private int idSocio;
	private String nombre;
	private int edad;
	private int numHijos;
	private double cuota;
	
	
	public Socio(int idSocio, String nombre, int edad, int numHijos, double cuota) {
		this.idSocio = idSocio;
		this.nombre = nombre;
		this.edad = edad;
		this.numHijos = numHijos;
		this.cuota = cuota;
	}


	public int getIdSocio() {
		return idSocio;
	}


	public void setIdSocio(int idSocio) {
		this.idSocio = idSocio;
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


	public int getNumHijos() {
		return numHijos;
	}


	public void setNumHijos(int numHijos) {
		this.numHijos = numHijos;
	}


	public double getCuota() {
		return cuota;
	}


	public void setCuota(double cuota) {
		this.cuota = cuota;
	}


	@Override
	public String toString() {
		return "Socio [idSocio=" + idSocio + ", nombre=" + nombre + ", edad=" + edad + ", numHijos=" + numHijos
				+ ", cuota=" + cuota + "]";
	}
	
	public double calcularCuotaSocio (double descEdad, double descFamNum) {
		double divisor = 100.0;
		int topeHijos = 3;
		if (edad >= 65 && numHijos >= topeHijos) {
			return cuota - ((cuota * (descEdad / divisor)) + (cuota * (descFamNum / divisor)));
		}else if (edad >= 65) {
			return cuota - (cuota * (descEdad / divisor));
		}else if (numHijos >= topeHijos) {
			return cuota - (cuota * (descFamNum / divisor));
		}else {
			return cuota;
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		Socio auxiliar;
		if (obj instanceof Socio) {
			auxiliar = ((Socio)obj);
			if (auxiliar.getIdSocio() == idSocio 
				&& auxiliar.getNombre().equalsIgnoreCase(nombre)) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	
	
	
	
	

}
