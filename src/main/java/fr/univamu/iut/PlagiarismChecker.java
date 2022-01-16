package main.java.fr.univamu.iut;

public class PlagiarismChecker {
	private Comparison comp;
	
	public void comparer(String string) {
		comp.compare(string);
	}
	
	public void changerComparaison(Comparison typeComparison) {
		comp = typeComparison;
	}
	
}
