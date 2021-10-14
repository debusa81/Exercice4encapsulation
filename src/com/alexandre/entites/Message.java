package com.alexandre.entites;

import java.util.Date;

public class Message {
    private String titre ;
    private String texte;
    private Date date_creation;
    private Utilisateur utilisateur;
    public static final  Forum forum = new Forum();
}
