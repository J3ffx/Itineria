package fr.uha.ensisa.itineria;

import fr.uha.ensisa.itineria.interfaces.Console;
import fr.uha.ensisa.itineria.util.Constantes;
/**
 * 
 * @author weber
 *
 */
public abstract class Itineria {

	public static void main(String[] args) {
		
		int mode = Constantes.MODE_CONSOLE;
		//Indique la bonne interface et la lance dans un thread différent
		switch(mode)
		{
			default :
				Console console = new Console();
				console.start();
				break;
		}
		

	}

	

}
