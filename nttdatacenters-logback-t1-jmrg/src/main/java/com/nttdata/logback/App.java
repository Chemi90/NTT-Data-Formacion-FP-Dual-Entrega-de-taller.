package com.nttdata.logback;

/**
 * Class Principal
 * 
 * @author JOSE MIGUEL
 *
 */
public class App {
	/**
	 * Method principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		GeneradorCodigoWindows95 cod1 = new GeneradorCodigoWindows95();
		System.out.println("Codigo de activación de Windows 95: " + cod1.concatenarTodo());
	}
}