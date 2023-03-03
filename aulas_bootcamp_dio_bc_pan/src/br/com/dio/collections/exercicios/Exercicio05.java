package br.com.dio.collections.exercicios;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;

public class Exercicio05 {
     public static void main(String[] args) {
		@SuppressWarnings("serial")
		Map<String,Long> estados=new HashMap<>() {{
			put("PE",9616621L);
			put("AL",3351543L);
			put("CE",9187103L);
			put("RN",3534265L);
		}};
		
		System.out.println(estados);
		System.out.println("Substituindo população do RN por 3.534.165");
		estados.put("RN",3534165L);
		System.out.println(estados);
		
		System.out.println("Conferindo se o estado da PB existe no dicionário se não adicione-o:");
		boolean verifica=estados.containsKey("PB");
		if(verifica==false) estados.put("PB",4039277L);
		System.out.println(estados);
		
		System.out.println("Exibindo a população de PB: "+estados.get("PB").longValue());
		
		System.out.println("Exibindo estados e populações na ordem informada:");
		System.out.println(estados.entrySet());
		
		System.out.println("Exibindo os estados e sua populações em ordem alfabética:");
		Map<String,Long> ordemAlfabetica=new TreeMap<>(estados);
		System.out.println(ordemAlfabetica);
		
		System.out.println("Exibindo o estado com a menor população e sua quantidade:");
		Collection<Long> populacao=estados.values();
		Long menorPop=Collections.min(populacao);
		Optional<java.util.Map.Entry<String, Long>> estadoDeMenorPop=estados.entrySet().stream().filter(e->e.getValue()==menorPop).findFirst();
		System.out.println("Estado de menor população é: "+estadoDeMenorPop.get().getKey()+" com a populção de "+estadoDeMenorPop.get().getValue());
		
		System.out.println("Exibindo o estado com a maior população e sua quantidade:");
		populacao=estados.values();
		Long maiorPop=Collections.max(populacao);
		Optional<java.util.Map.Entry<String, Long>> estadoDeMaiorPop=estados.entrySet().stream().filter(e->e.getValue()==maiorPop).findFirst();
		System.out.println("Estado de maior população é: "+estadoDeMaiorPop.get().getKey()+" com a populção de "+estadoDeMaiorPop.get().getValue());
		
		Long somaPop=estados.values().stream().reduce((p,ac)->ac+=p).get();
		System.out.println("Exibindo a soma da população dos estados: "+somaPop);
		
		Long mediaPop=estados.values().stream().reduce((p,ac)->ac+=p).map(soma->soma/estados.size()).get();
		System.out.println("Exibindo a média da população dos estados: "+mediaPop);
		
		System.out.println("Removendo estados com população menor que 4.000.000:");
		Map<String,Long> estados02=new HashMap<>();
		estados.entrySet().stream().filter(e->e.getValue()<4000000L).forEach(e->estados02.put(e.getKey(),e.getValue()));
		estados02.keySet().stream().forEach(c->estados.remove(c));
		System.out.println(estados);
		System.out.println("Apagando o dicionário:");
		estados.clear();
		System.out.println("Conferindo se o dicionário está vazio: "+estados.isEmpty());
	 }
}

