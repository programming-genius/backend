package it.backend.beans;

import java.util.Random;

public class MyBean1 {

    private int value;
    private String name;

    public MyBean1(String name){
        Random rnd = new Random();
        value = rnd.nextInt();
        this.name = name;
        System.out.println(name+":"+value);
    }

    public int value(){
        return value;
    }
}
