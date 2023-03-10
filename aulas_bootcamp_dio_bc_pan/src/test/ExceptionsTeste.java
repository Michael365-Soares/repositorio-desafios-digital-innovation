package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.dio.apache_maven.Conta;

public class ExceptionsTeste {
    @Test
    void validaCenarioDeExcecaoNaTransferencia() {
    	assertThrows(IllegalArgumentException.class,()->Conta.tranfere(new Conta(),new Conta(), 0));
    	/*Verifica se não irá lançar uma exception*/
    	//assertDoesNotThrow(()->Conta.tranfere(new Conta(),new Conta(),10));
    }
}
