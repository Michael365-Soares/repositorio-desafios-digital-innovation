package br.dio.estrutura_de_dados.lista_encadeada;

public class No<T> {
    private T conteudo;
    private No<?> referenciaProximoNo;
    private int indice=0;
    
	public No(T conteudo,int indice) {
		this.conteudo = conteudo;
		this.indice=indice;
	}
	
	public int getIndice() {
		return indice;
	}

	public No() {

	}

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public No<?> getReferenciaProximoNo() {
		return referenciaProximoNo;
	}

	public void setReferenciaProximoNo(No<?> referenciaProximoNo) {
		this.referenciaProximoNo = referenciaProximoNo;
	}

	@Override
	public String toString() {
		return "No conteudo="+ conteudo;
	}
    
    
    
}
