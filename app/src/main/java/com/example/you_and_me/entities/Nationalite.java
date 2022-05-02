package com.example.you_and_me.entities;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

public class Nationalite implements Parcelable {

    private  int indicatif;
    private String libelle;

    protected Nationalite(Parcel in) {
        indicatif = in.readInt();
        libelle = in.readString();
    }

    public static final Creator<Nationalite> CREATOR = new Creator<Nationalite>() {
        @Override
        public Nationalite createFromParcel(Parcel in) {
            return new Nationalite(in);
        }

        @Override
        public Nationalite[] newArray(int size) {
            return new Nationalite[size];
        }
    };

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
    public Nationalite() {
        this.indicatif = 0;
        this.libelle = "";
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(indicatif);
        parcel.writeString(libelle);
    }
}
