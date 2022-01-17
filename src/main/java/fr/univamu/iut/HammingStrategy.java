package main.java.fr.univamu.iut;

import java.util.*;

public class HammingStrategy implements ITextDistance{
	
	private Corpus corpus;
	private int treshold;
	
	HammingStrategy(){};
	
	HammingStrategy(Corpus corpus, int treshold) {}
	

	@Override
	public double computeDistance(String string) {
		double difference = 0;
		List<String> textes = corpus.getTextes();
		for(int i = 0; i < textes.size(); i++) {
			String texte = textes.get(i);
			difference = string.compareToIgnoreCase(texte);
		}
		return difference;
	}

}
