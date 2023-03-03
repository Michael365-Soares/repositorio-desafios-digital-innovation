package br.com.dio.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.TreeMap;

public class CollectionMap {
    public static void main(String[] args) {
    	System.out.println("Crie um dicionário que relaione os modelos e seus respectivos consumos:");
		Map<String,Double> carrosPopulares=new HashMap<>();
		carrosPopulares.put("Gol",14.4);
		carrosPopulares.put("Uno",15.6);
		carrosPopulares.put("Mobi",16.1);
		carrosPopulares.put("HB20",14.5);
		carrosPopulares.put("kWID",15.5);
		System.out.println(carrosPopulares.entrySet());
		System.out.println("Substiua o consumo do gol por 15.2Km/l:");
		carrosPopulares.put("Gol",15.2);
		System.out.println(carrosPopulares);
		System.out.println("Conferindo se o modelo Tucson existe no dicionário:"+carrosPopulares.containsKey("Tucson"));
		System.out.println("Exiba o consumo do Uno: "+carrosPopulares.get("Uno").doubleValue());
		//System.out.println("Exiba o terceiro modelo adicionado:");
		System.out.println("Exiba os modelos:");
		System.out.println(carrosPopulares.keySet());
		System.out.println("Exiba o consumo dos carros:");
		System.out.println(carrosPopulares.values());
		System.out.println("Exiba o modelo mais econômico e seu consumo:");
		double consumoMaisEficiente=Collections.max(carrosPopulares.values());
		Optional<Entry<String, Double>>carro=carrosPopulares.entrySet().stream().filter(e->e.getValue()==consumoMaisEficiente).findFirst();
		System.out.println("O carro mais econômico é: "+carro.get().getKey()+" com o desempenho de "+carro.get().getValue());
		System.out.println("Exiba o modelo menos eficiente e seu consumo:");
		double menosEficiente=Collections.min(carrosPopulares.values());
		carro=carrosPopulares.entrySet().stream().filter(e->e.getValue()==menosEficiente).findFirst();
		System.out.println("O carro menos econômico é: "+carro.get().getKey()+" com o desempenho de "+carro.get().getValue());
		System.out.println("Exiba a soma dos consumos:");
		System.out.println(carrosPopulares.values().stream().reduce((c,ac)->ac+=c).get()+" L");
		System.out.println("Exiba a media dos consumos deste dicionário de carro:");
		double mediaConsumo=carrosPopulares.values().stream().reduce((c,ac)->ac+=c).get()/carrosPopulares.size();
		System.out.println("Média de consumo de todos os carros: "+mediaConsumo+" L");
		System.out.println("Remova os modelos com o  consumo igual a 15.6 Km/l:");
		Optional<Entry<String,Double>> c=carrosPopulares.entrySet().stream().filter(e->e.getValue()==15.6).findFirst();
		System.out.println(carrosPopulares);
		carrosPopulares.remove(c.get().getKey(),c.get().getValue());
		System.out.println(carrosPopulares);
		System.out.println("Exiba todos ");
		System.out.println("Exiba todos os carros na ordem em que forma informados:");
		@SuppressWarnings("serial")
		Map<String,Double> carrosPopulares01=new LinkedHashMap<>() {{
			put("Uno",15.6);
			put("kWID",15.5);
			put("Mobi",16.1);
			put("Gol",14.4);
			put("HB20",14.5);
		}};
		System.out.println(carrosPopulares01);
		System.out.println("Exiba o dicionário ordenado pelo modelo:");
		Map<String,Double> carros=new TreeMap<>();
		carros.putAll(carrosPopulares);
		System.out.println(carros);
		System.out.println("Apague o conjunto de carros:");
		carros.clear();
		System.out.println("Confira se alista está vazia:"+carros.isEmpty());
		System.out.println(carros);
	}
}

class ComparatorModelo implements Comparator<String>{
	@Override
	public int compare(String c1, String c2) {
		return c1.compareToIgnoreCase(c2);
	}
}
