package br.dio.bootcamp.estrutura_de_dados.fila;

public class Fila<T>{
     No<?> referenciaDeNo;

	public Fila() {
		this.referenciaDeNo=null;
	}
     
    public void enqueue(No<?> no) {
      no.setReferenciaProximoNo(referenciaDeNo);
      this.referenciaDeNo=no;
    }
    
    public No<?> first(){
    	if(!isEmpty()) {
    		No<?> primeiroNo=this.referenciaDeNo;
    		while(true) {
    			if(primeiroNo.getReferenciaProximoNo()!=null) {
    				primeiroNo=primeiroNo.getReferenciaProximoNo();
    			}else {
    				break;
    			}
    		}
    		return primeiroNo;
    	}
    	return null;
    }
    
    public No<?> dequeue(){
    	if(!isEmpty()) {
    		No<?> primeiroNo=this.referenciaDeNo;
    		No<?> noAuxiliar=this.referenciaDeNo;
    		while(true) {
    			if(primeiroNo.getReferenciaProximoNo()!=null) {
    				noAuxiliar=primeiroNo;
    				primeiroNo=primeiroNo.getReferenciaProximoNo();
    			}else {
    				noAuxiliar.setReferenciaProximoNo(null);
    				break;
    			}
    		}
    		return primeiroNo;
    	}
    	return null;
    }
    
    public String toString() {
    	StringBuilder sb=new StringBuilder();
    	No<?> noAtual=referenciaDeNo;
    		if(this.referenciaDeNo!=null) {
    			while(true) {
    				sb.append("================\n");
    				sb.append(noAtual+"\n");
    				sb.append("================\n");
    				if(noAtual.getReferenciaProximoNo()!=null) {
    					noAtual=noAtual.getReferenciaProximoNo();
    				}else {
    					sb.append("null");
    					break;
    				}
    			}
    		}else {
    			sb.append("null");
    		}
    	return sb.toString();
    }
    
    public boolean isEmpty() {
    	return this.referenciaDeNo.getReferenciaProximoNo()==null?true:false;
    }
     
}
