package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class InterfaceUtilisateur extends JFrame {
    private JFrame frame;
    private JButton btnCreerDossier;
    private JButton btnDeplacerFichier;
    private JPanel panelResultat;
    private JScrollPane scrollPane;

    public InterfaceUtilisateur() {
        // Initialisation de la fenêtre principale
        frame = new JFrame("Gestion de fichiers et dossiers");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialisation des composants
        btnCreerDossier = new JButton("Créer un dossier");
        btnDeplacerFichier = new JButton("Déplacer un fichier");
        panelResultat = new JPanel();
        panelResultat.setLayout(new BoxLayout(panelResultat, BoxLayout.Y_AXIS)); // Utilisation d'un layout vertical
        scrollPane = new JScrollPane(panelResultat);

        // Ajout des composants à la fenêtre
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(btnCreerDossier, BorderLayout.NORTH);
        contentPane.add(btnDeplacerFichier, BorderLayout.CENTER);
        contentPane.add(scrollPane, BorderLayout.SOUTH);

        // Ajout des écouteurs d'événements
        btnCreerDossier.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code à exécuter lors du clic sur le bouton Créer un dossier
                // Exemple : txtAreaResultat.append("Action: Créer un dossier\n");
                // Appel à la méthode de création de dossier
                // Exemple : gestionnaireFichiers.creerDossier();
            }
        });

        btnDeplacerFichier.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code à exécuter lors du clic sur le bouton Déplacer un fichier
                // Exemple : txtAreaResultat.append("Action: Déplacer un fichier\n");
                // Appel à la méthode de déplacement de fichier
                // Exemple : gestionnaireFichiers.deplacerFichier();
            }
        });

        // Exemple d'ajout de cases à cocher pour chaque fichier
        File repertoire = new File("chemin_vers_le_repertoire");
        File[] fichiers = repertoire.listFiles();
        if (fichiers != null) {
            for (File fichier : fichiers) {
                JCheckBox checkBox = new JCheckBox(fichier.getName());
                panelResultat.add(checkBox);
            }
        }
    }

    public void lancer() {
        // Affichage de la fenêtre principale
        frame.setVisible(true);
    }
}
	
