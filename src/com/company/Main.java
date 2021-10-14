package com.company;

import com.alexandre.entites.Message;
import com.alexandre.entites.Utilisateur;
import com.alexandre.types.CategorieUtilisateur;

public class Main {

    public static void main(String[] args) {
        Message message1 = new Message("Java SE","l'encapsulation est formidable "
                ,new Utilisateur("Jean","test",
                CategorieUtilisateur.STANDARD));
    }
}
