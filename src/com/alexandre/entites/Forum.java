package com.alexandre.entites;

import java.util.Arrays;

public class Forum {
    public static final  int NBR_MESSAGES = 0;
    public int nbr_message_now;
    MessageUtilisateur[] tableau  = new MessageUtilisateur[NBR_MESSAGES];
    public boolean ajouterUtilisateuMessage(Utilisateur utilisateur, MessageUtilisateur message){
        MessageUtilisateur mess= new MessageUtilisateur(utilisateur,message);
        for (int i=0;i<NBR_MESSAGES;i++){
            tableau[i]=message;
        }
        System.out.println(Arrays.toString(tableau));
         boolean mon_bool=false;
        return mon_bool;
    }
}
