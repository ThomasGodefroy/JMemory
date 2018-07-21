package vues;


import javax.swing.JPanel;

import modeles.Page;
import modeles.Projet;

public class Zone_centrale extends JPanel{

	public Zone_centrale(Fenetre_principale fenetre, Projet projet){
		super();		
		setSize(fenetre.getWidth()/2, fenetre.getHeight()/2);
		affiche(projet, fenetre);
	}
	
    private void affiche(Projet projet, Fenetre_principale f) {
    	for(int i=0; i < projet.nbElements(); i++) {
    		Page p = projet.getPage(i);
    		p.mettreajourTaille(f.getWidth()/2,f.getHeight()/2);
    		add(p);
    	}
    }
}