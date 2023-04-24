package com.nttdata.mvn;

import org.apache.commons.lang3.RandomStringUtils;

public class Password {

	/*
	 * Metodo en el que creamos una secuencia de caracteres random para crear una
	 * contraseña segura.
	 * 
	 * @param i tamaño del String contado en caracteres
	 * 
	 * @return devolvemos todos los caracteres juntos en un String
	 */
	public String creationPass(int i) {

		String randomStr = RandomStringUtils.randomAlphanumeric(i);

		return randomStr;
	}

}