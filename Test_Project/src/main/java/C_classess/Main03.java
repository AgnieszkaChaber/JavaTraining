package main.java.C_classess;

public class Main03 {
    public static void main(String[] args) {
        Person person = new Person();
        String personName = person.name;
        String personSurname = person.surname;
        int personAge = person.age;
        char personGender = person.gender;
        System.out.println("Name: " + personName);
        System.out.println("Surname: " + personSurname);
        System.out.println("Age: " + personAge);
        System.out.println("Gender: " + personGender);
    }
}
