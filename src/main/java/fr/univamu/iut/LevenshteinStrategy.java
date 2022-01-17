package main.java.fr.univamu.iut;

import java.util.List;

public class LevenshteinStrategy implements ITextDistance {
	
	private Corpus corpus;
	private int treshold;
	
	LevenshteinStrategy(){};

	LevenshteinStrategy(Corpus corpus, int treshold) {
		this.corpus = corpus;
		this.treshold = treshold;
	}

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
