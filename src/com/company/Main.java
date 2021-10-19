package com.company;
/**
 * @author alexandre Debus
 */

import com.alexandre.entites.Forum;
import com.alexandre.entites.Message;
import com.alexandre.entites.MessageUtilisateur;
import com.alexandre.entites.Utilisateur;
import com.alexandre.types.CategorieUtilisateur;

public class Main
{

    public static void main(String[] args)
    {
        MessageUtilisateur[] letableau = new MessageUtilisateur[0];
        Forum forum = new Forum(letableau);
        Utilisateur util = new Utilisateur("Alex","Debus",CategorieUtilisateur.MODERATEUR);
        Message mess = new Message("montitre","montexte",util);
        forum.ajouterUtilisateurMessage(util,mess);
        Message mess2 = new Message("deux","coucou java",util);
        forum.ajouterUtilisateurMessage(util,mess2);
        


    }
}
