package it.backend.beans;

import java.util.Random;

public class MyBean2 {

    int value;

    public MyBean2(){
        Random rnd = new Random();
        System.out.println("My bean2");
        value = rnd.nextInt();
    }

    public int value(){
        return value;
    }
}
