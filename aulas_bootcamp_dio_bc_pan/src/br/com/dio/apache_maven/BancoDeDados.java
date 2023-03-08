package br.com.dio.apache_maven;

import java.util.logging.Logger;

public class BancoDeDados {
    
	private static final Logger LOGGER=Logger.getLogger(BancoDeDados.class.getName());
	
	public static void iniciarBancoDeDados() {
		LOGGER.info("Inciou conexão");
	}
	
	public static void finalizarBancoDeDados() {
		LOGGER.info("Finalizou conexão");
	}
	
	public static void insereDados(Pessoa p) {
		LOGGER.info("Inseriu dados no BD...");
	}
	
	public static void removeDados(Pessoa p) {
		LOGGER.info("Removendo dados no BD...");
	}
	
}
