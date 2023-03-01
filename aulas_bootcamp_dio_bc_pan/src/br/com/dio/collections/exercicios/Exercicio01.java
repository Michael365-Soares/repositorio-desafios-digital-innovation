package br.com.dio.collections.exercicios;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

import javax.swing.JOptionPane;

public class Exercicio01 {
    public static void main(String[] args) {
		List<Double> temperaturas=new ArrayList<>();
		
		for(int i=0;i<6;i++) {
			double temperatura=Double.parseDouble(JOptionPane.showInputDialog("Digite a "+(i+1)+"ª temperatura:"));
			temperaturas.add(new BigDecimal(temperatura).setScale(2,RoundingMode.HALF_EVEN).doubleValue());
		}
		double media=new BigDecimal(temperaturas.stream().reduce((t,ac)->ac+=t).map(ac->ac/temperaturas.size()).get()).setScale(2,RoundingMode.HALF_EVEN).doubleValue();
		System.out.println("Média de temparatura: "+media+"º");
		BiFunction<Double,Integer,String> imprimirTemAcimaDaMedia=(temp,i)->{
			String retorno="";
			if(temp>media) {
				double m=new BigDecimal(media).setScale(2,RoundingMode.HALF_EVEN).doubleValue();
				switch(i) {
				   case 1:
					   retorno= "1-=Janeiro acima da média: "+temp+"º média de: "+m+"º";
					   break;
				   case 2:
					   retorno= "2-=Fevereiro acima da média: "+temp+"º média de: "+m+"º";
					   break;
				   case 3:
					   retorno= "3-=Março acima da média: "+temp+"º média de: "+m+"º";
					   break;
				   case 4:
					   retorno= "4-Abril acima da média: "+temp+"º média de: "+m+"º";
					   break;
				   case 5:
					   retorno= "5-Maio acima da média: "+temp+"º média de: "+m+"º";
					   break;
				   case 6:
					    retorno="6-Junho acima da média: "+temp+"º média de: "+m+"º";
			     }
			  }
			i++;
			return retorno;
	     };
	     
	     java.util.Iterator<Double> iterator=temperaturas.iterator();
	     int i=1;
	     while(iterator.hasNext()) {
	    	 double next=iterator.next();
	    	 System.out.println( imprimirTemAcimaDaMedia.apply(next,i));
	    	 i++;
	     }
	     
    }
    
}
