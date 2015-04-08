package com.biblio.connexion;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class ConnexionVue extends JFrame implements ActionListener{


	
	
	//attributs
	//Container content = getContentPane();			// voir si je le garde
	JTextField textfieldPseudo = new JTextField(20);	//zone de saisie text
	JPasswordField pwdfieldMDP = new JPasswordField(20);	
	JButton buttonValider = new JButton("Se Connecter");
	
	
	ConnexionVue()			//constructeur par défaut
	{
		initialize();
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {		// recuperer les actions sur la fenetre
		// TODO Auto-generated method stub
		
		Object o = e.getSource();		// utiliter ?
		
	}
	
	
	public void initialize()	// methode d'initialisation de la vue
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//permet d'utiliser les 3 boutons (fermer/reduire/agrandir) du haut de la fenetre
		//this.setSize(400, 400);									//re-dimensionner la fenetre
		this.setLocationRelativeTo(null);						// afficher la fenetre au centre de l'ecran
		this.setTitle("Connexion"); 							//donne un titre à la fenetre
		this.setResizable(false);								// annule la redimension manuel
		
		JPanel panel = new JPanel();									//instance de panel
		panel.setLayout(new GridBagLayout());
		
		
		//ajout des items
		addItem(panel, new JLabel("Login :"), 0, 0, 1, 1, GridBagConstraints.CENTER);
		addItem(panel, new JLabel("Mot de Passe :"), 0, 1, 1, 1, GridBagConstraints.CENTER);
		addItem(panel, textfieldPseudo, 1, 0, 1, 1, GridBagConstraints.CENTER);
		addItem(panel, pwdfieldMDP, 1, 1, 1, 1, GridBagConstraints.CENTER);
		addItem(panel, buttonValider, 4, 2, 1, 1, GridBagConstraints.CENTER);
		
		
		
		this.add(panel);										
		this.pack();
		this.setVisible(true);									//rendre la fenetre visible
	}
	
	private void addItem(JPanel p, JComponent c,				// methode de placement des items
			int x, int y, int width, int height,
			int align)
			{
			GridBagConstraints gc =new GridBagConstraints();
			gc.gridx = x;
			gc.gridy = y;
			gc.gridwidth = width;
			gc.gridheight = height;
			gc.weightx = 100.0;
			gc.weighty = 100.0;
			gc.insets = new Insets(5, 5, 5, 5);
			gc.anchor = align;
			gc.fill = GridBagConstraints.NONE;
			p.add(c, gc);
	}

}
