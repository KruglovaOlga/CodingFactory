package gr.aueb.cf.ch3;

/**
 *υπολογίζει 1+ 2 + 3 +...+ 10
 */
public class Sum10App {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (i <= 10) {
            sum = sum + i; //sum += i
            i++;
        }
        System.out.println("sum = " + sum);

    }
}
