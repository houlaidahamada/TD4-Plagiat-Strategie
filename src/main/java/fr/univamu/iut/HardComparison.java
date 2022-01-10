package main.java.fr.univamu.iut;

import java.util.*;

public class HardComparison implements Comparison{
	
	private Corpus corpus;
	
	public void setCorpus(Corpus corpus) {
		this.corpus = corpus;
	}

	@Override
	public void compare(String string) {
		for(int i = 0; i < corpus.getTextes().size(); i++) {
			string.compareToIgnoreCase(corpus.getTextes().get(i));
		}
	}

}
