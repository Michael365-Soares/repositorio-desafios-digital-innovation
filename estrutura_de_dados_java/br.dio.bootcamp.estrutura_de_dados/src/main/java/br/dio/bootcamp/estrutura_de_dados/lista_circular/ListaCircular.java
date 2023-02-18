package br.dio.bootcamp.estrutura_de_dados.lista_circular;

public class ListaCircular<T>{
    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;
    
    public ListaCircular() {
    	this.cabeca=null;
    	this.cauda=null;
    	this.tamanhoLista=0;
    }
    
    public void add(T elemento) {
    	No<T> novoNo=new No<T>(elemento);
    	if(this.isEmpty()) {
    		this.cabeca=novoNo;
    		this.cauda=this.cabeca;
    		this.cabeca.setNoProximo(cauda);
    	}else {
    		novoNo.setNoProximo(this.cauda);
    		this.cabeca.setNoProximo(novoNo);
    		this.cauda=novoNo;
    	}
    	this.tamanhoLista++;
    	
    }
    
    public void remove(int index) {
    	if(index>=this.tamanhoLista)
    		throw new IndexOutOfBoundsException("índice maior que o tamanho da lista.");
    	No<T> noAuxiliar=this.cauda;
    	if(index==0) {
    		this.cauda=this.cauda.getNoProximo();
    		this.cabeca.setNoProximo(cauda);
    	}else if(index==1) {
    		this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo());
    	}else {
    		for(int i=0;i<index-1;i++) {
    			noAuxiliar=noAuxiliar.getNoProximo();
    		}
    		noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
    	}
    	this.tamanhoLista--;
    }
    
    public T get(int index) {
    	return this.getNo(index).getConteudo();
    }
    
    private No<T> getNo(int index){
    	if(this.isEmpty()) 
    		throw new IndexOutOfBoundsException("A lista está vazia");
    	if(index==0) {
    		return this.cauda;
    	}
    	No<T> noAuxiliar=this.cauda;
    	for(int i=0;(i<index)&&(noAuxiliar!=null);i++){
    		noAuxiliar=noAuxiliar.getNoProximo();
    	}
    	return noAuxiliar;
    }
    
    public boolean isEmpty() {
    	return this.tamanhoLista==0?true:false;
    }
    
    public int size() {
    	return this.tamanhoLista;
    }
    
    public String toString() {
    	StringBuilder sb=new StringBuilder();
    	No<T> noAuxiliar=this.cauda;
    	for(int i=0;i<this.tamanhoLista;i++) {
    		sb.append(noAuxiliar+"=>");
    		noAuxiliar=noAuxiliar.getNoProximo();	
    	}
    	String fim=this.size()!=0?"Retorna ao início":"[]";
    	sb.append(fim);
    	return sb.toString();
    }
    
}
