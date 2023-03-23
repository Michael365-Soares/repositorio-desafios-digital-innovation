package br.com.dio.bootcamp_bcpan;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.dio.bootcamp_bcpan.teste1.SistemaMensagem;
import testes.ConversorJson;
import testes.ViaCepResponse;

@SpringBootApplication
public class PrimeirosPassosApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(PrimeirosPassosApplication.class, args);
	}
    
	@Bean
	public CommandLineRunner run(ConversorJson conversor,SistemaMensagem sistema) {
		return args->{
			/*
			 * String json=
			 * "{\"cep\":\"71593205\",\"logradouro\":\"Itapoã\",\"localidade\":\"Brasília\"}";
			 * ViaCepResponse resposta=conversor.converter(json);
			 * System.out.println("Dados do Cep: "+resposta);
			 */
			
			/*
			 * Calculadora cal; cal=(n1,n2)->n1+n2;
			 * System.out.println("A soma é: "+cal.calcular(25, 55)); cal=(n1,n2)->n1-n2;
			 * System.out.println("A subtração é: "+cal.calcular(55, 25));
			 * System.out.println("Olá Porra!!!");
			 */
			sistema.enviarConfirmacaoDeCadastro();
			sistema.enviarMensagemBoasVindas();
			sistema.enviarConfirmacaoDeCadastro();
		};
	}

	@Bean
	public ConversorJson conversor() {
		return new ConversorJson();
	}
	
	@Bean
	public ViaCepResponse viaCep() {
		return new ViaCepResponse();
	}
	
	@Bean
	public SistemaMensagem sistema() {
		return new SistemaMensagem();
	}
	
}
