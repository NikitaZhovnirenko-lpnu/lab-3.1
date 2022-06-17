package com.company;

import Strings.Genders;

public class Man {

    private String name;
    private String gender;
    private int age;
    private double weight;


    public Man(String name, String gender, int age, double weight) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
    }

    public Man(){}

    public Man(Man man){
        this.name = man.getName();
        this.weight = man.weight;
        this.gender = man.getGender();
        this.age = man.age;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        for (int i = 0; i < Genders.FORBIDDEN_SYMBOLS.length; i++) {
            if (name.contains(Character.toString(Genders.FORBIDDEN_SYMBOLS[i]))){
                System.out.println("Ім'я містить заборонені символи.");
                System.exit(0);
            }
        }
        this.name = name.toUpperCase().trim();
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        for (int i = 0; i < Genders.FORBIDDEN_SYMBOLS.length; i++) {
            if (gender.contains(Character.toString(Genders.FORBIDDEN_SYMBOLS[i]))){
                System.out.println("Стать містить заборонені символи.");
                System.exit(0);
            }
        }
        this.gender = gender.toUpperCase().trim();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 5 || age <= 120)
        this.age = age;
        else
            System.out.println("Некоректний вік.");
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0)
            this.weight = weight;
        else
            System.out.println("Некоректна вага.");
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
