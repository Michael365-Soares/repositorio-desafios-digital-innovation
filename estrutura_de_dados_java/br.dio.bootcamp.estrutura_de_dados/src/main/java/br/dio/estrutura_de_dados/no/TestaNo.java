package br.dio.estrutura_de_dados.no;

public class TestaNo {
     public static void main(String[] args) {
		No<Integer> no1=new No<Integer>(10);
		No<Integer> no2=new No<Integer>(11);
		no1.setNo(no2);
		System.out.println(no1);
		System.out.println(no1.getProximoNo());
		System.out.println("============================");
		No<Integer> no3=new No<Integer>(12);
		no2.setNo(no3);
		No<Integer> no4=new No<Integer>(13);
		no3.setNo(no4);
		System.out.println(no1);
		System.out.println(no1.getProximoNo());
		System.out.println(no1.getProximoNo().getProximoNo());
		System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
		System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
	}
}
