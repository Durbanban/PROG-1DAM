package ejercicio01Corregido;

import java.util.Arrays;
import java.util.Random;

public class Inmobiliaria {
	
	private int idOficina;
	private Piso piso;
	private int [] listaPrecios;
	
	
	public Inmobiliaria(int idOficina, Piso piso, int[] listaPrecios) {
		this.idOficina = idOficina;
		this.piso = piso;
		this.listaPrecios = listaPrecios;
	}


	public int getIdOficina() {
		return idOficina;
	}


	public void setIdOficina(int idOficina) {
		this.idOficina = idOficina;
	}


	public Piso getPiso() {
		return piso;
	}


	public void setPiso(Piso piso) {
		this.piso = piso;
	}


	public int[] getListaPrecios() {
		return listaPrecios;
	}


	public void setListaPrecios(int[] listaPrecios) {
		this.listaPrecios = listaPrecios;
	}


	@Override
	public String toString() {
		return "Inmobiliaria [idOficina=" + idOficina + ", piso=" + piso + ", listaPrecios="
				+ Arrays.toString(listaPrecios) + "]";
	}
	
	
	
	public int generarAleatorio (int desde, int hasta) {
		int precio;
		Random num = new Random (System.nanoTime());
		precio = num.nextInt (hasta - desde + 1 + desde);
		return precio;
	}
	
	public int [] rellenarListadoPrecio (int desde, int hasta) {
		for (int i = 0; i < listaPrecios.length; i++) {
			listaPrecios[i] = generarAleatorio (desde, hasta);
		}
		return listaPrecios;
	}
	
	public int calcularPrecioVenta (int i, int ganancia) {
		int precioVenta, porc = 100;
		precioVenta = listaPrecios [i - 1] + (listaPrecios [i - 1] * ganancia / porc);
		//piso.setPrecioVenta(precioVenta); NO HACE FALTA, EL ENUNCIADO NO LO PIDE
		return precioVenta;	
	}
	
	
}
