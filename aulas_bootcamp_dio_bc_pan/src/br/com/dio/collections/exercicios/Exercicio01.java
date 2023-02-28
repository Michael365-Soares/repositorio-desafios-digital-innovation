package br.com.dio.collections.exercicios;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Exercicio01 {
    public static void main(String[] args) {
		List<Double> temperaturas=new ArrayList<>();
		for(int i=0;i<6;i++) {
			double temperatura=Double.parseDouble(JOptionPane.showInputDialog("Digite a "+(i+1)+"ª temperatura:"));
			temperaturas.add(temperatura);
		}
		double media=temperaturas.stream().reduce((t,ac)->ac+=t).map(ac->ac/temperaturas.size()).get();
		System.out.println(media);
	}
}
