package br.dio.estrutura_de_dados.lista_dupla_encadeada;

public class NoDuplo<T> {
    private T conteudo;
    private NoDuplo<T> noAnterior;
    private NoDuplo<T> noPosterior;
    
    public NoDuplo() {}

	public NoDuplo(T conteudo) {
		this.conteudo = conteudo;
		this.noAnterior=null;
		this.noPosterior=null;
	}

	public NoDuplo<T> getNoAnterior() {
		return noAnterior;
	}

	public void setNoAnterior(NoDuplo<T> noAnterior) {
		this.noAnterior = noAnterior;
	}

	public NoDuplo<T> getNoPosterior() {
		return noPosterior;
	}

	public void setNoPosterior(NoDuplo<T> noPosterior) {
		this.noPosterior = noPosterior;
	}

	public T getConteudo() {
		return conteudo;
	}

	@Override
	public String toString() {
		return "NoDuplo [conteudo=" + conteudo + "]";
	}
	
}
