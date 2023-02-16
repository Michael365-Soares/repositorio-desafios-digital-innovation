package br.dio.estrutura_de_dados.lista_dupla_encadeada;

public class TestaListaDuplamenteEncadeada {
     public static void main(String[] args) {
		NoDuplo<String> no1=new NoDuplo<String>("índice do nó 1");
		NoDuplo<String> no2=new NoDuplo<String>("índice do nó 2");
		NoDuplo<String> no3=new NoDuplo<String>("índice do nó 3");
		
		ListaDuplamenteEncadeada<NoDuplo<String>> lista=new ListaDuplamenteEncadeada<NoDuplo<String>>();
		lista.add(no1);
		lista.add(no2);
		
	}
}
