package test;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class OrdenandoOrdemDeTestes {
	
    @Test   
	void validaFluxoA() {
    	assertTrue(true);
    }
	
    @Test   
   	void validaFluxoB() {
    	assertTrue(true);
    }
	
    @Test   
   	void validaFluxoC() {
    	assertTrue(true);
    }
	
    @Test   
   	void validaFluxoD() {
    	assertTrue(true);
    }
	
}
