package com.startJava.dog;

public class Dog {
    private String name;
    private int age;
    private String gender;
    private float weight;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void bark() {
        System.out.println("bark bark bark");
    }

    public void sleep() {
        System.out.println("Zzzz...");
    }

    public void eat(String nameFood) {
        if (nameFood == "Whiskas") {
            System.out.println("r-r-r-r-r-");
        } else if (nameFood == "bread") {
            bark();
        } else if (nameFood == "Chappi") {
            bark();
            bark();
            bark();
        }
    }
}