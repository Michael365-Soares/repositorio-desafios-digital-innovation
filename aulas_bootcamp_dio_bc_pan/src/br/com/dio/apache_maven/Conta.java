package br.com.dio.apache_maven;

public class Conta {
	public static void tranfere(Conta contaOrigem,Conta contaDestino,int valor) {
		if(valor<=0) {
		   throw new IllegalArgumentException("Valor menor ou igual a 0...");
		}
	}
	
}
