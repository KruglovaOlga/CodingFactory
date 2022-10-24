package gr.aueb.cf.ch2;

/**
 * Int Expression Demo
 */
public class ExpressionApp {
    public static void main(String[] args) {
        //Δήλωση και αρχικοποίησητων μεταβλητών
        int num1 = 12;
        int num2 = 5;
        int sum = 0;
        int sub = 0;
        int div = 0;
        int mul = 0;
        int mod = 0;

        int result1 = 0;
        int result2 = 0;
        int result3 = 0;
        int result4 = 0;

        //Εντολές
        sum = num1 + num2;
        sub = num1 - num2;
        div = num1 / num2;
        mul = num1 * num2;
        mod = num1 % num2;

        result1 = num1++;//Πρώτα η εκχώρηση και μετά το ++
        result2 = ++num1; //Πρώτα το ++ και μετά η εκχώρηση
        //result3 = result3 + num1
        result3 += num1;

        result4 = (num1 + num2) * ((num1/2) / (num1 % 5));
        System.out.printf("sum: %d\t, sub: %d\t, div: %d\t, mul: %d\t, mod: %d\n",
                sum, sub, div, mul, mod);
        System.out.printf("result1: %d\t, result2: %d\t, result3: %d\t, result4: %d\n",
                result1, result2, result3, result4);
    }
}
