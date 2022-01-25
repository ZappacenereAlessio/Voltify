package com.example.voltify;

import java.util.ArrayList;

public class GestoreBrani {
    ArrayList<Brano> brani;
    public GestoreBrani(){
         brani = new ArrayList<Brano>();

    }

    public void aggBrano(String titolo, String autore, String genere, Integer durata){
        Brano gestoreBrani = new Brano(titolo, autore, genere, durata);

        brani.add(gestoreBrani);
    }

    public String listaSong(){
        StringBuilder builder = new StringBuilder();
        for (Brano brc : brani){
            builder.append(brc.getTitolo().toString()+"\n");
            builder.append(brc.getAutore().toString()+"\n");
            builder.append(brc.getGenere().toString()+"\n");
            builder.append(brc.getDurata().toString()+"\n");

        }
        return builder.toString();

    }

}
