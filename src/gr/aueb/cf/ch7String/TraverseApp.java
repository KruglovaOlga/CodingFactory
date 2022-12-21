package gr.aueb.cf.ch7String;

public class TraverseApp {
    public static void main(String[] args) {
        String firstname = " olga ";
        String cf = "Coding Factory";

        for (int i = 0; i < firstname.length(); i++){
            System.out.print(firstname.charAt(i) + " ");
        }

        System.out.println("\u2764");

        for (char ch : cf.toCharArray()) {
            System.out.print(ch + " ");
        }
        System.out.println("\u2764");

        //reverse traverse
        for (int i = cf.length() - 1; i >= 0; i--) {
            System.out.print(cf.charAt(i) + " ");
        }
    }
}
