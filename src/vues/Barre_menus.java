package vues;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Barre_menus extends JMenuBar{
	
	private JMenuItem itemEnregistrer;

	public Barre_menus(final Fenetre_principale fenetre){
		
		fenetre.setJMenuBar(this);

/*************** Menu "Fichier" ***************************/
		JMenu menu = new JMenu("Fichier");
		add(menu);
		
		JMenuItem it = new JMenuItem("Nouveau");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		
		it = new JMenuItem("Ouvrir");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		
		it = new JMenuItem("Derniers documents");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		
		it = new JMenuItem("Fermer");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							//fenetre.dispose();
						}
				}
		   );
		menu.addSeparator();
		
		it = new JMenuItem("Enregistrer");
		itemEnregistrer = it;
		it.setEnabled(false);
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							//fenetre.enregistre();
						}
				}
		   );
		
		it = new JMenuItem("Enregistrer sous");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							//fenetre.enregistreSous();
						}
				}
		   );
		menu.addSeparator();
		
		/*it = new JMenuItem("Exporter");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );*/	
		it = new JMenuItem("Exporter au format PDF");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Envoyer");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		menu.addSeparator();
		
		it = new JMenuItem("Aperçu dans le navigateur web");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		menu.addSeparator();
		
		it = new JMenuItem("Aperçu");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Imprimer");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		menu.addSeparator();
		
		it = new JMenuItem("Quitter");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							System.exit(0);
						}
				}
		   );
		
/*************** Menu "Edition" ***************************/		
		menu = new JMenu("Edition");
		add(menu);
		
		it = new JMenuItem("Annuler");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Rétablir");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Répéter");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		menu.addSeparator();
		it = new JMenuItem("Couper");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Copier");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Coller");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Sélectionner le texte");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Tout sélectionner");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		
		menu.addSeparator();
		
		it = new JMenuItem("Rechercher");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );		
		it = new JMenuItem("Rechercher et remplacer");
			menu.add(it);
			it.addActionListener(
					new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								
							}
					}
			   );
		
		
/*************** Menu "Affichage" ***************************/
		menu = new JMenu("Affichage");
		add(menu);
		
		it = new JMenuItem("Mise en page impression");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Mise en page web");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		
		menu.addSeparator();
		
		it = new JMenuItem("Barre d'outils");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Barre d'état");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Statut de la méthode de saisie");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Règle");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		
		menu.addSeparator();
		
		it = new JMenuItem("Délimitation du texte");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Délimitation du tableau");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Trame de fond des champs");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Nom de champs");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Paragraphes masqués");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Caractères non imprimables");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Commentaires");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Masquer les images");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		
/*************** Menu "Insertion" ***************************/
		menu = new JMenu("Insertion");
		add(menu);
		
		it = new JMenuItem("Saut manuel");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Champs");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Caractères spéciaux");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Marques de formatage");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		
		menu.addSeparator();
		
		it = new JMenuItem("Section");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Hyperlien");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		
		menu.addSeparator();
		
		it = new JMenuItem("En-tête");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Pied-de-page");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Note de bas/fin de page");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Renvoi");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Commentaire");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Script");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Index et table");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		
		menu.addSeparator();
		
		it = new JMenuItem("Image");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Média");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Forme");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Objet");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Zone de texte");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Cadre");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Cadre flottant");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		
		menu.addSeparator();
		
		it = new JMenuItem("Document");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		
/*************** Menu "Format" ***************************/
		menu = new JMenu("Format");
		add(menu);
		
		it = new JMenuItem("Effacer le formatage direct");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		
		menu.addSeparator();
		
		it = new JMenuItem("Caractère");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Paragraphe");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Puces et numérotation");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Page");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Page de titre");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		
		menu.addSeparator();
		
		it = new JMenuItem("Modifier la casse");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		
		menu.addSeparator();
		
		it = new JMenuItem("Style et formatage");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Auto-correction");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		
		menu.addSeparator();
		
		it = new JMenuItem("Image");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		
		menu.addSeparator();
		
		it = new JMenuItem("Ancrer");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Adaptation du texte");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Alignement");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Positionner");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Retourner");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Pivoter");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Groupe");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		
		menu.addSeparator();
		
		it = new JMenuItem("Objet");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		
/*************** Menu "Tableau" ***************************/
		menu = new JMenu("Tableau");
		add(menu);
		
		it = new JMenuItem("Insérer un  tableau");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Insérer");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Supprimer");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Sélectionner");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Fusionner les cellules");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Scinder les cellules");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		
		menu.addSeparator();
		
		it = new JMenuItem("Protéger les cellules");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Annuler la protection des cellules");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		
		menu.addSeparator();
		
		it = new JMenuItem("Fusionner le tableau");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Scinder le tableau");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		
		menu.addSeparator();
		
		it = new JMenuItem("Adapter");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Répéter les lignes de titre");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Convertir");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Formule");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Reconnaissance des nombres");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Délimitation des tableaux");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		
/*************** Menu "Outils" ***************************/
		menu = new JMenu("Outils");
		add(menu);
		it = new JMenuItem("Orthographe et grammaire");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Correction orthographique automatique");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Langue");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Statistiques");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		
		menu.addSeparator();
		
		it = new JMenuItem("Numérotation des lignes");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Numérotation des chapitres");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		it = new JMenuItem("Notes de bas/fin de page");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		
		menu.addSeparator();
		
		it = new JMenuItem("Actualiser");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
				}
		   );
		
/*************** Menu "Fenêtre" ***************************/
		menu = new JMenu("Fenêtre");
		add(menu);
		
		it = new JMenuItem("Nouvelle fenêtre");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							new Fenetre_principale();
						}
				}
		   );
		it = new JMenuItem("Fermer la fenêtre");
		menu.add(it);
		it.addActionListener(
				new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							fenetre.dispose();
						}
				}
		   );
		
/*************** Menu "Aide" ***************************/
		menu = new JMenu("Aide");
		add(menu);
	}
	
	public void activerEnregistrer() {
		itemEnregistrer.setEnabled(true);
	}
}
