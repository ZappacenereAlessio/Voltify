package com.example.voltify;

import java.util.ArrayList;

public class GestoreBrani {
    ArrayList<Brano> brani;
    public GestoreBrani(){
         brani = new ArrayList<Brano>();

    }

    public void aggBrano(String titolo, String genere){
        Brano gestoreBrani = new Brano(titolo, genere);

        brani.add(gestoreBrani);
    }

    public String ListaSong(){
        StringBuilder builder = new StringBuilder();
        for (Brano brc : brani){
            builder.append(brc.getTitolo().toString()+"\n");
            builder.append(brc.getGenere().toString()+"\n");

        }
        return  builder.toString();
    }

}
