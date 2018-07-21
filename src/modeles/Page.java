package modeles;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Page extends JPanel{

	private JTextArea editeur ;
	private JScrollPane sp ;
	
	public Page(){
		super();
		
		
		editeur = new JTextArea(50,50);
		editeur.setFont(new Font("Liberation Sans", Font.PLAIN, 12));
		editeur.setLineWrap(true);
		editeur.setWrapStyleWord(true);
		
		sp = new JScrollPane(editeur);
		sp.setBounds(5, 5, 100, 100);
		
		

		setVisible(true);

		setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
		setOpaque(true);
		setBackground(Color.white);
		
		add(sp);
		
		
	}
	
	public void mettreajourTaille(int w, int h){
		setSize(w, h);
	}
	
}
