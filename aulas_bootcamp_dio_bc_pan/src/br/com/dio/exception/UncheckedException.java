package br.com.dio.exception;

import javax.swing.JOptionPane;

public class UncheckedException {
    public static void main(String[] args) {
		String a=JOptionPane.showInputDialog("Numerador:");
		String b=JOptionPane.showInputDialog("Denominador:");
		
    	try {
			System.out.println("Resultado: "+dividir(Integer.parseInt(a),Integer.parseInt(b)));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Ouve algum erro ao realizar a operação: "+e.getMessage());
		}
    	System.out.println("CHEGOU ATÉ AQUI...");
	}
    static int dividir(int numerador,int denominador) {return numerador/denominador;}
}
