package ejercicio04;

import java.util.Objects;

public class Ecuacion2G {
	
	private int a;
	private int b;
	private int c;
	
	
	public Ecuacion2G(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}


	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}


	public int getC() {
		return c;
	}


	public void setC(int c) {
		this.c = c;
	}


	@Override
	public String toString() {
		return "Ecuacion2G [a=" + a + ", b=" + b + ", c=" + c + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(a, b, c);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ecuacion2G other = (Ecuacion2G) obj;
		return a == other.a && b == other.b && c == other.c;
	}
	
	
	
	
}
