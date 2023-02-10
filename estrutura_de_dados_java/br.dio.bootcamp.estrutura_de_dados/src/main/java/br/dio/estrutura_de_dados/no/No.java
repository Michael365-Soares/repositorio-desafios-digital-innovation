package br.dio.estrutura_de_dados.no;

public class No<T> {
     private T conteudo;
     private No<T> elemento;
     
	public No(T conteudo) {
		this.elemento=null;
		this.conteudo = conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo =conteudo;
	}

	public No<T> getProximoNo() {
		return elemento;
	}

	public void setNo(No<T> no) {
		this.elemento = no;
	}

	@Override
	public String toString() {
		return "No conteudo: "+this.conteudo;
	}
	
	
     
     
}
