package com.example.ooproject;

public class Insan extends Musician {

    String isim,soyisim;
    int age;

    public Insan(String mahlas, String sarki, int deneyim) {
        super(mahlas, sarki, deneyim);
    }

    /*
    public Insan(String isim,String soyisim,int age){
    this.isim=isim;
    this.soyisim=soyisim;
    this.age=age;
    }*/

    public String meslekSoyle(){
        return "I'm a trapper";
    }

}
