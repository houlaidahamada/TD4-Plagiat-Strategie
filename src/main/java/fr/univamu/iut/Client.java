package main.java.fr.univamu.iut;

public class Client {

    public static void main(String[] args) {
    	Corpus corpus = new Corpus.Builder().addTexte("Je suis le boss.").addTexte("Je suis le chef").addTexte("Je suis le bosseur.").build();
    	PlagiarismChecker plagiarism = new PlagiarismChecker();
    	plagiarism.changerComparaison(new HardComparison(corpus,3));
    	plagiarism.comparer("Je suis le bosseu");
    }
}
