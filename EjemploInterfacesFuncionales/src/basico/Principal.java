package basico;


public class Principal {
	
	
	public static void hacerAlgoConLambda () {
		InterfazFuncional angel = (String s) -> "Hola soy Ángel y he hecho algo " + s;
		InterfazFuncional miguel = (s) -> "Hola soy Miguel y he hecho algo " + s;
		
		
		System.out.println(angel.hacerAlgo("regular"));
	}
	
	public static void hacerAlgoFuncionHighOrder (InterfazFuncional comportamiento) {
		String res = comportamiento.hacerAlgo("funcional.");
		System.out.println(res);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Durban durban = new Durban();
		Luismi luismi = new Luismi ();
		Adrian adrian = new Adrian ();
		Rafa rafa = new Rafa ();
		String aux;
		String fraseAngel = "regular";
		System.out.println(durban.hacerAlgo("malo"));
		InterfazFuncional alvaro = new InterfazFuncional () {

			@Override
			public String hacerAlgo(String s) {
				// TODO Auto-generated method stub
				return "Hola soy Álvaro y he hecho algo " + s;
			}
			
		};
		
		System.out.println(alvaro.hacerAlgo("bueno"));
		hacerAlgoConLambda ();
		hacerAlgoFuncionHighOrder (alvaro);
		hacerAlgoFuncionHighOrder (durban);
		hacerAlgoFuncionHighOrder (nombre -> "Hola soy Xopin y he hecho algo " + nombre);
		hacerAlgoFuncionHighOrder (adrian::hacerAlgo2);
		hacerAlgoFuncionHighOrder (rafa::corregirBoletin);
		hacerAlgoFuncionHighOrder (rafa::corregirExamen);
		hacerAlgoFuncionHighOrder(s -> "Hola soy Antonio y he hecho algo " + s);
	}

}
