package br.dio.estrutura_de_dados.no;

public class No {
     private String conteudo;
     private No no;
     
	public No(String conteudo) {
		this.no=null;
		this.conteudo = conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public No getProximoNo() {
		return no;
	}

	public void setNo(No no) {
		this.no = no;
	}

	@Override
	public String toString() {
		return "No conteudo: "+this.conteudo;
	}
	
	
     
     
}
