package utilidades;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leer{
	
	static String [] commands;
	static int commandIndex = 0;
	static boolean automode = false;
	
	public static void enterAutomode() {
		Leer.automode = true;
	}
	
	public static void setCommands(String[] commands) {
		Leer.commands = commands;
	}
	
	public static String dato() {
		if(automode && commandIndex < commands.length) {
			String dato = commands[commandIndex++];
			System.out.println(dato);
			return dato;
		}
		
	  String sdato=" ";
	  try{
	  	 InputStreamReader isr=new InputStreamReader(System.in);
	  	 BufferedReader flujoE = new BufferedReader(isr);
	  	 sdato=flujoE.readLine();
	  	 }
	  catch (IOException e)
	  	{
	  	System.out.println("Error "+e.getMessage());
	  	}
	  return sdato;
	  
	  }
	
	 public static int datoInt()
	  {
	  return Integer.parseInt(dato());
	  }
	  
	
	 public static float datoFloat()
	  {
	  return Float.parseFloat(dato());	
	  }
	//Leer un char por teclado
	
	public static char datoChar( ){
		char c = ' ';
			try {
				java.io.BufferedInputStream b = new BufferedInputStream(System.in);
				 c = (char) b.read();
			} catch (IOException e) {
				System.out.println("Error al leer");
				e.printStackTrace();
			}
		return c;
		}
	  
	 public static long datoLong()
	  {
	  return Long.parseLong(dato());
	  }
	 
	 public static short datoShort()
	  {
	  return Short.parseShort(dato());	
	  }
	 
	 public static double datoDouble()
	  {
	  return Double.parseDouble(dato());	
	  }
  
}