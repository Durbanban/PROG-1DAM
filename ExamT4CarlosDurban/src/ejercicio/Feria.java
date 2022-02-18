package ejercicio;

import java.util.Arrays;

public class Feria {
	
	private int anyioExpo;
	private Visitante [] listaVisitantes;
	
	
	public Feria(int anyioExpo, Visitante[] listaVisitantes) {
		this.anyioExpo = anyioExpo;
		this.listaVisitantes = listaVisitantes;
	}


	public int getAnyioExpo() {
		return anyioExpo;
	}


	public void setAnyioExpo(int anyioExpo) {
		this.anyioExpo = anyioExpo;
	}


	public Visitante[] getListaVisitantes() {
		return listaVisitantes;
	}


	public void setListaVisitantes(Visitante[] listaVisitantes) {
		this.listaVisitantes = listaVisitantes;
	}


	@Override
	public String toString() {
		return "Feria [anyioExpo=" + anyioExpo + ", listaVisitantes=" + Arrays.toString(listaVisitantes) + "]";
	}
	
	
	public double calcularPrecioEntradaUnVisitante (Visitante v, double descGen, double descEmp, double descFam) {
		return v.calcularPrecioEntrada(descGen, descEmp, descFam);
	}
	
	public double calcularPrecioVisitanteElegido (int posicion, double descGen, double descEmp, double descFam) {
		return calcularPrecioEntradaUnVisitante (listaVisitantes [posicion - 1], descGen, descEmp, descFam);
	}
	
	
	public double calcularTotalRecaudado (double descGen, double descEmp, double descFam) {
		double suma = 0.0;
		for (int i = 0; i < listaVisitantes.length; i++) {
			suma += calcularPrecioEntradaUnVisitante(listaVisitantes [i], descGen, descEmp, descFam);
		}
		return suma;
	}
	
	public double calcularRecaudadoFamiliares (double descGen, double descEmp, double descFam) {
		double suma = 0.0;
		for (int i = 0; i < listaVisitantes.length; i++) {
			if (listaVisitantes [i] instanceof Familiar) {
				suma += ((Familiar)listaVisitantes [i]).calcularPrecioEntrada(descGen, descEmp, descFam);
			}	
		}
		return suma;
	}
	
	
	
	public void mostrarListado () {
		for (int i = 0; i < listaVisitantes.length; i++) {
			if (listaVisitantes [i] instanceof Empresario) {
				System.out.println((i + 1) + ". " + ((Empresario)listaVisitantes [i]).toString() + " - " + 	((Empresario)listaVisitantes [i]).invitarCafe());
			}else {
				System.out.println((i + 1) + ". " + listaVisitantes [i].toString());
			}
		}
	}
	
	
	
	

}
