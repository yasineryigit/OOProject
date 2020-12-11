package com.example.ooproject;

public class User extends People {

    //Property
    String name,job;

    //Constructor
    public User(String name, String job){
        this.name=name;
        this.job=job;

        System.out.println(name + " oluşturuldu");
    }
}
