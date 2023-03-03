package br.com.dio.collections.exercicios;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Exercicio04 {
    public static void main(String[] args) {
		System.out.println("Ordenando por ordem de inserção:");
		Set<LinguagemFavorita> cj1=new LinkedHashSet<>();
		cj1.add(new LinguagemFavorita("Java",1994,"Ecilpse"));
		cj1.add(new LinguagemFavorita("Js",2000,"Vs Code"));
		cj1.add(new LinguagemFavorita("Python",1500,"Vs Code"));
		System.out.println(cj1);
		
		System.out.println("Ordem Natural(Nome):");
		Set<LinguagemFavorita> cj2=new TreeSet<>(new ComparatorNome());
		cj2.addAll(cj1);
		System.out.println(cj2);
		
		System.out.println("Ordem Natural(IDE):");
		Set<LinguagemFavorita> cj3=new TreeSet<>(new ComparatorIde());
		cj3.addAll(cj2);
		System.out.println(cj3);
		
		System.out.println("Ordem Natural(NOME/ANO/IDE):");
		Set<LinguagemFavorita> cj4=new TreeSet<>(new ComparatorNomeAnoIde());
		cj4.addAll(cj3);
		System.out.println(cj4);
		
		System.out.println("Ordem Natural(ANO/NOME):");
		Set<LinguagemFavorita> cj5=new TreeSet<>(new ComparatorAnoNome());
		cj5.addAll(cj4);
		System.out.println(cj5);
		System.out.println("Exibindo:");
		cj5.forEach(System.out::println);
		
	}
}

class LinguagemFavorita{
	private String nome;
	private int anoDeCriacao;
	private String ide;
	
	public LinguagemFavorita(String nome, int anoDeCriacao, String ide) {
		this.nome = nome;
		this.anoDeCriacao = anoDeCriacao;
		this.ide = ide;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoDeCriacao() {
		return anoDeCriacao;
	}

	public void setAnoDeCriacao(int anoDeCriacao) {
		this.anoDeCriacao = anoDeCriacao;
	}

	public String getIde() {
		return ide;
	}

	public void setIde(String ide) {
		this.ide = ide;
	}

	@Override
	public int hashCode() {
		return Objects.hash(anoDeCriacao, ide, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LinguagemFavorita other = (LinguagemFavorita) obj;
		return anoDeCriacao == other.anoDeCriacao && Objects.equals(ide, other.ide) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "{nome=" + nome + ", anoDeCriacao=" + anoDeCriacao + ", ide=" + ide+"}";
	}	
}

class ComparatorNome implements Comparator<LinguagemFavorita>{
	@Override
	public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
		// TODO Auto-generated method stub
		return l1.getNome().compareToIgnoreCase(l2.getNome());
	}	
}

class ComparatorIde implements Comparator<LinguagemFavorita>{
	@Override
	public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
		// TODO Auto-generated method stub
		int ide= l1.getIde().compareToIgnoreCase(l2.getIde());
		if(ide!=0) return ide;
		return Integer.compare(l1.getAnoDeCriacao(),l2.getAnoDeCriacao());
	}	
}

class ComparatorNomeAnoIde implements Comparator<LinguagemFavorita>{
	@Override
	public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
		// TODO Auto-generated method stub
		int nome= l1.getNome().compareToIgnoreCase(l2.getNome());
		if(nome!=0) return nome;
		int ano= Integer.compare(l1.getAnoDeCriacao(),l2.getAnoDeCriacao());
		if(ano!=0) return ano;
		return l1.getIde().compareToIgnoreCase(l2.getIde());
	}	
}

class ComparatorAnoNome implements Comparator<LinguagemFavorita>{
	@Override
	public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
		// TODO Auto-generated method stub
		int ano= Integer.compare(l1.getAnoDeCriacao(),l2.getAnoDeCriacao());
		if(ano!=0) return ano;
		return l1.getNome().compareToIgnoreCase(l2.getNome());
	}	
}