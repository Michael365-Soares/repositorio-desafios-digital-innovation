package testes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner {
   @Autowired
   private Calculadora cal;

	@Override
	public void run(String... args) throws Exception {
		cal=(n1,n2)->n1+n2;
		System.out.println("A soma é: "+cal.calcular(25, 55));
		cal=(n1,n2)->n1-n2;
		System.out.println("A subtração é: "+cal.calcular(55, 25));
		System.out.println("Olá Porra!!!");
	}
   
}
