package br.dio.estrutura_de_dados.lista_dupla_encadeada;

public class TestaListaDuplamenteEncadeada {
     public static void main(String[] args) {
		NoDuplo<String> no1=new NoDuplo<String>("nó 1");
		NoDuplo<String> no2=new NoDuplo<String>("nó 2");
		NoDuplo<String> no3=new NoDuplo<String>("nó 3");
		NoDuplo<String> no4=new NoDuplo<String>("nó 4");
		NoDuplo<String> no5=new NoDuplo<String>("nó 5");
		NoDuplo<String> no6=new NoDuplo<String>("nó 6");
		
		ListaDuplamenteEncadeada<NoDuplo<String>> lista=new ListaDuplamenteEncadeada<NoDuplo<String>>();
		lista.add(no1);
		lista.add(no2);
		lista.add(no3);
		lista.add(no4);
		lista.add(no5);
		lista.add(no6);
		System.out.println(lista);		
		lista.remove(3);
		System.out.println(lista);		

	}
}