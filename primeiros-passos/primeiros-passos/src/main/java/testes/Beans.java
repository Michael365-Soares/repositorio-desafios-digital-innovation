package testes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.gson.Gson;

import br.com.dio.bootcamp_bcpan.teste1.Remetente;
@Configuration
public class Beans {
	@Bean
	public Gson gson(){
		return new Gson();
    }
	
	
		/* @Scope("prototype") */
	@Bean
     public Remetente remetente() {
		  System.out.println("Criando um objeto remetente"); 
		  Remetente remetente=new Remetente(); 
		  remetente.setNome("Digital Innovation One");
		  remetente.setEmail("noreply@dio.com"); 
		  return remetente; 
	 }
	 
	
}
