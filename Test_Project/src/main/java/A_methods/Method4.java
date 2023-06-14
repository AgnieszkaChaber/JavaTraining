package main.java.A_methods;

public class Method4 {

    public static String createName (String name, String surname, String nickname){
        String newName = name + " " + surname + " " + nickname;
        return newName;
    }

    public static void main(String[] args) {
        String testName = "Lena";
        String testSurname = "Kowalska";
        String testNickname = "NEL";
        String check = createName(testName, testSurname, testNickname);
        System.out.println(check);
    }
}
