package br.dio.estrutura_de_dados.pilha;

public class No<T> {
    private T conteudo;
    private No<?> referenciaProximoNo=null;
    
	public No(T conteudo) {
		this.conteudo = conteudo;
	}
	
	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}
	
	public No<?> getNo(){
		return this.referenciaProximoNo;
	}
	
	public void setNo(No<?> noDeReferencia) {
		this.referenciaProximoNo=noDeReferencia;
	}

	@Override
	public String toString() {
		return "No conteúdo=" + conteudo;
	}
    
    
    
}
