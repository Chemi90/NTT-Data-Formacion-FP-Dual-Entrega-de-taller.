package com.nttdata.mvn;

/**
 * Metodo main donde se llama al metodo Password.
 *
 *@Param args
 */
public class App {
	public static void main(String[] args) {

		
		//Inicializamos y creamos un objeto Password
		Password p1 = new Password();
		
		
		//Ponemos por pantalla el metodo creationPass
		System.out.println(p1.creationPass(10));
	}
}