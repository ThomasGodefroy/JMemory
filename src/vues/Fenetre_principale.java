package vues;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.ScrollPane;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

import modeles.Projet;

public class Fenetre_principale extends JFrame{
	
	private static final String FIN_NOM = " - JMemories";
	private Zone_centrale zoneprincipale;
	private Barre_menus menus;
	private Barre_outils outils;
	private Barre_etat etats;
	
	public Projet projet;
	
	public Fenetre_principale(){
    	super();
    	setMinimumSize(new Dimension(1000,700));
    	projet = new Projet();
    	zoneprincipale = new Zone_centrale(this, projet);
    	JScrollPane scrollarea = new JScrollPane(zoneprincipale);
    	menus = new Barre_menus(this);
    	outils = new Barre_outils(this);
    	etats = new Barre_etat();
    	add(scrollarea, BorderLayout.CENTER);
    	add(etats, BorderLayout.SOUTH);
    	add(outils,BorderLayout.NORTH);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    	setVisible(true);
    	miseAJourTitre();
	}
	
    public void miseAJourTitre() {
    	setTitle(projet.nomDeFichier() + FIN_NOM);
    }
}
