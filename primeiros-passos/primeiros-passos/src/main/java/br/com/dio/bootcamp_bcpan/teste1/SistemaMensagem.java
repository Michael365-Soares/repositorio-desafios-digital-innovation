package br.com.dio.bootcamp_bcpan.teste1;

import org.springframework.beans.factory.annotation.Autowired;

public class SistemaMensagem {
     @Autowired
     private Remetente noreply;
     @Autowired
     private Remetente techTeam;
     
     public void enviarConfirmacaoDeCadastro() {
    	 System.out.println(noreply);
    	 System.out.println("Seu cadastro foi aprovado...");
     }
     
     public void enviarMensagemBoasVindas() {
    	 techTeam.setEmail("tech@dio.com");
    	 System.out.println(techTeam);
    	 System.out.println("Bem-Vindo a TechElite...");
     }
     
}
