package br.dio.estrutura_de_dados.lista_dupla_encadeada;

public class ListaDuplamenteEncadeada<T> {
     private NoDuplo<T> inserirAoFinal;
     private NoDuplo<T> inserirAoInicio;
     private int tamanhoLista=0;
     
     public ListaDuplamenteEncadeada(){
    	 this.inserirAoFinal=null;
    	 this.inserirAoInicio=null;
     }
     
     public void add(T conteudo) {
    	 NoDuplo<T> novoNo=new NoDuplo<T>(conteudo);
    	 novoNo.setNoPosterior(null);
    	 novoNo.setNoAnterior(this.inserirAoFinal);
    	 if(this.inserirAoInicio==null) {
    		 this.inserirAoInicio=novoNo;
    	 }
    	 if(this.inserirAoFinal!=null) {
    		 this.inserirAoFinal.setNoPosterior(novoNo);
    	 }
    	 this.inserirAoFinal=novoNo;
    	 this.tamanhoLista++;
     }
     
     public T get(int index){
    	 return this.getNo(index).getConteudo();
     }
     
     private NoDuplo<T> getNo(int index){
    	 NoDuplo<T> noDeRetorno=inserirAoInicio;
    	 for(int i=0;(i<index)&&(noDeRetorno!=null);i++) {
    		 noDeRetorno=noDeRetorno.getNoPosterior();
    	 }
    	 return noDeRetorno;
     }
     
     public int size() {
    	 return this.tamanhoLista++;
     }
     
}
