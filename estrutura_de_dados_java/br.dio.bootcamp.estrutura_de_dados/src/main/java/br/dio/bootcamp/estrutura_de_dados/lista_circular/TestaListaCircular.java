package br.dio.bootcamp.estrutura_de_dados.lista_circular;

public class TestaListaCircular {
     public static void main(String[] args) {
		  ListaCircular<String> lista=new ListaCircular<String>();
		  lista.add("Nó 1");
		  lista.add("Nó 2");
		  lista.add("Nó 3");
		  lista.add("Nó 4");
		  lista.add("Nó 5");
		  lista.add("Nó 6");
		  System.out.println(lista);
		  lista.remove(2);
		  System.out.println(lista);
		 for(int i=0;i<20;i++) {
			 System.out.println(lista.get(i));
		 }
	 }
}
