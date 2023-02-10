package br.dio.estrutura_de_dados.pilha;

public class Pilha<T> {
    private No<?> noRefEntradaPilha;

	public Pilha() {
		this.noRefEntradaPilha=null;
	}
	
	/**
	 *@author Michael S;
	 *@since 10/02/2023
	 *<h1>Discrevendo a lógica por trás do método push de uma pilha</h1> 
	 *<p>
	 *   @param Not<T> no é responsável por receber o próximo elemento a ser adicionado a pilha
	 *   Not<T> referenciaNoAntigo é responsável por salvar a refência do nó atual antes da adição de um novo nó na pilha,
	 *   após essa etapa o nó atual de referência recebe como novo valor o nó atual adicionado, que por sua vez
	 *   irá apontar para referência do nó antigo....
	 *</p>
	 * */
	public void push(No<?> no) {
		No<?> refenciaNoAntigo=this.noRefEntradaPilha;//Salvando antiga refência de nó
		this.noRefEntradaPilha=no;//Atribuindo um novo nó ao topo da pilha
		this.noRefEntradaPilha.setNo(refenciaNoAntigo);//Setando a antiga refência de nó como referência de próximo nó para o nó atual da pilha
	}
	
	public No<?> pop() {
		if(!this.isEmpty()){
		   No<?> noPoped=this.noRefEntradaPilha;//Recupera o nó atual da pilha
		   this.noRefEntradaPilha=noRefEntradaPilha.getNo();//Pega a refência de próximo nó do nó atual e passa como referência ao novo
		   //nó atual da pilha
		   return noPoped;//Retorna a refência do antigo nó atual
		}
		return null;
	}
	
	public No<?> top(){
		return this.noRefEntradaPilha;
	}
	
	public boolean isEmpty() {
		return this.noRefEntradaPilha==null?true:false;
	}

	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		No<?> noAuxiliar=this.noRefEntradaPilha;
		while(true){
			if(noAuxiliar != null) {
				sb.append("Percorrenco os elementos da pilha:\n");
				sb.append(noAuxiliar+"\n");
				sb.append("====================================\n");
				noAuxiliar=noAuxiliar.getNo();
			}else {
				break;
			}
		}
		return sb.toString();
	}
	
	
	
}
