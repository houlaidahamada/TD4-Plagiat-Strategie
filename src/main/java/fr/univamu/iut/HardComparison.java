package main.java.fr.univamu.iut;

import java.util.*;

public class HardComparison implements Comparison{
	
	private Corpus corpus;
	private int treshold;
	
	HardComparison(Corpus corpus, int treshold) {
		this.corpus = corpus;
		this.treshold = treshold;
	}
	

	@Override
	public void compare(String string) {
		int difference;
		List<String> textes = corpus.getTextes();
		for(int i = 0; i < textes.size(); i++) {
			String texte = textes.get(i);
			difference = string.compareToIgnoreCase(texte);
			System.out.println(difference);
			if(difference <= treshold) {
				System.out.println("Il y a plagiat, ressemble à : " + texte);
			}
			else {
				System.out.println("Rien à signaler.");
			}
		}
	}

}
