package br.dio.bootcamp.estrutura_de_dados_passagem_por_referencia;

public class MeuObj {
    private int num;
    
	public MeuObj(int num) {
		super();
		this.num = num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "MeuObj valor: "+this.num;
	}
    
    
    
}
