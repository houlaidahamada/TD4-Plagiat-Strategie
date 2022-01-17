package main.java.fr.univamu.iut;

public class Client {

    public static void main(String[] args) {
    	Corpus corpus = new Corpus.Builder().addTexte("Je suis le boss.").addTexte("Je suis le chef").addTexte("Je suis le bosseur.").build();
    	PlagiarismChecker plagiarism = new PlagiarismChecker(corpus, 3);
    	plagiarism.checkPlagiarism("ZAZA");
    }
}
