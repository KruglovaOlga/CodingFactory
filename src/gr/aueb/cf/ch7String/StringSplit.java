package gr.aueb.cf.ch7String;

public class StringSplit {

    public static void main(String[] args) {
        String s = "Athens   University of Economics and Business  ";
        String[] tokens = s.split(" ");

        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
