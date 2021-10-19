package com.alexandre.entites;

import com.alexandre.types.CategorieUtilisateur;

import javax.swing.*;

/**
 * classe utilisateur qui permet la création d' un utilisateur
 */
public class Utilisateur {

    //attributs d'instance
    private String prenom;
    private  String nom;
    private CategorieUtilisateur statut;

    //getters et setters

    public String getPrenom()
    {
        return prenom;
    }
    public void setPrenom(String prenom)
    {
        this.prenom = prenom;
    }

    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public CategorieUtilisateur getStatut()
    {
        return statut;
    }

    public void setStatut(CategorieUtilisateur statut)
    {
        this.statut = statut;
    }
    //définition du constructeur de la classe Utilisateur
    public Utilisateur(String prenom, String nom, CategorieUtilisateur statut)
    {
        setPrenom(prenom);
        setNom(nom);
        setStatut(statut);
        JOptionPane.showMessageDialog(null,"prenom :"+prenom+"nom :"+nom+"statut:"+statut);
    }


    // méthode tostring qui permet de mettre en forme toutes mes données
    @Override
    public String toString() {
        return "Utilisateur:"+ prenom+""+nom+","+statut;
    }
}
