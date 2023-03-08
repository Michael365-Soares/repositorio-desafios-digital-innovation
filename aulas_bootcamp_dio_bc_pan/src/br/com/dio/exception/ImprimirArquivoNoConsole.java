package br.com.dio.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ImprimirArquivoNoConsole {
     public static void main(String[] args) throws FileNotFoundException {
    	FileInputStream arquivo=null;
		try {
		      arquivo = lerArquivo("arquivo.txt","D:\\Users\\micha\\Documents\\"
			 		+ "workspace\\repositorio-desafios-digital-innovation"
			 		+ "\\aulas_bootcamp_dio_bc_pan\\src\\br\\com\\dio\\exception\\arquivo.txt");
		} catch (ImpossivelAberturaDeArquivoException e) {
			System.out.println(e.getMessage());
		}
    	 try {
			imprimirArquivo(arquivo);
		} catch (ImpossivelAberturaDeArquivoException e) {
			System.out.println(e.getMessage());
		}
	 }
     
     static void imprimirArquivo(FileInputStream arquivo) throws ImpossivelAberturaDeArquivoException {
    	 Scanner sc;
		try {
			sc = new Scanner(arquivo,"UTF-8");
		} catch (NullPointerException e) {
			throw new ImpossivelAberturaDeArquivoException("arquivo.txt","C:\\\\Users\\\\micha\\\\Documents");
		}
    	 while(sc.hasNext()){
    		 String linha=sc.nextLine();
    		 if(linha!=null&&!linha.isEmpty()) {
    			 System.out.println(linha);
    		 }
    	 }
    	 sc.close();
     }
     
     static FileInputStream lerArquivo(String nomeArquivo,String arquivo) throws ImpossivelAberturaDeArquivoException{
    	FileInputStream retorno;
		try {
			retorno = new FileInputStream(arquivo);
		} catch (FileNotFoundException e) {
			throw new ImpossivelAberturaDeArquivoException(nomeArquivo, arquivo);
		}
    	 return retorno;
     }
     
}
