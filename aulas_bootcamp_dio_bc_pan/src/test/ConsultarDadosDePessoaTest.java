package test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.dio.apache_maven.BancoDeDados;
import br.com.dio.apache_maven.Pessoa;

public class ConsultarDadosDePessoaTest {
    //Executa somente uma vez
	@BeforeAll
	static void configuraConexao() {
		BancoDeDados.iniciarBancoDeDados();
	}
	
	//Executa a cada chamada de teste
	@BeforeEach
	void insereDadosParaTeste() {
		BancoDeDados.insereDados(new Pessoa("Paulo",LocalDate.now()));
	}
	
	@Test
	void validarDadosDeRetorno() {
		assertTrue(true);
	}
	
	@Test
	void validarDadosDeRetorno2() {
		assertNull(null);
	}
	
	//Executa a cada chamada de teste
	@AfterEach
	void removeDadosDoTeste() {
		BancoDeDados.removeDados(new Pessoa("Paulo",LocalDate.now()));
	}
	
	//Executa somente uma vez
	@AfterAll
	static void finalizarConexao() {
		BancoDeDados.finalizarBancoDeDados();
	}
	
}
