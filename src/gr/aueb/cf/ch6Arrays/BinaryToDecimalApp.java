package gr.aueb.cf.ch6Arrays;

public class BinaryToDecimalApp {

    public static void main(String[] args) throws IllegalAccessException {
        int[] vector = { 0,0,0,0,1,1,1,0};
        int decimal = binaryToDecimal(vector);
        System.out.println("value: " + decimal);
    }

    public static int binaryToDecimal(int[] binaryVector) throws IllegalAccessException {
        int decimal = 0 ;
        int n;      //length

        if (binaryVector == null) {
            throw new IllegalAccessException();
        }

        n = binaryVector.length;
        for (int i = n - 1; i >= 0; i--) {
            decimal = decimal + binaryVector[i] * (int)Math.pow(2, n -1 - i);
        }
        return decimal;
    }
}
