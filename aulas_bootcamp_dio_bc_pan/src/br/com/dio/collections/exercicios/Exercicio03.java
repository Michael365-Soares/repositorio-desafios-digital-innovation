package br.com.dio.collections.exercicios;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Exercicio03 {
    public static void main(String[] args) {
		Set<String> coresArcoIris=new TreeSet<>(Arrays.asList("vermelho","laranja","amarelo","verde","azul","azul-escuro","violeta"));
		System.out.println("Exibindo tiodas as cores:");
		coresArcoIris.forEach(System.out::println);
		System.out.println("Quantidade de cores do arco-íris:");
		System.out.println(coresArcoIris.stream().count());
		System.out.println("Exibindo as cores em ordem alfabética");
		Set<String> ordemAlfabetica=new TreeSet<>(new ComparatorOrdemAlfabetica());
		ordemAlfabetica.addAll(coresArcoIris);
		System.out.println(ordemAlfabetica);
		System.out.println("Exibindo na ordem inversa da que foi informada:");
		List<String> lista=new LinkedList<>();
		coresArcoIris.forEach(c->lista.add(c));
		System.out.println("Ordem de inserção normal:"+lista);
		Collections.reverse(lista);
		System.out.println("Ordem de inserção inversa:"+lista);
		System.out.println("Exibindo todas as cores que iniciam com a letra V:");
		coresArcoIris.stream().filter(c->c.charAt(0)=='v').forEach(c->System.out.print(c+"-"));
		System.out.println("\nRemovendo cores que não começam com a letra v:");
		lista.clear();
		coresArcoIris.stream().filter(c->c.charAt(0)!='v').forEach(c->lista.add(c));
		lista.forEach(c->coresArcoIris.remove(c));
		System.out.println(coresArcoIris);
		coresArcoIris.clear();
		System.out.println("Limpando o conjunto e conferindo se o mesmo está vazio:"+coresArcoIris.isEmpty());
	}
}

class ComparatorOrdemAlfabetica implements Comparator<String>{
	@Override
	public int compare(String s1, String s2) {
		return s1.compareToIgnoreCase(s2);
	}
	
}