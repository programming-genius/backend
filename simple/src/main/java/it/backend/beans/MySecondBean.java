package it.backend.beans;

public class MySecondBean {
    public MySecondBean(MyBean1 myBean1){
        System.out.println("MySecondBean:"+ myBean1.value());
    }
}
