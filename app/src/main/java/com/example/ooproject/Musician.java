package com.example.ooproject;

public class Musician {

    //property
    private String mahlas,sarki;
    private int deneyim;



    //constructor
    public Musician(String mahlas, String sarki, int deneyim){
        this.mahlas=mahlas;
        this.sarki=sarki;
        this.deneyim=deneyim;
    }

    public String getMahlas() {
        return mahlas;
    }

    public void setMahlas(String mahlas, int password) {
        if(password==123){
            System.out.println("Password accepted");
            this.mahlas = mahlas;
        }else{
            System.out.println("Password denied!");
        }

    }

    public String getSarki() {
        return sarki;
    }

    public void setSarki(String sarki) {
        this.sarki = sarki;
    }

    public int getDeneyim() {
        return deneyim;
    }

    public void setDeneyim(int deneyim) {
        this.deneyim = deneyim;
    }
}
