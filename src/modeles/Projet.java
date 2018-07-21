package modeles;

import java.util.ArrayList;

public class Projet {

	private String nom;
	private ArrayList<Page> pages;
	private boolean modifié;
	
	public Projet(){
		nom = "Sans nom" ;
		pages = new ArrayList<Page>();
		Page premiere = new Page(); 
		pages.add(premiere);
	}
	
	
	public String nomDeFichier(){
		return nom;
	}
	
	public Page getPage(int i){
		return pages.get(i);
	}
	
	public int nbElements(){
		return pages.size();
	}
}
