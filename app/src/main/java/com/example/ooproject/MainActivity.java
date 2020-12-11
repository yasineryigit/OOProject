package com.example.ooproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import static com.example.ooproject.HouseDecor.roomName;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        User user1 = new User();
        user1.name="Yasin";
        user1.job="Entrepreneur";

        User user2 = new User();
        user2.name="Ayşe";
        user2.job="Psychologist";


        User user1= new User("Yasin","Entrepreneur");
        User user2 = new User("Ayşe","Psychologis");

        //System.out.println(user2.name);

        Musician musician1= new Musician("Ceg","First class",16);
        musician1.setMahlas("Jagged",123);
        System.out.println(musician1.getMahlas());

        //Inheritance
        Insan i1 = new Insan("Joker","Karıştır kartları",21);
        System.out.println(i1.meslekSoyle());

        //Polymorphism
        //-Static polymorphism
        Mathematics m = new Mathematics();
        System.out.println(m.sum());
        System.out.println(m.sum(10,10));
        System.out.println(m.sum(10,10,10));

        //-Dynamic polymorphism
        Animal a = new Animal();
        a.sing();

        Dog d = new Dog();
        d.test();
        d.sing();
        */

        User user1 = new User("Ayşe", "Psychologis");
        System.out.println(user1.information());

        Piano p = new Piano();
        p.brand="KORG";
        p.used=true;









    }
}
