package br.dio.bootcamp.estrutura_de_dados_passagem_por_referencia;

public class PassagemDeValoresPorReferencia {
    public static void main( String[] args ){
    	//Passagem de valor por referência com valores primitivos
        int a=5, b=a;
        System.out.println("Valor A: "+a+" Valor de B: "+b);
        
        a=10;
        System.out.println("Valor A: "+a+" Valor de B: "+b);
        System.out.println("================================================");
        //Passagem por referência por entre objetos
        MeuObj obj1=new MeuObj(10);
        MeuObj obj2=obj1;
        System.out.println("Valor Obj1: "+obj1.toString()+" Valor de Obj2: "+obj2.toString());
        
        obj2.setNum(55);
        System.out.println("Valor Obj1: "+obj1.toString()+" Valor de Obj2: "+obj2.toString());
    }
}
