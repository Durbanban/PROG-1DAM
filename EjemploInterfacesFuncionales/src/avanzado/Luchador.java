package avanzado;

import java.util.Objects;

public class Luchador implements Comparable <Luchador>{
	
	private String idLuchador;
	private String nombre;
	private double puntosHP;
	private double puntosATK;
	private double puntosDEF;
	private double damage;
	
	
	public Luchador(String idLuchador, String nombre, double puntosHP, double puntosATK, double puntosDEF,
			double damage) {
		this.idLuchador = idLuchador;
		this.nombre = nombre;
		this.puntosHP = puntosHP;
		this.puntosATK = puntosATK;
		this.puntosDEF = puntosDEF;
		this.damage = damage;
	}


	public String getIdLuchador() {
		return idLuchador;
	}


	public void setIdLuchador(String idLuchador) {
		this.idLuchador = idLuchador;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPuntosHP() {
		return puntosHP;
	}


	public void setPuntosHP(double puntosHP) {
		this.puntosHP = puntosHP;
	}


	public double getPuntosATK() {
		return puntosATK;
	}


	public void setPuntosATK(double puntosATK) {
		this.puntosATK = puntosATK;
	}


	public double getPuntosDEF() {
		return puntosDEF;
	}


	public void setPuntosDEF(double puntosDEF) {
		this.puntosDEF = puntosDEF;
	}


	public double getDamage() {
		return damage;
	}


	public void setDamage(double damage) {
		this.damage = damage;
	}


	@Override
	public String toString() {
		return "Luchador [idLuchador=" + idLuchador + ", nombre=" + nombre + ", puntosHP=" + puntosHP + ", puntosATK="
				+ puntosATK + ", puntosDEF=" + puntosDEF + ", damage=" + damage + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(damage, idLuchador, nombre, puntosATK, puntosDEF, puntosHP);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Luchador other = (Luchador) obj;
		return Double.doubleToLongBits(damage) == Double.doubleToLongBits(other.damage)
				&& Objects.equals(idLuchador, other.idLuchador) && Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(puntosATK) == Double.doubleToLongBits(other.puntosATK)
				&& Double.doubleToLongBits(puntosDEF) == Double.doubleToLongBits(other.puntosDEF)
				&& Double.doubleToLongBits(puntosHP) == Double.doubleToLongBits(other.puntosHP);
	}


	@Override
	public int compareTo(Luchador l) {
		return (l.getNombre().compareTo(nombre));
		
	}


	
	
	
	

}
