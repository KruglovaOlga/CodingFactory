package gr.aueb.cf.ch7;



public class LowerUpperTrimApp {

    public static void main(String[] args) {
        String s = "   Athens University of Economics and Business  ";
        String lowercase = "";
        String uppercase = "";
        String trimmed = "";

        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.trim());
    }
}
