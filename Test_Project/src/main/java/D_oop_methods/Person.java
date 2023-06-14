package main.java.D_oop_methods;

public class Person {
    private String name = "John";
    private String surname = "Smith";
    private int age = 75;
    private char gender = 'M';

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFullName() {
        return name + " " + surname;
    }

    public void increaseAge(){
        age++;
    }

    public int getAge(){
        return age;
    }
}
