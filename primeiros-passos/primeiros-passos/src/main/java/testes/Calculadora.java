package testes;

import org.springframework.stereotype.Component;

@Component
public interface Calculadora {
    
	public abstract int calcular(int n1,int n2);
	
	static double teste() {
		return 2.0;
	}
	
}
