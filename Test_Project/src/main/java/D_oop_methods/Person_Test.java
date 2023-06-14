package main.java.D_oop_methods;

public class Person_Test {
    public static void main(String[] args) {
        Person testPerson = new Person();
        testPerson.setName("Bob");
        testPerson.setSurname("Ross");
        testPerson.setAge(45);
        testPerson.setGender('M');
        System.out.println(testPerson.getFullName());
        System.out.println("Initial Age: " + testPerson.getAge());
        testPerson.increaseAge();
        System.out.println("Age after increase: " + testPerson.getAge());
    }
}
