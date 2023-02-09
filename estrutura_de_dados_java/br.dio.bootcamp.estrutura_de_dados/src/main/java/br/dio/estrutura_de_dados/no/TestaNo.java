package br.dio.estrutura_de_dados.no;

public class TestaNo {
     public static void main(String[] args) {
		No no1=new No("Conteudo no1");
		No no2=new No("Conteudo no2");
		no1.setNo(no2);
		System.out.println(no1);
		System.out.println(no1.getProximoNo());
		System.out.println("============================");
		No no3=new No("Conteudo no3");
		no2.setNo(no3);
		No no4=new No("Conteudo no4");
		no3.setNo(no4);
		System.out.println(no1);
		System.out.println(no1.getProximoNo());
		System.out.println(no1.getProximoNo().getProximoNo());
		System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
		System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
	}
}
