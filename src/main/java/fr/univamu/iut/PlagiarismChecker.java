package main.java.fr.univamu.iut;

import java.util.Scanner;

public class PlagiarismChecker {
	private ITextDistance comp;
	private Corpus corpus;
	private int treshold;
	
	PlagiarismChecker(Corpus corpus, int treshold){
		this.corpus = corpus;
		this.treshold = treshold;
	}
	
	public boolean checkPlagiarism(String string) {
		Scanner scanner = new Scanner(System.in);
		boolean CheckOn = true;
			System.out.println("Choisissez la stratégie à adopter: " + "Comparaison Simple(1) " + "ou"  + " Comparaison Renforcée(2)");
			int reponse = scanner.nextInt();
			if(reponse == 1) {
				this.changerComparaison(new LevenshteinStrategy(this.corpus,this.treshold));
			}
			else {
				this.changerComparaison(new HammingStrategy(this.corpus,this.treshold));
			}
			double distance = comp.computeDistance(string);
			if(distance <= treshold) {
				System.out.println("Il y a plagiat");
				return true;
			}
			else {
				System.out.println("Rien à signaler.");
				return false;
			}
	}
	
	public void changerComparaison(ITextDistance typeComparison) {
		comp = typeComparison;
	}
	
}
