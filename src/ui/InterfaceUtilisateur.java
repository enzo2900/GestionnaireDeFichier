package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceUtilisateur {
    private JFrame frame;
    private JButton btnCreerDossier;
    private JButton btnDeplacerFichier;
    private JTextArea txtAreaResultat;

    public InterfaceUtilisateur() {
        // Initialisation de la fenêtre principale
        frame = new JFrame("Gestion de fichiers et dossiers");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialisation des composants
        btnCreerDossier = new JButton("Créer un dossier");
        btnDeplacerFichier = new JButton("Déplacer un fichier");
        txtAreaResultat = new JTextArea();

        // Ajout des composants à la fenêtre
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(btnCreerDossier, BorderLayout.NORTH);
        contentPane.add(btnDeplacerFichier, BorderLayout.CENTER);
        contentPane.add(new JScrollPane(txtAreaResultat), BorderLayout.SOUTH);

        // Ajout des écouteurs d'événements
        btnCreerDossier.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code à exécuter lors du clic sur le bouton Créer un dossier
                txtAreaResultat.append("Action: Créer un dossier\n");
                // Appel à la méthode de création de dossier
                // Exemple : gestionnaireFichiers.creerDossier();
            }
        });

        btnDeplacerFichier.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code à exécuter lors du clic sur le bouton Déplacer un fichier
                txtAreaResultat.append("Action: Déplacer un fichier\n");
                // Appel à la méthode de déplacement de fichier
                // Exemple : gestionnaireFichiers.deplacerFichier();
            }
        });
    }

    public void lancer() {
        // Affichage de la fenêtre principale
        frame.setVisible(true);
    }
}

	
