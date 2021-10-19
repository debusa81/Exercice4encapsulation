package com.alexandre.entites;

import com.alexandre.types.CategorieUtilisateur;
import jdk.jshell.execution.Util;

import javax.swing.*;
import java.util.Arrays;

public class Forum {
private   int NBR_MESSAGES = 10;

    public Forum(MessageUtilisateur[] tab){
        this.mon_tableau=tab;

    }


    private int nombre_message=0;
    private MessageUtilisateur [] mon_tableau;

    public boolean ajouterUtilisateurMessage(Utilisateur utilisateur,Message message){
        nombre_message=nombre_message+1;

        int i;
         MessageUtilisateur[]test = new MessageUtilisateur[nombre_message];




        for ( i=0;i<test.length;i++){

            utilisateur = new Utilisateur(utilisateur.getPrenom(), utilisateur.getNom(), utilisateur.getStatut());

            message = new Message(message.getTitre(), message.getTexte(), utilisateur);
            MessageUtilisateur mes;
            System.out.println("oui 3");

            mes= new MessageUtilisateur(utilisateur,message);
            test[i]=mes;

            System.out.println("tableau rempli");

        }
       // JOptionPane.showMessageDialog(null,mon_tableau.toString());
        String [] tableau=Arrays.stream(test).map(MessageUtilisateur::toString).toArray(String[]::new);
       JOptionPane.showMessageDialog(null,Arrays.toString(tableau));




        return false;
    }

}
