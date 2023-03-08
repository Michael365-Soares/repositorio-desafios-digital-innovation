package br.com.dio.exception;

public class ExceptionCustomizada_2 {
    public static void main(String[] args) {
		int[] numerador={4,5,8,10};
		int denominador[]= {2,4,0,2,8};
		
		for(int i=0;i<denominador.length;i++) {
			if(denominador[i]<numerador[i]) {
				throw new DivisaoNaoExataException(numerador[i],denominador[i]);
			}
			int resultado=numerador[i]/denominador[i];
			System.out.println(resultado);
		}
		System.out.println("Continua a execução....");
	}
    
}

class DivisaoNaoExataException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	private int numerador;
	private int denominador;
	
	public DivisaoNaoExataException(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}

	@Override
	public String toString() {
		return "DivisaoNaoExataException numerador:" + numerador + ", denominador:" + denominador + " não resulta em um valor exato";
	}
	
}
