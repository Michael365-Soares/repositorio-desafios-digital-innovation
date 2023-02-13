package br.dio.estrutura_de_dados.pilha;

public class TestePilha {
   public static void main(String[] args) {
	  Pilha<No<String>> pilha=new Pilha<No<String>>();
	  No<String> no1=new No<String>("Valor nó 1");
	  No<String> no2=new No<String>("Valor nó 2");
	  No<String> no3=new No<String>("Valor nó 3");
	  No<String> no4=new No<String>("Valor nó 4");
	  No<String> no5=new No<String>("Valor nó 5");
	  No<String> no6=new No<String>("Valor nó 6");
	  pilha.push(no1);
	  pilha.push(no2);
	  pilha.push(no3);
	  pilha.push(no4);
	  pilha.push(no5);
	  pilha.push(no6);
	  System.out.println("Valor do primeiro nó da pilha: "+pilha.top());
//	  System.out.println(pilha.pop());
//	  System.out.println(pilha.pop());
//	  System.out.println(pilha.pop());
//	  System.out.println(pilha.pop());
//	  System.out.println(pilha.pop());
//	  System.out.println(pilha.pop());
	  System.out.println(pilha.isEmpty());
	  System.out.println("========================");
	  System.out.println(pilha);
	  pilha.pop();
	  System.out.println("========================");
	  System.out.println(pilha);
	  
   }
}
