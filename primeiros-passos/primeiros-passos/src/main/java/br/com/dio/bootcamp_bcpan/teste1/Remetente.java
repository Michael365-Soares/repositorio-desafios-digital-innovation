package br.com.dio.bootcamp_bcpan.teste1;

import org.springframework.stereotype.Component;

@Component
public class Remetente {
    private String nome;
    private String email;
    
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Remetente [nome=" + nome + ", email=" + email + "]";
	}
    
}
