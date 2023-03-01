package br.com.dio.collections;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {
		System.out.println("Ordem aleatória:");
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
		int nome=this.getNome().compareToIgnoreCase(serie.getNome());
		if(nome!=0) return nome;
		int genero=this.getGenero().compareToIgnoreCase(serie.getGenero());
		if(genero!=0) return genero;
		return Double.compare(this.getTempo(),serie.getTempo());
	}	
	
}
