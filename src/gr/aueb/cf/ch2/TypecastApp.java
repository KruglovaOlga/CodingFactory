package gr.aueb.cf.ch2;

public class TypecastApp {
    public static void main(String[] args) {
        long myLong1 = 10L;
        long myLong2 = 20;
        int result;

        result = (int) (myLong1 + myLong2);

        int myInt1 = 10;
        int myInt2 = 20;
        long longResult;

        longResult = myInt1 + myInt2;

    }
}
