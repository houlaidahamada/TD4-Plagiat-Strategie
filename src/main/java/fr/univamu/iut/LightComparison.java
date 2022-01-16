package main.java.fr.univamu.iut;

public class LightComparison implements Comparison {
	
	private Corpus corpus;
	private int treshold;
	

	LightComparison(Corpus corpus, int treshold) {
		this.corpus = corpus;
		this.treshold = treshold;
	}

	@Override
	public void compare(String string) {
		int difference;
		for(int i = 0; i < corpus.getTextes().size(); i++) {
			difference = string.compareTo(corpus.getTextes().get(i));
			if(difference <= treshold) {
				System.out.println("Il y a plagiat, ressemble à : " + corpus.getTextes().get(i));
			}
			else {
				System.out.println("Rien à signaler.");
			}
		}
	}


}
