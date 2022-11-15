package gr.aueb.cf.ch5;

public class FibonacciApp {

    public static void main(String[] args) {

    }

    public static int fibo(int n) {
        if (n < 0) {
            System.out.println("invalid n");
            return -1;
        }

        if (n == 0) return 0;
        if (n == 1) return 1;

        return fibo(n - 1) + (n - 2);
    }
}
