package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	/*
	Animal деген класс тузунуз жана бир метод кошунуз.
    Анын 3 наследнигин тузунуз.
    Shark деген класска attack(), Turtle деген класска swim() жана Eagle деген класска fly() методторун тузосуз.
    Animal тибин колдонуп массив тузунуз жана ал жакка анын наследниктерин кошунуз.
    instanceOf жана getClass()-ты колдонуп Animal массивиндеги жаныбарлардын оздорунун методдорун чыгарыныз.
    Ар бир объект учун оз озунчо массив тузуп Animal массивиндеги жаныбарларды болуп оз озунун массивине салыныз
	 */

        Animal[] animals = {new Shark(),new Turtle(),new Eagle()};
        for (Animal animal:animals) {
            if (animal instanceof Shark) {
                ((Shark) animal).attack();
            } else if (animal instanceof Turtle) {
                ((Turtle) animal).swim();
            } else if (animal instanceof Eagle) {
                ((Eagle) animal).fly();
            }
        }
            Shark[] sharks = new Shark[animals.length];
            Turtle[] turtles = new Turtle[animals.length];
            Eagle[] eagles = new Eagle[animals.length];

        for (Animal value:animals) {
            if(value instanceof Shark){
                sharks[0] = new Shark();
            }else if(value instanceof Turtle){
                turtles[0] = new Turtle();
            }else if(value instanceof Eagle){
                eagles[0] = new Eagle();
            }
        }
        System.out.println(sharks[0].getClass().getName());
        System.out.println(turtles[0].getClass().getName());
        System.out.println(eagles[0].getClass().getName());
    }
}
