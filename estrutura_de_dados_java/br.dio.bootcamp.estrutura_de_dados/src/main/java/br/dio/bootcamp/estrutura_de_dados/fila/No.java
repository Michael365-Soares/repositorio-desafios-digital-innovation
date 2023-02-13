package br.dio.bootcamp.estrutura_de_dados.fila;

public class No<T> {
    private T conteudo;
    private No<?> referenciaProximoNo;
    
	public No(T conteudo) {
		this.conteudo = conteudo;
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
