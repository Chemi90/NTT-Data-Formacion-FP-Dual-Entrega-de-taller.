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

		Windows95GeneratorPass cod1 = new Windows95GeneratorPass();
		System.out.println("Codigo de activación de Windows 95: " + cod1.concatAll());
	}
}