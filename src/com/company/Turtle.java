package com.company;

public class Turtle extends Animal{
    public void swim(){
        String string = (this.getClass().getName());
        System.out.println(string.substring(12)+" swims");
    }
}
