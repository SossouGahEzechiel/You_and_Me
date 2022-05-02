package com.example.you_and_me.entities;

import java.util.ArrayList;
import java.util.List;

public class Nationalite {

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

    public Nationalite(int indicatif, String libelle) {
        this.indicatif = indicatif;
        this.libelle = libelle;
    }

    public String toString(){
        return ("+" +this.getIndicatif()+"---"+this.getLibelle());
    }

    public static List<Nationalite> getNationalite(){

        List<Nationalite> nation = new ArrayList<>();

        nation.add( new Nationalite(228,"Togo"));
        nation.add( new Nationalite(229,"Benin"));
        nation.add( new Nationalite(233,"Ghana"));
        nation.add( new Nationalite(333,"France"));
        nation.add( new Nationalite(1,"Canada"));


        return nation;
    }

}
