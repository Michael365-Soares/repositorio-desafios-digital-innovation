package br.dio.bootcamp.estrutura_de_dados.arvore;

public class BinNo<T extends Comparable<T>>{
    T conteudo;
    BinNo<T> noEsq;
    BinNo<T> noDir;
    
	public BinNo(T conteudo) {
		this.conteudo = conteudo;
		this.noEsq =this.noDir =null;
	}
	
	
    
    public BinNo<T> getNoEsq() {
		return noEsq;
	}



	public void setNoEsq(BinNo<T> noEsq) {
		this.noEsq = noEsq;
	}



	public BinNo<T> getNoDir() {
		return noDir;
	}



	public void setNoDir(BinNo<T> noDir) {
		this.noDir = noDir;
	}



	public T getConteudo() {
		return conteudo;
	}

	@Override
	public String toString() {
		return "BinNo [conteudo=" + conteudo + "]";
	}
	
	
    
}
