package br.com.dio.apache_maven;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
	 private String nome;
	 private LocalDate idade;
     
	public Pessoa(String nome, LocalDate data) {
		this.nome = nome;
		this.idade =data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getIdade() {
		return ChronoUnit.YEARS.between(this.idade,LocalDate.now());
	}

	public void setIdade(LocalDate data) {
		this.idade =data;
	}
     
    public boolean isMaiorDeIdade() {
    	Long idade=ChronoUnit.YEARS.between(this.idade,LocalDate.now());
    	return idade>=18?true:false;
    }  
     
}
