package br.dio.estrutura_de_dados.lista_dupla_encadeada;

public class ListaDuplamenteEncadeada<T> {
     private NoDuplo<T> primeiroNo;
     private NoDuplo<T> ultimoNo;
     private int tamanhoLista=0;
     
     public ListaDuplamenteEncadeada(){
    	 this.primeiroNo=null;
    	 this.ultimoNo=null;
     }
     
     public void add(T conteudo) {
    	 NoDuplo<T> novoNo=new NoDuplo<T>(conteudo);
    	 novoNo.setNoPosterior(null);
    	 novoNo.setNoAnterior(this.ultimoNo);
    	 if(this.primeiroNo==null) {
    		 this.primeiroNo=novoNo;
    	 }
    	 if(this.ultimoNo!=null) {
    		 this.ultimoNo.setNoPosterior(novoNo);
    	 }
    	 this.ultimoNo=novoNo;
    	 this.tamanhoLista++;
     }
     
     public void add(int index, T elemento){
         NoDuplo<T> noAuxiliar = getNo(index);
         NoDuplo<T> novoNo = new NoDuplo<T>(elemento);
         novoNo.setNoPosterior(noAuxiliar);

         if(novoNo.getNoPosterior() != null){
             novoNo.setNoAnterior(noAuxiliar.getNoAnterior());
             novoNo.getNoPosterior().setNoAnterior(novoNo);
         }else {
             novoNo.setNoAnterior(ultimoNo);
             ultimoNo = novoNo;
         }
         if(index == 0){
             primeiroNo = novoNo;
         }else {
             novoNo.getNoAnterior().setNoPosterior(novoNo);
         }
         tamanhoLista++;
     }
     
     public T get(int index){
    	 return this.getNo(index).getConteudo();
     }
     
     private NoDuplo<T> getNo(int index){
    	 NoDuplo<T> noDeRetorno=primeiroNo;
    	 for(int i=0;(i<index)&&(noDeRetorno!=null);i++) {
    		 noDeRetorno=primeiroNo.getNoPosterior();
    	 }
    	 return noDeRetorno;
     }
     
     public int size() {
    	 return this.tamanhoLista;
     }
     
     public void remove(int index){
         if(index == 0){
             primeiroNo = primeiroNo.getNoPosterior();
             if(primeiroNo != null){
                 primeiroNo.setNoAnterior(null);
             }
         }else{
             NoDuplo<T> noAuxiliar = getNo(index);
             noAuxiliar.getNoAnterior().setNoPosterior(noAuxiliar.getNoPosterior());
             if(noAuxiliar != ultimoNo){
                 noAuxiliar.getNoPosterior().setNoAnterior(noAuxiliar.getNoAnterior());
             }else{
                 ultimoNo = noAuxiliar;
             }
         }
         tamanhoLista--;
     }
     
     public String toString() {
    	 StringBuilder sb=new StringBuilder();
    	 NoDuplo<T> oneNo=this.primeiroNo;
    	 for(int i=0;i<=(this.tamanhoLista)&&(primeiroNo!=null);i++) {
    		 sb.append(this.primeiroNo);
    		 this.primeiroNo=this.primeiroNo.getNoPosterior();
    	 }
    	 sb.append("null");
    	 this.primeiroNo=oneNo;
    	 return sb.toString();
     }
     
}
