package gr.aueb.cf.ch7String;

public class StringAccessApp {

    public static void main(String[] args) {
        String cf = "Coding Factory";

        for (int i = 0; i < cf.length(); i++){
            System.out.print(cf.charAt(i) + " ");
        }

        System.out.println();

        //reverse order
        for (int i = cf.length() - 1; i >= 0; i--) {
            System.out.print(cf.charAt(i) + " ");
        }
    }
}
