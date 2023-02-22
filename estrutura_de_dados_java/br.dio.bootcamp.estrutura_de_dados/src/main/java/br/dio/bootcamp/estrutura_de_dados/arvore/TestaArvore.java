package br.dio.bootcamp.estrutura_de_dados.arvore;

import br.dio.bootcamp.estrutura_de_dados.arvore.model.Obj;

public class TestaArvore {
     public static void main(String[] args) {
		ArvoreBinaria<Obj> arvore=new ArvoreBinaria<Obj>();
		Obj ob1=new Obj(13);
		Obj ob2=new Obj(10);
		Obj ob3=new Obj(25);
		Obj ob4=new Obj(12);
		Obj ob5=new Obj(20);
		Obj ob6=new Obj(31);
		Obj ob7=new Obj(29);
		arvore.inserir(ob1);
		arvore.inserir(ob2);
		arvore.inserir(ob3);
		arvore.inserir(ob4);
		arvore.inserir(ob5);
		arvore.inserir(ob6);
		arvore.inserir(ob7);
		arvore.exibirInOrdem();
		arvore.exibirPreOrdem();
		arvore.exibirPosOrdem();
	 }
}
