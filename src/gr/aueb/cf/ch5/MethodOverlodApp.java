package gr.aueb.cf.ch5;

/**
 * demonstrates the usage of method overloading
 * same name, different parameters
 */
public class MethodOverlodApp {

    public static void main(String[] args) {
        int a = 5;
        int sum2 = 0;
        int sum1 = 0;
        long sum3 = 0;
        long sum4 = 0L;

        sum1 =add(1, 2);
        sum3 = add(1L, 2L);
        sum2 = add(1, 2, 12);
        sum4 = add(1, 2, 12L);

        System.out.printf("sum1: %d, sum2: %d, sum3: %d, sum4: %d", sum1, sum2, sum3, sum4);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static long add(long a, long b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static long add(int a, int b, long c) {
        return a + b + c;
    }


}
