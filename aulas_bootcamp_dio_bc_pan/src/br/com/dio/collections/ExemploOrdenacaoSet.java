package br.com.dio.collections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {
		System.out.println("Ordem aleatória:");
		@SuppressWarnings("serial")
		Set<Series> series=new HashSet<Series>() {{
			add(new Series("Got","Fantasia",60.00));
			add(new Series("Dark","Drama",60.00));
			add(new Series("That 70s Show","Comédia",25.00));
		}};
		System.out.println(series);
		
		System.out.println("Ordem de Inserção:");
		@SuppressWarnings("serial")
		Set<Series> series01=new LinkedHashSet<Series>() {{
			add(new Series("Got","Fantasia",60.00));
			add(new Series("Dark","Drama",60.00));
			add(new Series("That 70s Show","Comédia",25.00));
		}};
		System.out.println(series01);
		
		System.out.println("Ordem Natural (Tempo de episódio):");
		@SuppressWarnings("serial")
		Set<Series> series02=new TreeSet<Series>() {{
			add(new Series("Got","Fantasia",60.00));
			add(new Series("Dark","Drama",60.00));
			add(new Series("That 70s Show","Comédia",25.00));
		}};
		System.out.println(series02);
		
		System.out.println("Ordem Nome/Gênero/Tempo");
		Set<Series> series03=new TreeSet<>(new ComparatorNomeGeneroTempo());
		series03.addAll(series);
		System.out.println(series);
		
		System.out.println("Ordem por gênero:");
		Set<Series> series04=new TreeSet<>(new ComparatorGenero());
		series04.addAll(series01);
		System.out.println(series04);
		
		System.out.println("Ordem Tempo episódio:");
		Set<Series> series05=new TreeSet<>(new ComparatorTempo());
		series05.addAll(series01);
		System.out.println(series05);
		
	}
}

class Series implements Comparable<Series>{
	private String nome;
	private String genero;
	private double tempo;
	
	public Series(String nome, String genero, double tempo) {
		this.nome = nome;
		this.genero = genero;
		this.tempo = tempo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getTempo() {
		return tempo;
	}

	public void setTempo(double tempo) {
		this.tempo = tempo;
	}

	@Override
	public int compareTo(Series serie) {
		int tempo=Double.compare(this.getTempo(),serie.getTempo());
		if(tempo!=0) return tempo;
		return this.getGenero().compareToIgnoreCase(serie.getGenero());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(genero, nome, tempo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Series other = (Series) obj;
		return Objects.equals(genero, other.genero) && Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(tempo) == Double.doubleToLongBits(other.tempo);
	}

	@Override
	public String toString() {
		return "Series [nome=" + nome + ", genero=" + genero + ", tempo=" + tempo + "]";
	}	
	
	
}

class ComparatorNomeGeneroTempo implements Comparator<Series>{
	@Override
	public int compare(Series s1, Series s2) {
		int nome=s1.getNome().compareToIgnoreCase(s2.getNome());
		if(nome!=0) return nome;
		int genero=s1.getGenero().compareToIgnoreCase(s2.getGenero());
		if(genero!=0) return genero;
		return Double.compare(s1.getTempo(),s2.getTempo());
	}
	
}

class ComparatorGenero implements Comparator<Series>{
	@Override
	public int compare(Series s1, Series s2) {
		return s1.getGenero().compareToIgnoreCase(s2.getGenero());
	}
}

class ComparatorTempo implements Comparator<Series>{
	@Override
	public int compare(Series s1, Series s2) {
		return Double.compare(s1.getTempo(),s2.getTempo());
	}
}
