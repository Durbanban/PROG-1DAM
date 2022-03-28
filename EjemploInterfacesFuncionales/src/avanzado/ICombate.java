package avanzado;

/*
 * Esta es la interfaz funcional ICombate. Sólo tiene un método abstracto. Nótese la etiqueta FunctionalInterface, necesaria para que el compilador
 * nos avise de que no estamos cumpliendo la regla de las interfaces funcionales.
 */

@FunctionalInterface

public interface ICombate {
	
	
	public abstract Luchador luchar (Luchador l1, Luchador l2);

}
