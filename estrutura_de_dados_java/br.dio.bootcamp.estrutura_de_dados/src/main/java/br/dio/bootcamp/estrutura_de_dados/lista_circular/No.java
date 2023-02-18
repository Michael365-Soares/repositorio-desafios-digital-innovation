package br.dio.bootcamp.estrutura_de_dados.lista_circular;

public class No<T> {
    private T conteudo;
    private No<T> noProximo;
    
	public No(T conteudo) {
		this.noProximo=null;
		this.conteudo = conteudo;
	}

	public No<T> getNoProximo() {
		return noProximo;
	}

	public void setNoProximo(No<T> noProximo) {
		this.noProximo = noProximo;
	}

	public T getConteudo() {
		return conteudo;
	}

	@Override
	public String toString() {
		return "conteudo="+conteudo;
	}
    
    
    
}
