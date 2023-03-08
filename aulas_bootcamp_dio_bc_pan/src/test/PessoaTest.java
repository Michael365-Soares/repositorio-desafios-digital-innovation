package test;

import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.com.dio.apache_maven.Pessoa;

public class PessoaTest{
	Pessoa p=null;
	@Before
	void pessoa(){
		p=new Pessoa("Michael S",LocalDate.of(1994, 9, 16));
	}

   @Test
   public void isMaiorDeIdade() {
	  Pessoa p=new Pessoa("Michael S",LocalDate.of(1994, 9, 16));
	  boolean valida=p.isMaiorDeIdade();
	  System.out.println(valida);
	  assertTrue(valida);
   }
   
   @Test
   public void getIdade() {
	   Pessoa p1=new Pessoa("Michael S",LocalDate.of(1994, 9, 16));
	   Assertions.assertEquals(28,p1.getIdade());
   }
   
}
