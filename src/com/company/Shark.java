package com.company;

public class Shark extends Animal{
    public void attack(){
        String string = (this.getClass().getName());
        System.out.println(string.substring(12)+" attacks");
    }
}

