package gr.aueb.cf.ch5;

public class FloatingPointApp {

    public static void main(String[] args) {
        System.out.printf("Type: %s, size: %d min: %.2e, max: %.2e\n", Float.TYPE, Float.SIZE, Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("Type: %s, size: %d min: %e, max: %e\n", Double.TYPE, Double.SIZE, Double.MIN_VALUE, Double.MAX_VALUE);
    }
}
