package gr.aueb.cf.ch5;

public class FloatRoundingProblemApp {

    public static void main(String[] args) {
        double actual = 0.0;
        double expected = 1.0;

        for(int i = 1; i<= 10; i++) {
            actual+= 0.1;
        }
        System.out.printf("%.20f\n", actual);

        if (actual == expected) {
            System.out.println("EQUAL");
        } else {
            System.out.println("NOT EQUAL");
        }
    }
}
