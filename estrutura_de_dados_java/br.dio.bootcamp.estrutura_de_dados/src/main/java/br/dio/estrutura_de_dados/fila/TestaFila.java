package br.dio.bootcamp.estrutura_de_dados.fila;

public class TestaFila {
	
	 public static void main(String[] args) {
		 No<String> no1=new No<String>("Conteúdo Nó 1");
		 No<String> no2=new No<String>("Conteúdo Nó 2");
		 No<String> no3=new No<String>("Conteúdo Nó 3");
		 No<String> no4=new No<String>("Conteúdo Nó 4");
		 No<String> no5=new No<String>("Conteúdo Nó 5");
		 No<String> no6=new No<String>("Conteúdo Nó 6");
		 Fila<String> fila=new Fila<String>();
		 fila.enqueue(no1);
		 fila.enqueue(no2);
		 fila.enqueue(no3);
		 fila.enqueue(no4);
		 fila.enqueue(no5);
		 fila.enqueue(no6);
		 System.out.println(fila.dequeue());
		 System.out.println("________________________________________________________________________");
		 System.out.println(fila);
		 System.out.println("________________________________________________________________________");
		 System.out.println(fila.first());
		 System.out.println("________________________________________________________________________");
		 System.out.println(fila);
	 }
	
}
