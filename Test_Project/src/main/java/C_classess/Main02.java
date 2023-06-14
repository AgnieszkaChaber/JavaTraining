package main.java.C_classess;

public class Main02 {
    public static void main(String[] args) {
        Cat myCat = new Cat("Kitty", "meow", 5);
        System.out.println("Here is " + myCat.name);
        System.out.println(myCat.name + " makes " + myCat.sound + " " + myCat.sound);
        System.out.println(myCat.name + " is " + myCat.age + " years old");

        Dog myDog = new Dog("Barry", "woof", 10);
        System.out.println("Here is " + myDog.name);
        System.out.println(myDog.name + " makes " + myDog.sound + " " + myDog.sound);
        System.out.println(myDog.name + " is " + myDog.age + " years old");

    }
}
