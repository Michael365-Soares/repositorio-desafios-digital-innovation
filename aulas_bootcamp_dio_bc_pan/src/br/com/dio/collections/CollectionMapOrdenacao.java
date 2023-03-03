package br.com.dio.collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionMapOrdenacao {
    public static void main(String[] args) {
		@SuppressWarnings("serial")
		Map<String,Livros> livros=new HashMap<>() {{
			put("HawKing,Stephen",new Livros("Uma Breve História do Tempo,pág:256",256));
			put("Dukigg,Charles",new Livros("O Poder do Hábito,pág:408",408));
			put("Harari,Yuval Noah",new Livros("21 Lições para o Século 21,pág:432",432));
		}};
		System.out.println("Ordem aleatória:");
		livros.entrySet().forEach(l->System.out.print(l.getKey()+"--"+l.getValue()));
		System.out.println("\nOrdem de inserção:");
		
		@SuppressWarnings("serial")
		Map<String,Livros> livros1=new LinkedHashMap<>() {{
			put("HawKing,Stephen",new Livros("Uma Breve História do Tempo,pág:256",256));
			put("Dukigg,Charles",new Livros("O Poder do Hábito,pág:408",408));
			put("Harari,Yuval Noah",new Livros("21 Lições para o Século 21,pág:432",432));
		}};
		System.out.println(livros1);
		
		System.out.println("Ordem alfabética autores:");
		@SuppressWarnings("serial")
		Map<String,Livros> livros2=new TreeMap<>() {{
			put("HawKing,Stephen",new Livros("Uma Breve História do Tempo,pág:256",256));
			put("Dukigg,Charles",new Livros("O Poder do Hábito,pág:408",408));
			put("Harari,Yuval Noah",new Livros("21 Lições para o Século 21,pág:432",432));
		}};
		System.out.println(livros2);
		
		System.out.println("Ordem alfabética nome dos livros:");
		Set<Entry<String,Livros>> meusLivros=new TreeSet<>(new ComparatorNomeLivro());
		livros.entrySet().forEach(l->meusLivros.add(l));
		meusLivros.forEach(l->System.out.print(l.getKey()+"--"+l.getValue()));
		
		System.out.println("\nOrdem número de páginas:");
		Set<Entry<String,Livros>> meusLivros1=new TreeSet<>(new ComparatorNumeroPag());
		livros.entrySet().forEach(l->meusLivros1.add(l));
		meusLivros1.forEach(l->System.out.print(l.getKey()+"--"+l.getValue()));
		
	}
}

class Livros{
	private String nome;
	private int pag;
	
	public Livros(String nome, int pag) {
		this.nome = nome;
		this.pag = pag;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPag() {
		return pag;
	}

	public void setPag(int pag) {
		this.pag = pag;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, pag);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livros other = (Livros) obj;
		return Objects.equals(nome, other.nome) && pag == other.pag;
	}

	@Override
	public String toString() {
		return "[nome=" + nome + ", pag=" + pag + "]";
	}
	
}

class ComparatorNomeLivro implements Comparator<Entry<String,Livros>>{
	@Override
	public int compare(Entry<String, Livros> l1, Entry<String, Livros> l2) {
		return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
	}	
}	

class ComparatorNumeroPag implements Comparator<Entry<String,Livros>>{
	@Override
	public int compare(Entry<String, Livros> l1, Entry<String, Livros> l2) {
		return Integer.compare(l1.getValue().getPag(),l2.getValue().getPag());
	}	
}	