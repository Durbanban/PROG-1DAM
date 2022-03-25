package basico;


public class Principal {
	
	
	public static void hacerAlgoConLambda () {
		InterfazFuncional angel = (String s) -> "Hola soy Ángel y he hecho algo " + s;
		InterfazFuncional miguel = (s) -> "Hola soy Miguel y he hecho algo " + s;
		
		
		System.out.println(angel.hacerAlgo("regular"));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Durban durban = new Durban();
		Luismi luismi = new Luismi();
		Adrian adrian = new Adrian();
		Rafa rafa = new Rafa();
		String aux;
		String fraseAngel = "regular";
		HighOrder ho = new HighOrder();
		System.out.println(durban.hacerAlgo("malo"));
		
		hacerAlgoConLambda();
		ho.hacerAlgoFuncionHighOrder(durban);
		ho.hacerAlgoFuncionHighOrder(nombre -> "Hola soy Xopin y he hecho algo " + nombre);
		ho.hacerAlgoFuncionHighOrder(adrian::hacerAlgo);
		ho.hacerAlgoFuncionHighOrder(adrian::hacerAlgo2);
		ho.hacerAlgoFuncionHighOrder(rafa::corregirBoletin);
		ho.hacerAlgoFuncionHighOrder(rafa::corregirExamen);
		ho.hacerAlgoFuncionHighOrder(s -> "Hola soy Antonio y he hecho algo " + s);
		InterfazFuncional pedro = (s -> "Hola soy Pedro y he hecho algo " + s);
		System.out.println(pedro);
		ho.hacerAlgoFuncionHighOrder(pedro);
		
	}
	
	

}
