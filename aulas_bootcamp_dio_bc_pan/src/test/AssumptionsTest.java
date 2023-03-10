package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class AssumptionsTest{ 
	
   @Test
   void testaSeUsuarioForMicha(){
	   Assumptions.assumeTrue("root".equals(System.getenv("micha")));
	   assertEquals(10,5+5);
   }
   
   //Condicionais
   @Test
   @DisabledIfEnvironmentVariable(named="user",matches="micha")
   @EnabledOnOs(value = {OS.WINDOWS})
   @EnabledForJreRange(min=JRE.JAVA_12,max=JRE.JAVA_17)
   void testaSeUsuarioForMicha2(){
	   assertEquals(10,5+5);
   }
   
   
}
