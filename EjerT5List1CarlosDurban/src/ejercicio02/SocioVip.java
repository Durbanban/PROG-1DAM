package ejercicio02;

import java.util.List;

public class SocioVip extends Socio {
	
	private List <Pista> pistasAlquiladas;
	private double extraCuota;
		
	public SocioVip(int idSocio, String nombre, int edad, int numHijos, double cuota, List <Pista> pistasAlquiladas,
			double extraCuota) {
		super(idSocio, nombre, edad, numHijos, cuota);
		this.pistasAlquiladas = pistasAlquiladas;
		this.extraCuota = extraCuota;
	}
	


	public List<Pista> getPistasAlquiladas() {
		return pistasAlquiladas;
	}





	public void setPistasAlquiladas(List<Pista> pistasAlquiladas) {
		this.pistasAlquiladas = pistasAlquiladas;
	}





	public double getExtraCuota() {
		return extraCuota;
	}


	public void setExtraCuota(double extraCuota) {
		this.extraCuota = extraCuota;
	}


	@Override
	public String toString() {
		return super.toString() + "SocioVip [numPistas=" + pistasAlquiladas + ", extraCuota=" + extraCuota + "]";
	}
	
	public double calcularCuotaSocio (double descEdad, double descFamNum) {
		return super.calcularCuotaSocio(descEdad, descFamNum) + extraCuota + (pistasAlquiladas.size() * pistasAlquiladas.get(0).getPrecio());
	}
	
	
	
	
	
	
	

}
