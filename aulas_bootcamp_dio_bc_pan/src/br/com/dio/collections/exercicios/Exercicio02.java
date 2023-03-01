package br.com.dio.collections.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Exercicio02 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
		List<String> respostaInterrogatorio=new ArrayList<>();
		System.out.println("Telefonou para a vítima:");
		String resp1=sc.next();
		respostaInterrogatorio.add(resp1);
		System.out.println("Esteve no local do crime:");
		String resp2=sc.next();
		respostaInterrogatorio.add(resp2);
		System.out.println("Mora perto da vítima:");
		String resp3=sc.next();
		respostaInterrogatorio.add(resp3);
		System.out.println("Devia para a vítima");
		String resp4=sc.next();
		respostaInterrogatorio.add(resp4);
		System.out.println("Já trabalhou com a vítima:");
		String resp5=sc.next();
		respostaInterrogatorio.add(resp5);
		Stream<String> respPositivas=respostaInterrogatorio.stream().filter(r->r.equalsIgnoreCase("Sim"));
		int qtd=respPositivas.toList().size();
		if(qtd==2) {
			System.out.println("Suspeito");
		}else if(qtd==3||qtd==4){
			System.out.println("Cúmplice");
		}else if(qtd==5) {
			System.out.println("Assasino");
		}else {
			System.out.println("Inocente");
		}
		sc.close();
	}
}
