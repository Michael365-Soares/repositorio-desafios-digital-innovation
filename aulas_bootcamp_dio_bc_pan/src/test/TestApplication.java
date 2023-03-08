package test;

import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.junit.jupiter.api.Test;

public class TestApplication{
   

   @Test
   public void test() {
	  Long anos=ChronoUnit.YEARS.between(LocalDate.of(1994,9,16),LocalDate.now());
	  System.out.println(anos);
	  boolean maiorDeIdade=anos>17?true:false;
	  assertTrue(maiorDeIdade);
   }
   
}
