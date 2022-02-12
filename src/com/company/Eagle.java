package com.company;

public class Eagle extends Animal{
    public void fly(){
        String string = (this.getClass().getName());
        System.out.println(string.substring(12)+" flies");
    }
}
