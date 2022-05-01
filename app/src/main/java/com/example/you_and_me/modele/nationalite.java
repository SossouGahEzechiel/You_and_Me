package com.example.you_and_me.modele;

import java.util.ArrayList;
import java.util.List;

public class nationalite {

    private  int indicatif;
    private String libelle;

    public int getIndicatif() {
        return indicatif;
    }

    public void setIndicatif(int indicatif) {
        this.indicatif = indicatif;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public nationalite(int indicatif, String libelle) {
        this.indicatif = indicatif;
        this.libelle = libelle;
    }

    public String toString(){
        return ("+" +this.getIndicatif()+"---"+this.getLibelle());
    }

    public static List<nationalite> getNationalite(){

        List<nationalite> nation = new ArrayList<>();

        nation.add( new nationalite(228,"Togo"));
        nation.add( new nationalite(229,"Benin"));
        nation.add( new nationalite(233,"Ghana"));
        nation.add( new nationalite(333,"France"));
        nation.add( new nationalite(1,"Canada"));


        return nation;
    }

}
