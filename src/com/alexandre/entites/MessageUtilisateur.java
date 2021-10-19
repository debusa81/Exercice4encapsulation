package com.alexandre.entites;

import com.alexandre.types.CategorieUtilisateur;

public class MessageUtilisateur {
    public  Utilisateur util;
    public Message mess;
    public  MessageUtilisateur(Utilisateur util, Message message){
        this.util=util;
        this.mess=message;

    }



    public Utilisateur getUtil() {
        return util;
    }

    public void setUtil(Utilisateur util) {
        this.util = util;
    }

    public Message getMess() {
        return mess;
    }

    public void setMess(Message mess) {
        this.mess = mess;
    }

    @Override
    public String toString() {
        return
                  util +
                ", titre:" + mess +
                '}';
    }
}
