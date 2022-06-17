package com.company;

public class Student extends Man {
    private int yearOfStudy;

    public Student(String name, String gender, int age, double weight, int yearOfStudy) { //конструктор з параметрами
        super(name, gender, age, weight); //super вказує на базовий клас.
        this.yearOfStudy = yearOfStudy;
    }

    public Student(){} //пустий конструктор

    public Student(Student student){ //конструктор копіювання
        this.yearOfStudy = student.getYearOfStudy();;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        if(yearOfStudy >= 0 || yearOfStudy <= 12){
            this.yearOfStudy = yearOfStudy;
        }
        else {
            System.out.println("Увага: значення не може бути від'ємним.");
            System.exit(0);
        }
    }

    public void increaseYearOfStudy() {
        yearOfStudy++;
    }

    @Override
    public String toString() {
        return "Student{" +
                "yearOfStudy=" + yearOfStudy + ", " + "name=" + ", " +
                super.getName()  + ", " + "gender=" + super.getGender()  + ", " + "age=" + super.getAge()  + ", " + "weight=" +  super.getWeight() +
                '}';
    }
}
