package com.nttdata.logback;

import java.util.Random;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

/**
 * 
 * @author JOSE MIGUEL
 *
 *         Clase para la creacion de un codigo generador de claves de windows 95
 */
public class GeneradorCodigoWindows95 {

	private static final Logger LOG = (Logger) LoggerFactory.getLogger(GeneradorCodigoWindows95.class);

	Random rand = new Random();

	/**
	 * metodo donde creamos un numero aleatorio del 1 al 366
	 * 
	 * @return the num
	 */
	private int numAleatorio1a366() {
		int num = rand.nextInt(366) + 1;
		if (LOG.isDebugEnabled())
			LOG.debug("Número: {}", num);
		return num;
	}

	/**
	 * metodo en el que se elige un numero referente al año del 95 al 03
	 * 
	 * @return the num
	 */
	private int numAleatorio95a03() {
		int[] numeros = { 95, 96, 97, 98, 99, 00, 01, 02, 03 };
		int alea = rand.nextInt(9);
		int num = numeros[alea];
		if (LOG.isDebugEnabled())
			LOG.debug("Número: {}", num);
		return num;
	}

	/**
	 * metodo para crear un numero aleatorio de 5 cifras y que sea la suma de varios
	 * numeros aleatorios y sea divisible entre 7
	 * 
	 * @return the num
	 */
	private int numSumadosDiv7() {
		boolean done = false;
		int num = 0;
		int aux = 0;
		while (!done) {
			num = rand.nextInt(99999);
			aux = aux + num;
			if (aux % 7 == 0 && aux <= 99999) {
				done = true;
			} else
				aux = 0;
		}
		if (LOG.isDebugEnabled())
			LOG.debug("Número: {}", aux);
		return aux;
	}

	/**
	 * metodo para hacer un numero aleatorio de 5 cifras
	 * 
	 * @return the num
	 */
	private int numAleatorio5() {
		int num = rand.nextInt(99999);
		if (LOG.isDebugEnabled())
			LOG.debug("Número: {}", num);
		return num;
	}

	/**
	 * metodo en el que todo se concatena de froma correcta
	 * 
	 * @return String
	 */
	public String concatenarTodo() {
		return String.format("%03d-%02d-OEM-00-%05d-%05d", numAleatorio1a366(), numAleatorio95a03(), numSumadosDiv7(),
				numAleatorio5());
	}

}
