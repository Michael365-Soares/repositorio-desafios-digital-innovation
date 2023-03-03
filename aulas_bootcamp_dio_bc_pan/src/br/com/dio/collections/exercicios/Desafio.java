package br.com.dio.collections.exercicios;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Desafio {
    public static void main(String[] args) {
		Set<Integer> dados=new HashSet<>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<100;i++) {
			System.out.println("Digite um número inteiro qualquer:");
			int num=sc.nextInt();
			dados.add(num);
		}
		
		Map<Integer,String> dadosRepetidos=new HashMap<>();
		
		int x=0;
		for(Integer dado:dados) {
			dadosRepetidos.put(dado,"O valor: "+dado+" se repetiu "+x);
			x++;
		}
		dadosRepetidos.entrySet().forEach(System.out::println);
		sc.close();
	}
}
