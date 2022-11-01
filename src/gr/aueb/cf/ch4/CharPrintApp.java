package gr.aueb.cf.ch4;

public class CharPrintApp {

    public static void main(String[] args) {
        char ch1 = 'r';
        char ch2 = '!';

        System.out.println("char: " + ch1 + ", ordinal value: " + (int) ch1);
        System.out.println("char: " + ch2 + ", ordinal value: " + (int) ch2);

        System.out.printf("char: %c, ordinal value: %d\n", ch1, (int) ch1 );
        System.out.printf("char: %c, ordinal value: %d\n", ch2, (int) ch2);

    }
}
