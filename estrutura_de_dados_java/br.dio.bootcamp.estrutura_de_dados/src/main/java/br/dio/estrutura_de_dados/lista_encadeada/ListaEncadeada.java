package br.dio.estrutura_de_dados.lista_encadeada;

public class ListaEncadeada<T>{
     private No<?> noRefEntra;
     private int size;
     public ListaEncadeada(){
    	 this.noRefEntra=null;
     }
     
     public void add(No<?> novoNo,int indiceInsercao) {
    	 size++;
    	 No<?> noRefAnt;
    	 if(this.noRefEntra==null||indiceInsercao==0) {
    		 novoNo.setReferenciaProximoNo(noRefEntra);
    		 this.noRefEntra=novoNo;
    	 }else { 
    		noRefAnt=this.noRefEntra;
    		while(true) {
				 if(this.noRefEntra.getIndice()==indiceInsercao) {
					 No<?> noRefPost=this.noRefEntra.getReferenciaProximoNo()!=null?this.noRefEntra.getReferenciaProximoNo():null;
					 this.noRefEntra.setReferenciaProximoNo(novoNo);
					 novoNo.setReferenciaProximoNo(noRefPost);
					 this.noRefEntra=noRefAnt;
					 break;
				 }else {
					 if(this.noRefEntra.getReferenciaProximoNo()==null&&this.noRefEntra.getIndice()==indiceInsercao) {
						 novoNo.setReferenciaProximoNo(noRefEntra);
			    		 this.noRefEntra=novoNo;
						 break;
					 }else {
						 this.noRefEntra=this.noRefEntra.getReferenciaProximoNo();
					 }
				 }
    		}
    	 }
     }
     
     public String toString() {
    	 StringBuilder sb=new StringBuilder();
    	 No<?> refAnt=this.noRefEntra;
    	 while(true) {
    		 sb.append(this.noRefEntra.getConteudo()+">>>>");
    		 this.noRefEntra=this.noRefEntra.getReferenciaProximoNo();
    		 if(this.noRefEntra==null){
    			 this.noRefEntra=refAnt;
    			 break;
    		 }
    	 }
    	 return sb.toString();
     }
     
     public int size() {
    	 return size;
     }
      
     public No<?> get(int indice){
    	 No<?> noBuscado=this.noRefEntra;//valor padrão
    	 No<?> noRefAtual=this.noRefEntra;
    	 while(true) {
    		 if(this.noRefEntra.getIndice()==indice) {
			   noBuscado=this.noRefEntra.getReferenciaProximoNo();
			   break;
    		 }
			 if(this.noRefEntra==null){
				 break;
		     }
			 this.noRefEntra=this.noRefEntra.getReferenciaProximoNo();
    	 }
    	 this.noRefEntra=noRefAtual;
    	 return noBuscado;
     }
     
     public void remove(int indice) {
    	 No<?> noAnterior=null;
    	 No<?> noRefAtual=this.noRefEntra;
    	 while(true) {
    		 if(this.noRefEntra.getIndice()==indice) {
			   No<?> noPosterior=this.noRefEntra.getReferenciaProximoNo();
			   if(noAnterior!=null) {				   
				   noAnterior.setReferenciaProximoNo(noPosterior);
				   this.noRefEntra=noRefAtual;
			   }else {
				   this.noRefEntra=noPosterior;
			   }
			   break;
    		 }
			 if(this.noRefEntra==null){
				 break;
		     }
			 if(noRefAtual.getIndice()!=indice) {				 
				 noAnterior=this.noRefEntra;
			 }
			 this.noRefEntra=this.noRefEntra.getReferenciaProximoNo();
    	 }
     }
     
     public boolean isEmpty() {
    	 return this.noRefEntra==null?true:false;
     }
     
}
