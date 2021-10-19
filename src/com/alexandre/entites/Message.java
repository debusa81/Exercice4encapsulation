package com.alexandre.entites;

import com.alexandre.types.CategorieUtilisateur;

import javax.swing.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Classe message
 */
public class Message {


    private String titre ;
    private String texte;
    private Date date_creation;
    private Utilisateur utilisateur;
    // ecriture des getter et des setters
    String getDate_creation() {
        DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL);


        return df.format(date_creation);
    }

    public String getTitre() {
        return titre;
    }
    public String getAuteur() {
        return utilisateur.getPrenom() + " " + utilisateur.getNom() + ", " + utilisateur.getStatut();
    }


    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }


    public Utilisateur getUtilisateur() {
        return utilisateur;
    }
    //définition du constructeur de la classe
    public Message(String titre, String texte, Utilisateur utilisateur) {
        setTitre(titre);
        setTexte(texte);

        this.utilisateur = utilisateur;
        date_creation = new Date();
        JOptionPane.showMessageDialog(null,
                titre + " " + texte + "Date de création :" + getDate_creation() + "Utilisateur:" +
                new Utilisateur("Jean", "Dupont", CategorieUtilisateur.STANDARD));


    }

    //méthode tostring

    @Override
    public String toString() {
        return titre+"--"+texte+"\\nDate de création :"+getDate_creation()+"\n"+utilisateur;
    }
}
