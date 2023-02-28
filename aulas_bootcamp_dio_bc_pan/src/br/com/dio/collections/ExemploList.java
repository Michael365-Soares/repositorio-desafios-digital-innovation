package br.com.dio.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class ExemploList {
    public static void main(String[] args) {
    	System.out.println("Criando uma List<Double> para add notas:");
		List<Double> notas=new ArrayList<>();
		notas.add(6.0);
		notas.add(8.9);
		notas.add(0.5);
		notas.add(8.3);
		notas.add(2.9);
		notas.add(9.0);
		notas.add(5.6);
		System.out.println(notas.size());
		System.out.println(notas);
		System.out.println("Posição da nota 5: "+notas.get(4));
		System.out.println("Nota 8.0 add posição 4: ");
		notas.add(4,8.0);
		notas.set(notas.indexOf(8.3),6.0);
		System.out.println(notas);
		System.out.println("Verificando se nota 5.0 existe na lista: "+notas.contains(5.0));
		System.out.println("Exibindo todas as notas:");
		notas.forEach(System.out::println);
		System.out.println("Exibindo a terceira nota: "+notas.get(2));
		System.out.println("Exibindo a menor nota: "+Collections.min(notas));
		System.out.println("Exibindo a maior nota: "+Collections.max(notas));
		System.out.println("Exibindo a soma de todas as nota: "+notas.stream().reduce((n,ac)->ac+=n).get());
		System.out.println("Removendo elemento 0 de notas: "+notas.remove(0));
		System.out.println("Removendo as notas menores do que 7.0 e exibindo a lista:");
		System.out.println("Exibindo a média de todas as notas: "+notas.stream().reduce((n,ac)->ac+=n).map(soma->soma/notas.size()).get());
		Stream<Double> filtroMaiorQueSete=notas.stream().filter(nota->nota>=7.0);
		List<Double> notasMaiorQueSete=filtroMaiorQueSete.toList();
		System.out.println(notasMaiorQueSete);
		System.out.println("Limpar toda lista:");
		//notas.clear();
		System.out.println(notas);
		LinkedList<Double> notas2=new LinkedList<>();
		notas2.add(6.0);
		notas2.add(8.9);
		notas2.add(0.5);
		notas2.add(8.3);
		notas2.add(2.9);
		notas2.add(9.0);
		notas2.add(5.6);
		System.out.println("Primeira nota da lista sem remove-lá:"+notas2.peek());
		System.out.println(notas2);
		System.out.println("Primeira nota da lista removendo-á:"+notas2.poll());
		System.out.println(notas2);
	}
}
