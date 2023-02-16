package br.dio.estrutura_de_dados.lista_encadeada;

public class TestaListaEncadeada {
	 public static void main(String[] args) {
		 No<String> no1=new No<String>("nó de índice 1",1);
		 No<String> no2=new No<String>("nó de índice 2",2);
		 No<String> no3=new No<String>("nó de índice 3",3);
		 No<String> no4=new No<String>("nó de índice 4",4);
		 No<String> no5=new No<String>("nó de índice 5",5);
		 No<String> no6=new No<String>("nó de índice 6",6);
		 No<String> no7=new No<String>("nó de índice 7",7);
		 No<String> no8=new No<String>("nó de índice 8",8);
		 No<String> no9=new No<String>("nó de índice 9",9);
		 ListaEncadeada<No<String>> lista=new ListaEncadeada<No<String>>();
		 System.out.println(lista.isEmpty());
		 lista.add(no1,0);
		 lista.add(no2,0);
		 lista.add(no3,0);
		 lista.add(no4,0);
		 lista.add(no5,0);
		 lista.add(no6,5);
		 lista.add(no7,5);
		 lista.add(no8,6);
		 lista.add(no9,1);
	     System.out.println(lista);
		 System.out.println(lista.size());
	     System.out.println(lista.get(7));
		 lista.remove(4);
		 lista.remove(5);
		 lista.remove(9);
		 System.out.println(lista);
		 System.out.println(lista.isEmpty());
	}
}
