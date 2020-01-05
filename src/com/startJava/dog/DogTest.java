package com.startJava.dog;
public class DogTest {

    public static void main(String[] args) {
        Dog tusya = new Dog();
        tusya.setName("Туся");
        tusya.setAge(2);
        tusya.setColor("black");

        tusya.eat("bread");
        tusya.eat("Whiskas");
        tusya.eat("Chappi");

        System.out.println("мою собаку зовут " + tusya.getName());

    }
}

