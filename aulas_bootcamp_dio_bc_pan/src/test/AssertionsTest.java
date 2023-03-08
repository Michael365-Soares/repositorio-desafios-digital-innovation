package test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.dio.apache_maven.Pessoa;

public class AssertionsTest {
	
    @Test
    void validarLancamentos() {
    	int primeiroLancamento[]= {10,20,30,40,50};
    	int segundoLancamento[]= {10,20,30,40,50};
    	assertArrayEquals(primeiroLancamento, segundoLancamento);
    }
    
    @Test
    void validarSeObjetoEstaNulo() {
    	Pessoa p=null;
    	assertNull(p);
    	p=new Pessoa("Luciano",LocalDate.of(1994,9,16));
    	assertNotNull(p);
    }
    
    @Test
    void validarNumerosDeTipoDiferentes() {
    	assertNotEquals(1.6,1.0);
    	assertNotEquals(1L,15L);
    	assertNotEquals('x','Z');
    	assertNotEquals("mICHAEL","JOÃO");
    }
    
}
