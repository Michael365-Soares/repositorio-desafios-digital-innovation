package br.com.dio.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {
		List<Gato> gatos=new LinkedList<>() {{
			add(new Gato("Jon",18,"preto"));
			add(new Gato("Simba",6,"tigrado"));
			add(new Gato("Jon",12,"amarelo"));
		}};
		//System.out.println(gatos);
		System.out.println("Exibindo pela ordem de inserção:");
		gatos.forEach(System.out::print);
		System.out.println("\n");
		System.out.println("Exidindo pela ordem aleatória:");
		Collections.shuffle(gatos);
		System.out.println(gatos);
		System.out.println("Ordem Natural de inserção(nome):");
		Collections.sort(gatos);
		System.out.println(gatos);
		System.out.println("Ordenando pela idade:");
		//Collections.sort(gatos,new ComparatorIdade());
		gatos.sort(new ComparatorIdade());
		System.out.println(gatos);
		System.out.println("Orndenando por cores:");
		gatos.sort(new ComparatorCor());
		System.out.println(gatos);
		System.out.println("Ordenando list por nome/cor/idade:");
		Collections.sort(gatos,new ComparatorFull());
		System.out.println(gatos);
	}
}

class ComparatorIdade implements Comparator<Gato>{
	public int compare(Gato g1,Gato g2) {
		return g1.getIdade()>g2.getIdade()?1:
			 g1.getIdade()<g2.getIdade()?-1:0;
	}
}

class ComparatorCor implements Comparator<Gato>{
	@Override
	public int compare(Gato o1, Gato o2) {
		return o1.getCor().compareToIgnoreCase(o2.getCor());
	}
}

class ComparatorFull implements Comparator<Gato>{
	@Override
	public int compare(Gato o1, Gato o2) {
		// TODO Auto-generated method stub
		int nome=o1.getNome().compareToIgnoreCase(o2.getNome());
		if(nome!=0) return nome;
		int cor=o1.getCor().compareToIgnoreCase(o2.getCor());
		if(cor!=0) return cor;
		return Integer.compare(o1.getIdade(),o2.getIdade());
	}
}