package br.com.dio.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionTypeSet {
    public static void main(String[] args) {
		 Set<Double> notas=new HashSet<>(Arrays.asList(7.0,8.5,9.3,5.0,7.0,0.0,3.6));
		 System.out.println(notas);
		 System.out.println("Exiba a posi��o da nota 5");
		 System.out.println(" /*A implementa��o a interface Set HashSet n�o possui m�todo espec�fico\r\n"
		 		+ "		  * para busca de elemento conforme a posi��o...*/");
		 /*A implementa��o a interface Set HashSet n�o possui m�todo espec�fico
		  * para busca de elemento conforme a posi��o...*/
		 System.out.println("Adicione na  lista a nota 8.0 na posi��o 4");
		 /*A implementa��o HashSet n�o possui ordem de inser��o....*/
		 System.out.println("Substitua a nota 5.0 pela nota 6.0");
		 /*HashSet n�o fornece a funcionalidade de substitui��o de um elemento por outro*/
		 System.out.println("Confira se a nota 5.0 est� no conjunto:"+notas.contains(5.0));
		 System.out.println("Exiba a terceira nota adicionada");
		 /*N�o h� funcionalidade no HashSet para esse tipo de opera��o....*/
		 System.out.println("Exiba a menor nota: "+Collections.min(notas));
		 System.out.println("Exiba a maior nota: "+Collections.max(notas));
		 System.out.println("Exiba a soma dos valores: "+notas.stream().reduce((n,ac)->ac+n).get());
		 System.out.println("Exiba a m�dia das notas: "+notas.stream().reduce((n,ac)->ac+n).map(n->n/notas.size()).get());
		 System.out.println("Remova a nota 0.0: "+notas.remove(0.0));
		 System.out.println("Remova as notas menores que sete:");
		 Iterator<Double> iterator=notas.iterator();
		 while(iterator.hasNext()) {
			 double nota=iterator.next();
			 if(nota<7.0) {
				 iterator.remove();
			 }
		 }
		 System.out.println(notas);
		 System.out.println("Imprima as notas na ordem de inser��o:");
		 Set<Double> notasOrdenadas=new LinkedHashSet<>();
		 notasOrdenadas.add(7.0);
		 notasOrdenadas.add(8.5);
		 notasOrdenadas.add(9.3);
		 notasOrdenadas.add(5.0);
		 notasOrdenadas.add(3.6);
		 notasOrdenadas.add(0.0);
		 System.out.println(notasOrdenadas);
		 System.out.println("Exiba todas as notas na ordem crescente:");
		 Set<Double> notasOrdemCrescente=new TreeSet<>(Arrays.asList(7.0,8.5,9.3,5.0,7.0,0.0,3.6));
		 System.out.println(notasOrdemCrescente);
		 System.out.println("Apague todo o conjunto:");
		 notas.clear();
		 System.out.println("Confira se o conjunto est� vazio: "+notas.isEmpty());
    }
}
