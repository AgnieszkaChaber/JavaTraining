package main.java.C_classess;

public class Main01 {
    public static void main(String[] args) {
        AccessModifiers testAttribute = new AccessModifiers();
        testAttribute.publicAttribute = "Public Value"; // Dostęp do atrybutu publicAttribute
        //testAttribute.privateAttribute = "Private Value";
        // Błąd kompilacji: privateAttribute jest niedostępny poza klasą AccessModifiers
        // testAttribute.protectedAttribute = "Protected Value";
        // Błąd kompilacji: protectedAttribute jest niedostępny poza klasą AccessModifiers

        System.out.println("Public Attribute: " + testAttribute.publicAttribute);
        // System.out.println("Private Attribute: " + testAttribute.privateAttribute);
        // Błąd kompilacji: privateAttribute jest niedostępny poza klasą AccessModifiers
        // System.out.println("Protected Attribute: " + testAttribute.protectedAttribute);
        // Błąd kompilacji: protectedAttribute jest niedostępny poza klasą AccessModifiers

    }
}
