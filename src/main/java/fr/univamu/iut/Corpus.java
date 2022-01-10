package main.java.fr.univamu.iut;

import java.util.*;

public class Corpus {
	private List<String> textes = new ArrayList<String>();
	
	Corpus(Builder builder){
		textes = builder.textes;
	};
	
	public List<String> getTextes(){
		return textes;
	}
	 
	public static class Builder {
		private List<String> textes = new ArrayList<String>();

		public Builder addTexte(String texte) {
			textes.add(texte);
			return this;
		}
		
		public Corpus build() {
			return new Corpus(this);
		}
	}
	
}
