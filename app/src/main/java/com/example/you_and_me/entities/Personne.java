package com.example.you_and_me.entities;

import android.os.Parcel;
import android.os.Parcelable;

public class Personne implements Parcelable {

    private String last_name;
    private String first_name;
    private String sexe;
    private Nationalite nationalite;

    public static final Creator<Personne> CREATOR = new Creator<Personne>() {
        @Override
        public Personne createFromParcel(Parcel in) {
            return new Personne(in);
        }

        @Override
        public Personne[] newArray(int size) {
            return new Personne[size];
        }
    };

    public String getLast_name() {
        return last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public Nationalite getNationalite() {
        return nationalite;
    }

    public void setNationalite(Nationalite nationalite) {
        this.nationalite = nationalite;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Personne(String last_name, String first_name, String sexe, Nationalite nationalite) {
        this.last_name = last_name;
        this.first_name = first_name;
        this.sexe = sexe;
        this.nationalite = nationalite;
    }
    public Personne() {
        this.last_name = "";
        this.first_name = "";
        this.sexe = "";
        this.nationalite = new Nationalite();
    }

    public Personne(Parcel parcel) {
            this.last_name = parcel.readString();
            this.first_name = parcel.readString();
            this.sexe = parcel.readString();
            this.nationalite = parcel.readParcelable(Nationalite.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.getLast_name());
        parcel.writeString(this.getFirst_name());
        parcel.writeString(this.getSexe());
        parcel.writeParcelable((Parcelable) this.getNationalite(),i);
    }

    public String toString(){
        return "Nom: "+this.getLast_name()+
                "\nPrénom: "+this.getFirst_name()+
                "\nSexe: "+this.getSexe()+"" +
                "\nNationnalité: "+this.getNationalite().getLibelle();
    }
}
